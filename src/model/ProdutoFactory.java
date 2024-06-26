package model;

public class ProdutoFactory {
    public static Produto criarProduto(String tipo, String nome, double preco, String descricao) {
        switch (tipo) {
            case "Eletrônico":
                return new Eletronico(nome, preco, descricao);
            case "Roupa":
                return new Roupa(nome, preco, descricao);
            case "Alimento":
                return new Alimento(nome, preco, descricao);
            default:
                throw new IllegalArgumentException("Tipo de produto desconhecido");
        }
    }
}
