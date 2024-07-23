package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EstoqueTest {

    private Estoque estoque;
    private Produto produto1;
    private Produto produto2;

    @Before
    public void setUp() {
        estoque = Estoque.getInstancia();
        produto1 = new Eletronico("Smartphone", 1200.0, "Um smartphone de última geração");
        produto2 = new Roupa("Camiseta", 50.0, "Uma camiseta de algodão");

        // Limpar o estoque antes de cada teste
        List<Produto> produtosParaRemover = new ArrayList<>(estoque.listarProdutos().keySet());
        for (Produto produto : produtosParaRemover) {
            estoque.removerProduto(produto, estoque.getQuantidadeProduto(produto));
        }
    }

    @Test
    public void testAdicionarProduto() {
        estoque.adicionarProduto(produto1, 10);
        assertEquals(10, estoque.getQuantidadeProduto(produto1));

        estoque.adicionarProduto(produto1, 5);
        assertEquals(15, estoque.getQuantidadeProduto(produto1));
    }

    @Test
    public void testRemoverProduto() {
        estoque.adicionarProduto(produto1, 10);
        estoque.removerProduto(produto1, 5);
        assertEquals(5, estoque.getQuantidadeProduto(produto1));

        estoque.removerProduto(produto1, 5);
        assertEquals(0, estoque.getQuantidadeProduto(produto1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoverProdutoQuantidadeInsuficiente() {
        estoque.adicionarProduto(produto1, 5);
        estoque.removerProduto(produto1, 10); // Deve lançar uma exceção
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoverProdutoNaoExistente() {
        estoque.removerProduto(produto1, 5); // Deve lançar uma exceção
    }

    @Test
    public void testGetQuantidadeProduto() {
        estoque.adicionarProduto(produto1, 10);
        assertEquals(10, estoque.getQuantidadeProduto(produto1));

        estoque.adicionarProduto(produto2, 20);
        assertEquals(20, estoque.getQuantidadeProduto(produto2));
    }

    @Test
    public void testListarProdutos() {
        estoque.adicionarProduto(produto1, 10);
        estoque.adicionarProduto(produto2, 20);

        Map<Produto, Integer> produtos = estoque.listarProdutos();
        assertTrue(produtos.containsKey(produto1));
        assertTrue(produtos.containsKey(produto2));
        assertEquals(10, produtos.get(produto1).intValue());
        assertEquals(20, produtos.get(produto2).intValue());
    }
}
