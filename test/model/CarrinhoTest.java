package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class CarrinhoTest {
    private Estoque estoque;
    private Carrinho carrinho;
    private Produto produto1;
    private Produto produto2;

    @Before
    public void setUp() {
        estoque = Estoque.getInstancia();
        List<Produto> produtosParaRemover = new ArrayList<>(estoque.listarProdutos().keySet());
        for (Produto produto : produtosParaRemover) {
            estoque.removerProduto(produto, estoque.getQuantidadeProduto(produto));
        }
        estoque = Estoque.getInstancia();  // Get a new instance
        
        produto1 = new Eletronico("Laptop", 1000.00, "Laptop de última geração");
        produto2 = new Roupa("Camiseta", 50.00, "Camiseta de algodão");

        estoque.adicionarProduto(produto1, 10);
        estoque.adicionarProduto(produto2, 20);

        carrinho = new Carrinho();
    }

    @Test
    public void testAdicionarProduto() {
        carrinho.adicionarProduto(estoque, produto1, 2);
        assertEquals(2, carrinho.getQuantidadeProduto(produto1));
        assertEquals(8, estoque.getQuantidadeProduto(produto1));
    }

    @Test
    public void testAdicionarProdutoQuantidadeInsuficiente() {
        assertThrows(IllegalArgumentException.class, () -> {
            carrinho.adicionarProduto(estoque, produto1, 15);
        });
    }

    @Test
    public void testAdicionarProdutoQuantidadeZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            carrinho.adicionarProduto(estoque, produto1, 0);
        });
    }

    @Test
    public void testRemoverProduto() {
        carrinho.adicionarProduto(estoque, produto1, 2);
        carrinho.removerProduto(estoque, produto1, 1);
        assertEquals(1, carrinho.getQuantidadeProduto(produto1));
        assertEquals(9, estoque.getQuantidadeProduto(produto1));
    }

    @Test
    public void testRemoverProdutoQuantidadeInsuficiente() {
        carrinho.adicionarProduto(estoque, produto1, 2);
        assertThrows(IllegalArgumentException.class, () -> {
            carrinho.removerProduto(estoque, produto1, 3);
        });
    }

    @Test
    public void testRemoverProdutoNaoExistente() {
        assertThrows(IllegalArgumentException.class, () -> {
            carrinho.removerProduto(estoque, produto1, 1);
        });
    }

    @Test
    public void testGetQuantidadeProduto() {
        carrinho.adicionarProduto(estoque, produto1, 2);
        assertEquals(2, carrinho.getQuantidadeProduto(produto1));
        assertEquals(0, carrinho.getQuantidadeProduto(produto2));
    }

    @Test
    public void testGetPrecoTotal() {
        carrinho.adicionarProduto(estoque, produto1, 2);
        carrinho.adicionarProduto(estoque, produto2, 3);
        assertEquals(2150.00, carrinho.getPrecoTotal(), 0.01);
    }

    @Test
    public void testListarProdutos() {
        carrinho.adicionarProduto(estoque, produto1, 2);
        carrinho.adicionarProduto(estoque, produto2, 3);
        Map<Produto, Integer> produtos = carrinho.listaProdutos();

        assertEquals(2, produtos.size());
        assertTrue(produtos.containsKey(produto1));
        assertTrue(produtos.containsKey(produto2));
        assertEquals(2, (int) produtos.get(produto1));
        assertEquals(3, (int) produtos.get(produto2));
    }
}
