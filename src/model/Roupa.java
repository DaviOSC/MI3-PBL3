package model;

public class Roupa extends Produto {
    public Roupa(String nome, double preco, String descricao) {
        super(nome, preco, descricao);
    }

    @Override
    public String getTipoProduto() {
        return "Roupa";
    }
}