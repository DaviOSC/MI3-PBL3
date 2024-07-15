package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ClienteTest {
    private Estoque estoque;
    private Cliente cliente;
    private Produto produto1;
    private Produto produto2;
    private GerenciamentoDePedidos gerenciamentoDePedidos;

    @Before
    public void setUp() {
        
        estoque = Estoque.getInstancia(); // Get a new instance
        gerenciamentoDePedidos = GerenciamentoDePedidos.getInstancia();
        GerenciamentoDePedidos.resetInstancia(); // Reset the singleton instance
        gerenciamentoDePedidos = GerenciamentoDePedidos.getInstancia(); // Get a new instance

        produto1 = new Eletronico("Laptop", 1000.00, "Laptop de última geração");
        produto2 = new Roupa("Camiseta", 50.00, "Camiseta de algodão");
        List<Produto> produtosParaRemover = new ArrayList<>(estoque.listarProdutos().keySet());
        for (Produto produto : produtosParaRemover) {
            estoque.removerProduto(produto, estoque.getQuantidadeProduto(produto));
        }

        estoque.adicionarProduto(produto1, 10);
        estoque.adicionarProduto(produto2, 20);
        

        cliente = new Cliente("João", "senha123");
    }

    @Test
    public void testAdicionarProdutoAoCarrinho() {
        cliente.adicionarProdutoAoCarrinho(estoque, produto1, 2);
        assertEquals(2, cliente.getCarrinho().getQuantidadeProduto(produto1));
        assertEquals(8, estoque.getQuantidadeProduto(produto1));
    }

    @Test
    public void testAdicionarProdutoAoCarrinhoQuantidadeInsuficiente() {
        assertThrows(IllegalArgumentException.class, () -> {
            cliente.adicionarProdutoAoCarrinho(estoque, produto1, 15);
        });
    }

    @Test
    public void testRemoverProdutoDoCarrinho() {
        cliente.adicionarProdutoAoCarrinho(estoque, produto1, 2);
        cliente.removerProdutoDoCarrinho(estoque, produto1, 1);
        assertEquals(1, cliente.getCarrinho().getQuantidadeProduto(produto1));
        assertEquals(9, estoque.getQuantidadeProduto(produto1));
    }

    @Test
    public void testRemoverProdutoDoCarrinhoQuantidadeInsuficiente() {
        cliente.adicionarProdutoAoCarrinho(estoque, produto1, 2);
        assertThrows(IllegalArgumentException.class, () -> {
            cliente.removerProdutoDoCarrinho(estoque, produto1, 3);
        });
    }

    @Test
    public void testCriarPedido() {
        cliente.adicionarProdutoAoCarrinho(estoque, produto1, 2);
        cliente.adicionarProdutoAoCarrinho(estoque, produto2, 3);
        cliente.criarPedido(gerenciamentoDePedidos, estoque);
        Pedido pedido = cliente.getPedido();
        assertNotNull(pedido);
        assertEquals(8, estoque.getQuantidadeProduto(produto1));
        assertEquals(17, estoque.getQuantidadeProduto(produto2));
        assertEquals(Pedido.NOVO, pedido.getEstado());
    }

    @Test
    public void testCriarPedidoCarrinhoVazio() {
        cliente.criarPedido(gerenciamentoDePedidos, estoque);
        assertNull(cliente.getPedido());
    }

    @Test
    public void testFinalizarPedido() {
        cliente.adicionarProdutoAoCarrinho(estoque, produto1, 2);
        cliente.adicionarProdutoAoCarrinho(estoque, produto2, 3);
        cliente.criarPedido(gerenciamentoDePedidos, estoque);
        cliente.finalizarPedido(gerenciamentoDePedidos, estoque);
        Pedido pedido = cliente.getPedido();
        assertEquals(Pedido.ENTREGUE, pedido.getEstado());
    }

    @Test
    public void testPedidoEnviado() {
        cliente.adicionarProdutoAoCarrinho(estoque, produto1, 2);
        cliente.adicionarProdutoAoCarrinho(estoque, produto2, 3);
        cliente.criarPedido(gerenciamentoDePedidos, estoque);
        Pedido pedido = cliente.getPedido();
        cliente.pedidoEnviado(pedido);
        assertEquals(2, pedido.getEstado());
    }

    @Test
    public void testPedidoEntregue() {
        cliente.adicionarProdutoAoCarrinho(estoque, produto1, 2);
        cliente.adicionarProdutoAoCarrinho(estoque, produto2, 3);
        cliente.criarPedido(gerenciamentoDePedidos, estoque);
        Pedido pedido = cliente.getPedido();
        cliente.pedidoEntregue(pedido);
        assertEquals(3, pedido.getEstado());
    }
}
