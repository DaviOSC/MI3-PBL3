package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CarrinhoTest {

    private Estoque estoque;
    private Carrinho carrinho;
    private Produto produto1;
    private Produto produto2;

    @Before
    public void setUp() {
        estoque = Estoque.getInstancia();
        carrinho = new Carrinho(estoque);
        produto1 = new Eletronico("Smartphone", 1200.0, "Um smartphone de última geração");
        produto2 = new Roupa("Camiseta", 50.0, "Uma camiseta de algodão");

        // Limpar o estoque antes de cada teste
        List<Produto> produtosParaRemover = new ArrayList<>(estoque.listarProdutos().keySet());
        for (Produto produto : produtosParaRemover) {
            estoque.removerProduto(produto, estoque.getQuantidadeProduto(produto));
        }

        // Adicionar produtos ao estoque
        estoque.adicionarProduto(produto1, 10);
        estoque.adicionarProduto(produto2, 20);
    }

    @Test
    public void testAdicionarProduto() {
        carrinho.adicionarProduto(produto1, 2);
        assertEquals(2, carrinho.getQuantidadeProduto(produto1));

        carrinho.adicionarProduto(produto1, 3);
        assertEquals(5, carrinho.getQuantidadeProduto(produto1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdicionarProdutoQuantidadeInsuficiente() {
        carrinho.adicionarProduto(produto1, 11); // Deve lançar uma exceção
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdicionarProdutoQuantidadeInvalida() {
        carrinho.adicionarProduto(produto1, -1); // Deve lançar uma exceção
    }

    @Test
    public void testRemoverProduto() {
        carrinho.adicionarProduto(produto1, 5);
        carrinho.removerProduto(produto1, 2);
        assertEquals(3, carrinho.getQuantidadeProduto(produto1));

        carrinho.removerProduto(produto1, 3);
        assertEquals(0, carrinho.getQuantidadeProduto(produto1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoverProdutoQuantidadeInsuficienteNoCarrinho() {
        carrinho.adicionarProduto(produto1, 2);
        carrinho.removerProduto(produto1, 3); // Deve lançar uma exceção
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoverProdutoNaoExistenteNoCarrinho() {
        carrinho.removerProduto(produto1, 1); // Deve lançar uma exceção
    }

    @Test
    public void testGetQuantidadeProduto() {
        carrinho.adicionarProduto(produto1, 3);
        assertEquals(3, carrinho.getQuantidadeProduto(produto1));

        carrinho.adicionarProduto(produto2, 4);
        assertEquals(4, carrinho.getQuantidadeProduto(produto2));
    }

    @Test
    public void testGetPrecoTotal() {
        carrinho.adicionarProduto(produto1, 3); // 3 * 1200.0
        carrinho.adicionarProduto(produto2, 4); // 4 * 50.0
        assertEquals(3600.0 + 200.0, carrinho.getPrecoTotal(), 0.001);
    }

    @Test
    public void testListarProdutos() {
        carrinho.adicionarProduto(produto1, 3);
        carrinho.adicionarProduto(produto2, 4);

        Map<Produto, Integer> produtos = carrinho.listaProdutos();
        assertEquals(2, produtos.size());
        assertTrue(produtos.containsKey(produto1));
        assertTrue(produtos.containsKey(produto2));
        assertEquals(3, produtos.get(produto1).intValue());
        assertEquals(4, produtos.get(produto2).intValue());
    }
}
