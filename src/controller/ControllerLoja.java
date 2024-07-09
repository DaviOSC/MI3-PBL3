package controller;

import java.util.List;

import model.*;

public class ControllerLoja {
    private Estoque estoque;
    private GerenciamentoDePedidos gerenciamentoDePedidos;

    public ControllerLoja() {
        this.estoque = Estoque.getInstancia();
        this.gerenciamentoDePedidos = GerenciamentoDePedidos.getInstancia();
    }

    // Métodos para Dono
    public void adicionarProdutoEmEstoque(Dono dono, Produto produto, int quantidade) {
        dono.adicionarProdutoEmEstoque(estoque, produto, quantidade);
    }

    public void removerProdutoDoEstoque(Dono dono, Produto produto, int quantidade) {
        dono.removerProdutoDoEstoque(estoque, produto, quantidade);
    }

    // Métodos para Cliente
    public void criarCarrinho(Cliente cliente) {
        cliente.criarCarrinho(gerenciamentoDePedidos, estoque);
    }

    public void adicionarProdutoAoCarrinho(Cliente cliente, Produto produto, int quantidade) {
        cliente.adicionarProdutoAoCarrinho(produto, quantidade);
    }

    public void removerProdutoDoCarrinho(Cliente cliente, Produto produto, int quantidade) {
        cliente.removerProdutoDoCarrinho(produto, quantidade);
    }

    public void criarPedido(Cliente cliente) {
        cliente.criarPedido(gerenciamentoDePedidos, estoque);
    }

    public void finalizarPedido(Cliente cliente) {
        cliente.finalizarPedido(gerenciamentoDePedidos, estoque);
    }

    public void pedidoEnviado(Cliente cliente) {
        cliente.pedidoEnviado(cliente.getPedido());
    }

    public void pedidoEntregue(Cliente cliente) {
        cliente.pedidoEntregue(cliente.getPedido());
    }

    // Métodos para listar pedidos e verificar estoque
    public List<Pedido> listarPedidos() {
        return gerenciamentoDePedidos.listarPedidos();
    }

    public int getQuantidadeProduto(Produto produto) {
        return estoque.getQuantidadeProduto(produto);
    }
}

