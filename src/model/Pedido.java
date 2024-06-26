package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Pedido {
    public static final String NOVO = "Novo";
    public static final String PROCESSANDO = "Processando";
    public static final String ENVIADO = "Enviado";
    public static final String ENTREGUE = "Entregue";

    private Map<Produto, Integer> itens;
    private Map<Produto, Double> precosTotaisPorProduto;
    private double precoTotal;
    private String estado;

    public Pedido(Carrinho carrinho, Estoque estoque) {
        this.itens = new HashMap<>();
        this.precosTotaisPorProduto = new HashMap<>();
        this.precoTotal = 0.0;
        this.estado = NOVO;
    }

    // Retorna um Iterator para todos os itens do pedido
    public Iterator<Map.Entry<Produto, Integer>> listarItens() {
        return itens.entrySet().iterator();
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}