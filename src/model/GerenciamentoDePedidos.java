package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GerenciamentoDePedidos
{
    private static GerenciamentoDePedidos instancia;
    private List<Pedido> pedidos;

    private GerenciamentoDePedidos()
    {
        pedidos = new ArrayList<>();
    }

    public static GerenciamentoDePedidos getInstancia()
    {
        if (instancia == null)
        {
            instancia = new GerenciamentoDePedidos();
        }
        return instancia;
    }

    public Pedido criarPedido(Carrinho carrinho, Estoque estoque)
    {
        Pedido pedido = new Pedido(carrinho, estoque);
        Iterator<Map.Entry<Produto, Integer>> iterator = carrinho.listarProdutos();
        while (iterator.hasNext()) {
            Map.Entry<Produto, Integer> entry = iterator.next();
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();

            estoque.removerProduto(produto, quantidade);
        }

        pedidos.add(pedido);
        return pedido;
    }

    public List<Pedido> listarPedidos() {
        return new ArrayList<>(pedidos);
    }
}
