package model;

public class Eletronico extends Produto {
    public Eletronico(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public String getTipoProduto() {
        return "Eletrônico";
    }
}