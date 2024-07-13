package facade;

import java.util.List;

import controller.ControllerLoja;
import model.Cliente;
import model.Dono;
import model.Pedido;
import model.Produto;

public class Facade {
    private ControllerLoja controller;

    public Facade() {
        this.controller = new ControllerLoja();
    }

    public void adicionarProdutoEmEstoque(Dono dono, Produto produto, int quantidade) {
        controller.adicionarProdutoEmEstoque(dono, produto, quantidade);
    }

    public void removerProdutoDoEstoque(Dono dono, Produto produto, int quantidade) {
        controller.removerProdutoDoEstoque(dono, produto, quantidade);
    }

    
    public void criarCarrinho(Cliente cliente) {
        controller.criarCarrinho(cliente);
    }

    public void adicionarProdutoAoCarrinho(Cliente cliente, Produto produto, int quantidade) {
        controller.adicionarProdutoAoCarrinho(cliente, produto, quantidade);
    }

    public void removerProdutoDoCarrinho(Cliente cliente, Produto produto, int quantidade) {
        controller.removerProdutoDoCarrinho(cliente, produto, quantidade);
    }

    public void criarPedido(Cliente cliente) {
        controller.criarPedido(cliente);
    }

    public void finalizarPedido(Cliente cliente) {
        controller.finalizarPedido(cliente);
    }

    public void pedidoEnviado(Cliente cliente) {
        controller.pedidoEnviado(cliente);
    }

    public void pedidoEntregue(Cliente cliente) {
        controller.pedidoEntregue(cliente);
    }

    public List<Pedido> listarPedidos() {
        return controller.listarPedidos();
    }

    public int getQuantidadeProduto(Produto produto) {
        return controller.getQuantidadeProduto(produto);
    }
}

