package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Pedido
{
    public static final int NOVO = 0;
    public static final int PROCESSANDO = 1;
    public static final int ENVIADO = 2;
    public static final int ENTREGUE = 3;

    private Map<Produto, Integer> itens;
    private Map<Produto, Double> precosTotaisPorProduto;
    //Fazer um retorno em Carinho para retonar valor total por produto.
    private double precoTotal;
    private int estado;

    public Pedido(Carrinho carrinho, Estoque estoque) {
        this.itens = carrinho.listaProdutos();
        this.precosTotaisPorProduto = new HashMap<>();
        this.precoTotal = carrinho.getPrecoTotal();
        this.estado = NOVO;
    }

    // Retorna um Iterator para todos os itens do pedido
    public Iterator<Map.Entry<Produto, Integer>> listarItens()
    {
        return itens.entrySet().iterator();
    }

    public double getPrecoTotal()
    {
        return precoTotal;
    }

    public int getEstado()
    {
        return estado;
    }

    public void setEstado(int estado)
    {
        this.estado = estado;
    }
}