package model;

public class Alimento extends Produto {
    public Alimento(String nome, double preco, String descricao) {
        super(nome, preco, descricao);
    }

    @Override
    public String getTipoProduto() {
        return "Alimento";
    }
}
