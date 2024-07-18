package model;

import java.util.HashMap;
import java.util.Map;

public class Cliente extends Usuario {
    public Map<String, Pagamento> metodosPagamentos = new HashMap<>();
    private Carrinho carrinho;
    private Pedido pedido;
    
    public Cliente(String nome, String senha) {
        super(nome, senha);
        this.carrinho = new Carrinho();
    }

    @Override
    public String getTipoUsuario() {
        return "Comprador";
    }
    
    public void cadastrarPagamento(String tipo, Pagamento pagamento) {
        metodosPagamentos.put(tipo, pagamento);
    }
    
    public Pagamento getPagamento(String tipo) {
        return metodosPagamentos.get(tipo);
    }

    public boolean realizarPagamento(String tipo) {
        Pagamento pagamento = getPagamento(tipo);
        if (pagamento == null) {
            throw new IllegalArgumentException("Método de pagamento não cadastrado: " + tipo);
        }
        return pagamento.realizarPagamento(pedido);
    }
    
    public void adicionarProdutoAoCarrinho(Estoque estoque, Produto produto, int quantidade) {
        carrinho.adicionarProduto(estoque, produto, quantidade);
                System.out.print("ADDProdutoCARCliente \n");
    }

    public void removerProdutoDoCarrinho(Estoque estoque, Produto produto, int quantidade) {
        carrinho.removerProduto(estoque, produto, quantidade);
    }

    //Criar pedido (finalizar carrinho)
    public void criarPedido(GerenciamentoDePedidos gerenciamentoDePedidos, Estoque estoque){
        pedido = gerenciamentoDePedidos.criarPedido(carrinho, estoque);
    }

    public void finalizarPedido(GerenciamentoDePedidos gerenciamentoDePedidos, Estoque estoque){
        gerenciamentoDePedidos.finalizarPedido(pedido);
    }

    public void pedidoEnviado(Pedido pedido){
        pedido.setEstado(2);
    }

    public void pedidoEntregue(Pedido pedido){
        pedido.setEstado(3);
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public Pedido getPedido() {
        return pedido;
    }
}
