package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class GerenciamentoDePedidosTest {
    private Estoque estoque;
    private GerenciamentoDePedidos gerenciamentoDePedidos;
    private Produto produto1;
    private Produto produto2;

    @Before
    public void setUp() {
        // Reiniciar a instância de Estoque
        estoque = Estoque.getInstancia();

        // Limpar produtos do estoque
        List<Produto> produtosParaRemover = new ArrayList<>(estoque.listarProdutos().keySet());
        for (Produto produto : produtosParaRemover) {
            estoque.removerProduto(produto, estoque.getQuantidadeProduto(produto));
        }

        // Adicionar novos produtos
        produto1 = new Eletronico("Laptop", 1000.00, "Laptop de última geração");
        produto2 = new Roupa("Camiseta", 50.00, "Camiseta de algodão");
        estoque.adicionarProduto(produto1, 10);
        estoque.adicionarProduto(produto2, 20);

        // Reiniciar e obter instância de GerenciamentoDePedidos
        GerenciamentoDePedidos.resetInstancia();
        gerenciamentoDePedidos = GerenciamentoDePedidos.getInstancia();
        
    }

    @Test
    public void testCriarPedido() throws IllegalAccessException {
        Cliente user = new Cliente("Teste", "senha");
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(estoque, produto1, 2);
        carrinho.adicionarProduto(estoque, produto2, 3);

        Pedido pedido = gerenciamentoDePedidos.criarPedido(carrinho, estoque, user);

        assertNotNull(pedido);
        assertEquals(true, gerenciamentoDePedidos.listarPedidos().hasNext());
        assertEquals(pedido, gerenciamentoDePedidos.listarPedidos().next());
        assertEquals(Pedido.NOVO, pedido.getEstado());

        Iterator<Map.Entry<Produto, Integer>> iterator = pedido.listarItens();
        while (iterator.hasNext()) {
            Map.Entry<Produto, Integer> entry = iterator.next();
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();

            if (produto.equals(produto1)) {
                assertEquals(2, quantidade);
            } else if (produto.equals(produto2)) {
                assertEquals(3, quantidade);
            } else {
                assertTrue("Produto desconhecido encontrado no pedido", false);
            }
        }

        assertEquals(8, estoque.getQuantidadeProduto(produto1));
        assertEquals(17, estoque.getQuantidadeProduto(produto2));
    }

    @Test
    public void testListarPedidos() throws IllegalAccessException {
        Cliente user = new Cliente("Teste", "senha");
        Carrinho carrinho1 = new Carrinho();
        carrinho1.adicionarProduto(estoque, produto1, 2);
        carrinho1.adicionarProduto(estoque, produto2, 3);
        Pedido pedido1 = gerenciamentoDePedidos.criarPedido(carrinho1, estoque, user);

        Carrinho carrinho2 = new Carrinho();
        carrinho2.adicionarProduto(estoque, produto2, 3);
        Pedido pedido2 = gerenciamentoDePedidos.criarPedido(carrinho2, estoque,user);
        Iterator iterator = gerenciamentoDePedidos.listarPedidos();
        
        assertEquals(true, iterator.hasNext());
        assertEquals(pedido1, iterator.next());
        assertEquals(true, iterator.hasNext());
        assertEquals(pedido2, iterator.next());
    }

    @Test
    public void testFinalizarPedido() throws IllegalAccessException {
        Cliente user = new Cliente("Teste", "senha");
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(estoque, produto1, 2);
        carrinho.adicionarProduto(estoque, produto2, 3);

        Pedido pedido = gerenciamentoDePedidos.criarPedido(carrinho, estoque, user);
        gerenciamentoDePedidos.avancarPedido(pedido);

        assertEquals(Pedido.ENTREGUE, pedido.getEstado());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFinalizarPedidoJaFinalizado() throws IllegalAccessException {
        Cliente user = new Cliente("Teste", "senha");
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(estoque, produto1, 2);
        carrinho.adicionarProduto(estoque, produto2, 3);

        Pedido pedido = gerenciamentoDePedidos.criarPedido(carrinho, estoque, user);
        gerenciamentoDePedidos.avancarPedido(pedido);
        gerenciamentoDePedidos.avancarPedido(pedido); // Deve lançar exceção
    }
}
