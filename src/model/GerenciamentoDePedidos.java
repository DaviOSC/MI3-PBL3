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
    public Pedido criarPedido(Carrinho carrinho, Estoque estoque, Cliente cliente) throws IllegalAccessException
    {   
        Iterator<Map.Entry<Produto, Integer>> iterator = carrinho.listarProdutos();
        while (iterator.hasNext()) {
            Map.Entry<Produto, Integer> entry = iterator.next();
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();

            estoque.removerProduto(produto, quantidade);
        }
        if(!carrinho.listaProdutos().isEmpty())
        {
            Pedido pedido = new Pedido(carrinho, cliente);
            pedidos.add(pedido);
            return pedido;
        }
        else
            throw new IllegalAccessException("Pedido não criado");
        
    }

    public void finalizarPedido(Pedido pedido) {
        if (pedido.getEstado() != Pedido.ENTREGUE) {
            pedido.setEstado(Pedido.ENTREGUE);
        } else {
            throw new IllegalArgumentException("Pedido já está finalizado");
        }
    }

    public Iterator<Pedido> listarPedidos() {
        return pedidos.iterator();
    }
}
