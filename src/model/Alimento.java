package model;

public class Alimento extends Produto {
    public Alimento(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public String getTipoProduto() {
        return "Alimento";
    }
}
