package model;

public class Roupa extends Produto {
    public Roupa(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public String getTipoProduto() {
        return "Roupa";
    }
}