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
                System.out.print("CriarProdutoDono \n");
    }

    public void removerProdutoDoEstoque(Estoque estoque, Produto produto, int quantidade) {
        estoque.removerProduto(produto, quantidade);
    }
    //listar produtos e prdidos
}
