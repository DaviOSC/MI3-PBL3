package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Iterator;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class PedidoTest {

    private Estoque estoque;
    private Produto produto1;
    private Produto produto2;
    private Carrinho carrinho1;
    private Carrinho carrinho2;

    @Before
    public void setUp() {
        // Configurando os produtos e o estoque
        produto1 = new Eletronico("Smartphone", 1200.0, "Um smartphone de última geração");
        produto2 = new Roupa("Camiseta", 50.0, "Uma camiseta de algodão");

        estoque = Estoque.getInstancia();
        estoque.adicionarProduto(produto1, 10);
        estoque.adicionarProduto(produto2, 20);

        // Configurando os carrinhos
        carrinho1 = new Carrinho(estoque);
        carrinho1.adicionarProduto(produto1, 2);
        carrinho1.adicionarProduto(produto2, 3);

        carrinho2 = new Carrinho(estoque);
        carrinho2.adicionarProduto(produto1, 1);
        carrinho2.adicionarProduto(produto2, 1);
    }

    @Test
    public void testCriarPedido() {
        Pedido pedido1 = new Pedido(carrinho1, estoque);

        // Verifica se o pedido foi criado corretamente
        assertNotNull(pedido1);
        assertEquals(Pedido.NOVO, pedido1.getEstado());

        // Verifica o preço total
        double expectedTotal1 = (produto1.getPreco() * 2) + (produto2.getPreco() * 3);
        assertEquals(expectedTotal1, pedido1.getPrecoTotal(), 0.01);

        // Verifica os itens do pedido
        Iterator<Map.Entry<Produto, Integer>> itensIterator = pedido1.listarItens();
        int itemCount = 0;
        while (itensIterator.hasNext()) {
            itemCount++;
            Map.Entry<Produto, Integer> entry = itensIterator.next();
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();
            if (produto.equals(produto1)) {
                assertEquals(2, quantidade);
            } else if (produto.equals(produto2)) {
                assertEquals(3, quantidade);
            }
        }
        assertEquals(2, itemCount); // Deve haver 2 itens no pedido
    }

    @Test
    public void testCriarDoisPedidosAoMesmoTempo() {
        Pedido pedido1 = new Pedido(carrinho1, estoque);
        Pedido pedido2 = new Pedido(carrinho2, estoque);

        // Verifica se os pedidos foram criados corretamente
        assertNotNull(pedido1);
        assertNotNull(pedido2);

        // Verifica o estado dos pedidos
        assertEquals(Pedido.NOVO, pedido1.getEstado());
        assertEquals(Pedido.NOVO, pedido2.getEstado());

        // Verifica o preço total dos pedidos
        double expectedTotal1 = (produto1.getPreco() * 2) + (produto2.getPreco() * 3);
        double expectedTotal2 = (produto1.getPreco() * 1) + (produto2.getPreco() * 1);
        assertEquals(expectedTotal1, pedido1.getPrecoTotal(), 0.01);
        assertEquals(expectedTotal2, pedido2.getPrecoTotal(), 0.01);

        // Verifica os itens do primeiro pedido
        Iterator<Map.Entry<Produto, Integer>> itensIterator1 = pedido1.listarItens();
        int itemCount1 = 0;
        while (itensIterator1.hasNext()) {
            itemCount1++;
            Map.Entry<Produto, Integer> entry = itensIterator1.next();
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();
            if (produto.equals(produto1)) {
                assertEquals(2, quantidade);
            } else if (produto.equals(produto2)) {
                assertEquals(3, quantidade);
            }
        }
        assertEquals(2, itemCount1); // Deve haver 2 itens no primeiro pedido

        // Verifica os itens do segundo pedido
        Iterator<Map.Entry<Produto, Integer>> itensIterator2 = pedido2.listarItens();
        int itemCount2 = 0;
        while (itensIterator2.hasNext()) {
            itemCount2++;
            Map.Entry<Produto, Integer> entry = itensIterator2.next();
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();
            if (produto.equals(produto1)) {
                assertEquals(1, quantidade);
            } else if (produto.equals(produto2)) {
                assertEquals(1, quantidade);
            }
        }
        assertEquals(2, itemCount2); // Deve haver 2 itens no segundo pedido
    }
}
