package model;

public class Eletronico extends Produto {
    public Eletronico(String nome, double preco, String descricao) {
        super(nome, preco, descricao);
    }

    @Override
    public String getTipoProduto() {
        return "Eletrônico";
    }
}