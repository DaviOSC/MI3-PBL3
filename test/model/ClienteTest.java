package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;



public class ClienteTest {
    private Estoque estoque;
    private Cliente cliente;
    private Produto produto1;
    private GerenciamentoDePedidos gerenciamentoDePedidos;

    @Before
    public void setUp() {
        estoque = Estoque.getInstancia();
        
        produto1 = new Eletronico("Laptop", 1000.00, "Laptop de última geração");
        estoque.adicionarProduto(produto1, 50);
        cliente = new Cliente("Cliente1", "senha123");
        gerenciamentoDePedidos = GerenciamentoDePedidos.getInstancia();
    }

    @Test
    public void testAdicionarProdutoAoCarrinho() {
        cliente.adicionarProdutoAoCarrinho(estoque, produto1, 5);
        assertEquals(5, cliente.getCarrinho().getQuantidadeProduto(produto1));
    }

    @Test
    public void testRemoverProdutoDoCarrinho() {
        cliente.adicionarProdutoAoCarrinho(estoque, produto1, 5);
        cliente.removerProdutoDoCarrinho(estoque, produto1, 3);
        assertEquals(2, cliente.getCarrinho().getQuantidadeProduto(produto1));
    }

    @Test
    public void testCriarPedido() throws IllegalAccessException {
        cliente.adicionarProdutoAoCarrinho(estoque, produto1, 5);
        cliente.criarPedido(gerenciamentoDePedidos, estoque);
        assertNotNull(cliente.getPedido());
    }

    @Test
    public void testFinalizarPedido() throws IllegalAccessException {
        cliente.adicionarProdutoAoCarrinho(estoque, produto1, 5);
        cliente.criarPedido(gerenciamentoDePedidos, estoque);
        cliente.avancarPedido(gerenciamentoDePedidos);
        assertEquals(Pedido.ENTREGUE, cliente.getPedido().getEstado());
    }

    @Test
    public void testRealizarPagamentoCartaoCredito() throws IllegalAccessException {
        cliente.cadastrarPagamento("CartaoCredito", new PagamentoCartaoCredito("1234567890123456", "Cliente1", "12/24", "123"));
        cliente.adicionarProdutoAoCarrinho(estoque, produto1, 5);
        cliente.criarPedido(gerenciamentoDePedidos, estoque);
        boolean pagamentoRealizado = cliente.realizarPagamento("CartaoCredito");
        assertTrue(pagamentoRealizado);
    }

    @Test
    public void testRealizarPagamentoPayPal() throws IllegalAccessException {
        cliente.cadastrarPagamento("PayPal", new PagamentoPayPal("cliente1@example.com"));
        cliente.adicionarProdutoAoCarrinho(estoque, produto1, 5);
        cliente.criarPedido(gerenciamentoDePedidos, estoque);
        boolean pagamentoRealizado = cliente.realizarPagamento("PayPal");
        assertTrue(pagamentoRealizado);
    }

    @Test
    public void testRealizarPagamentoTransferenciaBancaria() throws IllegalAccessException {
        cliente.cadastrarPagamento("TransferenciaBancaria", new PagamentoTransferenciaBancaria("12345", "Banco1"));
        cliente.adicionarProdutoAoCarrinho(estoque, produto1, 5);
        cliente.criarPedido(gerenciamentoDePedidos, estoque);
        boolean pagamentoRealizado = cliente.realizarPagamento("TransferenciaBancaria");
        assertTrue(pagamentoRealizado);
    }

    @Test
    public void testAdicionarProdutoComEstoqueInsuficiente() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cliente.adicionarProdutoAoCarrinho(estoque, produto1, 100);
        });
        assertEquals("Quantidade insuficiente em estoque", exception.getMessage());
    }

    @Test
    public void testRemoverProdutoNaoExistenteNoCarrinho() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cliente.removerProdutoDoCarrinho(estoque, produto1, 1);
        });
        assertEquals("Produto não encontrado no carrinho", exception.getMessage());
    }

    @Test
    public void testAdicionarProdutoComQuantidadeZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cliente.adicionarProdutoAoCarrinho(estoque, produto1, 0);
        });
        assertEquals("A quantidade deve ser maior que zero", exception.getMessage());
    }
}
