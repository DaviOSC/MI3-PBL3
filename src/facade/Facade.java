package facade;

import java.util.List;

import controller.ControllerLoja;
import java.util.Iterator;
import java.util.Map;
import model.Cliente;
import model.Dono;
import model.Pedido;
import model.Produto;
import model.Usuario;

public class Facade {
    private ControllerLoja controller;

    public Facade() {
        this.controller = new ControllerLoja();
    }

    public void adicionarProdutoEmEstoque(Produto produto, int quantidade) {
        controller.adicionarProdutoEmEstoque(produto, quantidade);
    }

    public void removerProdutoDoEstoque(Produto produto, int quantidade) {
        controller.removerProdutoDoEstoque(produto, quantidade);
    }

    public void adicionarProdutoAoCarrinho(Produto produto, int quantidade) {
        controller.adicionarProdutoAoCarrinho(produto, quantidade);
        System.out.print("ADDProdutoCARFacade \n");
    }

    public void removerProdutoDoCarrinho(Produto produto, int quantidade) {
        controller.removerProdutoDoCarrinho(produto, quantidade);
    }

    public void criarPedido() {
        controller.criarPedido();
    }

    public void finalizarPedido() {
        controller.finalizarPedido();
    }

    public void pedidoEnviado() {
        controller.pedidoEnviado();
    }

    public void pedidoEntregue() {
        controller.pedidoEntregue();
    }

    public List<Pedido> listarPedidos() {
        return controller.listarPedidos();
    }

    public int getQuantidadeProduto(Produto produto) {
        return controller.getQuantidadeProduto(produto);
    }
    
    public Iterator<Map.Entry<Produto, Integer>> listarProdutosCarrinhoIterator()
    {
        return controller.listarProdutosCarrinhoIterator();
    }
    public Iterator<Map.Entry<Produto, Integer>> listarProdutosEstoqueIterator()
    {
        return controller.listarProdutosEstoqueIterator();
    }
    
    public void login(Usuario usuario)
    {
        controller.login(usuario);
    }

    public void removerTipoProdutoDoEstoque(Produto produto)
    {
        controller.removerTipoProdutoDoEstoque(produto);
    }
    
   
}

