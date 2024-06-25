package model;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private static Estoque instancia;
    private Map<String, Produto> produtos;

    private Estoque() {
        produtos = new HashMap<>();
    }

    public static Estoque getInstancia() {
        if (instancia == null) {
            instancia = new Estoque();
        }
        return instancia;
    }

    // Adiciona um produto ao estoque. Se o produto já existe, incrementa a quantidade.
    public void adicionarProduto(Produto produto) {
        if (produtos.containsKey(produto.getNome())) {
            Produto p = produtos.get(produto.getNome());
            p.setQuantidade(p.getQuantidade() + produto.getQuantidade());
        } else {
            produtos.put(produto.getNome(), produto);
        }
    }

    // Remove uma quantidade específica de um produto do estoque.
    public void removerProduto(String nomeProduto, int quantidade) {
        if (produtos.containsKey(nomeProduto)) {
            Produto p = produtos.get(nomeProduto);
            if (p.getQuantidade() >= quantidade) {
                p.setQuantidade(p.getQuantidade() - quantidade);
                if (p.getQuantidade() == 0) {
                    produtos.remove(nomeProduto);
                }
            } else {
                throw new IllegalArgumentException("Quantidade insuficiente em estoque");
            }
        } else {
            throw new IllegalArgumentException("Produto não encontrado no estoque");
        }
    }

    // Retorna a quantidade disponível de um produto específico no estoque.
    public int getQuantidadeProduto(String nomeProduto) {
        if (produtos.containsKey(nomeProduto)) {
            return produtos.get(nomeProduto).getQuantidade();
        } else {
            throw new IllegalArgumentException("Produto não encontrado no estoque");
        }
    }

    // Lista todos os produtos no estoque.
    public Map<String, Produto> listarProdutos() {
        return produtos;
    }
}
