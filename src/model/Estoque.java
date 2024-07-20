package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Estoque {
    private static Estoque instancia;
    private Map<Produto, Integer> produtos;

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
    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.put(produto, produtos.getOrDefault(produto, 0) + quantidade);
    }

    // Remove uma quantidade específica de um produto do estoque.
    public void removerProduto(Produto produto, int quantidade) throws IllegalArgumentException {
        if (produtos.containsKey(produto)) 
        {
            int quantidadeAtual = produtos.get(produto);
            if (quantidadeAtual >= quantidade)
            {
                produtos.put(produto, quantidadeAtual - quantidade);
            }
            else
            {
                throw new IllegalArgumentException("Quantidade insuficiente em estoque");
            }
        }
        else
        {
            throw new IllegalArgumentException("Produto não encontrado no estoque");
        }
    }
    
    public void removerTipoProduto(Produto produto)
    {
        if (produtos.containsKey(produto))
        {
            produtos.remove(produto);
        }
    }

    // Retorna a quantidade disponível de um produto específico no estoque.
    public int getQuantidadeProduto(Produto produto) {
        return produtos.getOrDefault(produto, 0);
    }

    // Lista todos os produtos no estoque.
    public Map<Produto, Integer> listarProdutos() {
        return produtos;
    }
    public Iterator<Map.Entry<Produto, Integer>> listarProdutosIterator() {
        return produtos.entrySet().iterator();
    }
}
