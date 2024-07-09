package model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ClienteTest {
    private Estoque estoque;
    private GerenciamentoDePedidos gerenciamentoDePedidos;
    private Cliente cliente;
    private Produto produto1;
    private Produto produto2;

    @Before
    public void setUp() {
        estoque = Estoque.getInstancia();
        gerenciamentoDePedidos.resetInstancia();
        gerenciamentoDePedidos = GerenciamentoDePedidos.getInstancia();

        // Limpar o estoque antes de cada teste
        for (Produto produto : new ArrayList<>(estoque.listarProdutos().keySet())) {
            estoque.removerProduto(produto, estoque.getQuantidadeProduto(produto));
        }

        // Adicionar produtos ao estoque
        produto1 = new Eletronico("Laptop", 1000.00, "Laptop de última geração");
        produto2 = new Roupa("Camiseta", 50.00, "Camiseta de algodão");
        estoque.adicionarProduto(produto1, 10);
        estoque.adicionarProduto(produto2, 20);

        // Inicializar cliente
        cliente = new Cliente("NomeCliente", "Senha123");
    }

    @Test
    public void testCriarCarrinho() {
        cliente.criarCarrinho(gerenciamentoDePedidos, estoque);
        assertNotNull(cliente.getCarrinho());
    }

    @Test
    public void testAdicionarERemoverProdutoAoCarrinho() {
        cliente.criarCarrinho(gerenciamentoDePedidos, estoque);
        cliente.adicionarProdutoAoCarrinho(produto1, 2);
        assertEquals(2, cliente.getCarrinho().getQuantidadeProduto(produto1));

        cliente.removerProdutoDoCarrinho(produto1, 1);
        assertEquals(1, cliente.getCarrinho().getQuantidadeProduto(produto1));
    }

    @Test
    public void testCriarPedido() {
        cliente.criarCarrinho(gerenciamentoDePedidos, estoque);
        cliente.adicionarProdutoAoCarrinho(produto1, 2);
        cliente.adicionarProdutoAoCarrinho(produto2, 3);

        cliente.criarPedido(gerenciamentoDePedidos, estoque);

        assertNotNull(cliente.getPedido());
        assertEquals(1, gerenciamentoDePedidos.listarPedidos().size());
        assertEquals(8, estoque.getQuantidadeProduto(produto1));
        assertEquals(17, estoque.getQuantidadeProduto(produto2));
    }

    @Test
    public void testFinalizarPedido() {
        cliente.criarCarrinho(gerenciamentoDePedidos, estoque);
        cliente.adicionarProdutoAoCarrinho(produto1, 2);
        cliente.adicionarProdutoAoCarrinho(produto2, 3);
        cliente.criarPedido(gerenciamentoDePedidos, estoque);

        cliente.finalizarPedido(gerenciamentoDePedidos, estoque);
        assertEquals(Pedido.ENTREGUE, cliente.getPedido().getEstado());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFinalizarPedidoJaFinalizado() {
        cliente.criarCarrinho(gerenciamentoDePedidos, estoque);
        cliente.adicionarProdutoAoCarrinho(produto1, 2);
        cliente.adicionarProdutoAoCarrinho(produto2, 3);
        cliente.criarPedido(gerenciamentoDePedidos, estoque);

        cliente.finalizarPedido(gerenciamentoDePedidos, estoque);
        cliente.finalizarPedido(gerenciamentoDePedidos, estoque); // Deve lançar exceção
    }

    @Test
    public void testPedidoEnviadoEEntregue() {
        cliente.criarCarrinho(gerenciamentoDePedidos, estoque);
        cliente.adicionarProdutoAoCarrinho(produto1, 2);
        cliente.adicionarProdutoAoCarrinho(produto2, 3);
        cliente.criarPedido(gerenciamentoDePedidos, estoque);

        cliente.pedidoEnviado(cliente.getPedido());
        assertEquals(2, cliente.getPedido().getEstado());

        cliente.pedidoEntregue(cliente.getPedido());
        assertEquals(3, cliente.getPedido().getEstado());
    }
}

