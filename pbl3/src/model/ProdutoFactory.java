package model;

public class ProdutoFactory {
    public static Produto criarProduto(String tipo, String nome, double preco, int quantidade) {
        switch (tipo) {
            case "Eletrônico":
                return new Eletronico(nome, preco, quantidade);
            case "Roupa":
                return new Roupa(nome, preco, quantidade);
            case "Alimento":
                return new Alimento(nome, preco, quantidade);
            default:
                throw new IllegalArgumentException("Tipo de produto desconhecido");
        }
    }
}
