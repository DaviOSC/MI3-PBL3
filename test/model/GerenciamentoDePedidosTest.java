package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class GerenciamentoDePedidosTest {
    private Estoque estoque;
    private Carrinho carrinho;
    private Produto produto1;
    private Produto produto2;
    private GerenciamentoDePedidos gerenciamentoDePedidos;

    @Before
    public void setUp() {
        estoque = Estoque.getInstancia();
        estoque.adicionarProduto(produto1 = new Eletronico("Laptop", 1000.00, "Laptop de última geração"), 10);
        estoque.adicionarProduto(produto2 = new Roupa("Camiseta", 50.00, "Camiseta de algodão"), 20);
        
        carrinho = new Carrinho(estoque);
        gerenciamentoDePedidos = GerenciamentoDePedidos.getInstancia();
    }

    @Test
    public void testCriarPedido() {
        carrinho.adicionarProduto(produto1, 2);
        carrinho.adicionarProduto(produto2, 3);

        Pedido pedido = gerenciamentoDePedidos.criarPedido(carrinho, estoque);

        assertNotNull(pedido);
        System.out.println(gerenciamentoDePedidos.listarPedidos().toString());
        assertEquals(1, gerenciamentoDePedidos.listarPedidos().size());
        assertEquals(pedido, gerenciamentoDePedidos.listarPedidos().get(0));
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
    public void testListarPedidos() {
        carrinho.adicionarProduto(produto1, 2);
        Pedido pedido1 = gerenciamentoDePedidos.criarPedido(carrinho, estoque);

        carrinho.adicionarProduto(produto2, 3);
        Pedido pedido2 = gerenciamentoDePedidos.criarPedido(carrinho, estoque);

        assertEquals(2, gerenciamentoDePedidos.listarPedidos().size());
        assertEquals(pedido1, gerenciamentoDePedidos.listarPedidos().get(0));
        assertEquals(pedido2, gerenciamentoDePedidos.listarPedidos().get(1));
    }
}
