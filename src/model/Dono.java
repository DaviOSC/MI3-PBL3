package model;

public class Dono extends Usuario {
    public Dono(String nome, String senha) {
        super(nome, senha);
    }

    @Override
    public String getTipoUsuario() {
        return "Dono";
    }

    public void adicionarProdutoEmEstoque(Estoque estoque, Produto produto, int quantidade) {
        estoque.adicionarProduto(produto, quantidade);
    }

    public void removerProdutoDoEstoque(Estoque estoque, Produto produto, int quantidade) throws IllegalArgumentException{
        estoque.removerProduto(produto, quantidade);
    }
    
    
    public void avancarPedido(GerenciamentoDePedidos gerenciamentoDePedidos, Pedido pedido){
        gerenciamentoDePedidos.avancarPedido(pedido);
    }
    //listar produtos e prdidos
}
