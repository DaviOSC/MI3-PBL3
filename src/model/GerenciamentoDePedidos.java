package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GerenciamentoDePedidos
{
    private static GerenciamentoDePedidos instancia;
    private List<Pedido> pedidos;

    public GerenciamentoDePedidos()
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

    public static void resetInstancia() {
        instancia = null;
    }

    public Carrinho criarCarrinho(Estoque estoque) {
        return new Carrinho(estoque);
    }

    public Pedido criarPedido(Carrinho carrinho, Estoque estoque)
    {
        
        Iterator<Map.Entry<Produto, Integer>> iterator = carrinho.listarProdutos();
        while (iterator.hasNext()) {
            Map.Entry<Produto, Integer> entry = iterator.next();
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();

            estoque.removerProduto(produto, quantidade);
        }
        if(carrinho.listaProdutos().size() != 0)
        {
            Pedido pedido = new Pedido(carrinho, estoque);
            pedidos.add(pedido);
            return pedido;
        }
        else
            return null;
        
    }

    public void finalizarPedido(Pedido pedido) {
        if (pedido.getEstado() != Pedido.ENTREGUE) {
            pedido.setEstado(Pedido.ENTREGUE);
        } else {
            throw new IllegalArgumentException("Pedido já está finalizado");
        }
    }

    public List<Pedido> listarPedidos() {
        return pedidos;
    }
}
