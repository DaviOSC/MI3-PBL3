package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Carrinho
{
    private Map<Produto, Integer> produtosNoCarrinho;

    
    public Carrinho()
    {
        produtosNoCarrinho = new HashMap<>();
    }
    
    public void adicionarProduto(Estoque estoque, Produto produto, int quantidade) {
        System.out.print(this);
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero");
        }
        
        int quantidadeEmEstoque = estoque.getQuantidadeProduto(produto);
        int quantidadeNoCarrinho = produtosNoCarrinho.getOrDefault(produto, 0);
        
        if (quantidadeEmEstoque >= quantidadeNoCarrinho + quantidade) {
            produtosNoCarrinho.put(produto, quantidadeNoCarrinho + quantidade);
            estoque.removerProduto(produto, quantidade); // Remove do estoque ao adicionar ao carrinho
                    System.out.print("ADDProdutoCARCarrinhoClass \n");
        } else {
            throw new IllegalArgumentException("Quantidade insuficiente em estoque");
        }
    }

    public void removerProduto(Estoque estoque, Produto produto, int quantidade) {
        if (produtosNoCarrinho.containsKey(produto)) {
            int quantidadeAtual = produtosNoCarrinho.get(produto);
            if (quantidadeAtual >= quantidade) {
                if (quantidadeAtual == quantidade) {
                    produtosNoCarrinho.remove(produto);
                } else {
                    produtosNoCarrinho.put(produto, quantidadeAtual - quantidade);
                }
                estoque.adicionarProduto(produto, quantidade); // Adiciona ao estoque ao remover do carrinho
            } else {
                throw new IllegalArgumentException("Quantidade insuficiente no carrinho");
            }
        } else {
            throw new IllegalArgumentException("Produto não encontrado no carrinho");
        }
    }

    // Retorna a quantidade disponível de um produto específico no carrinho.
    public int getQuantidadeProduto(Produto produto) {
        return produtosNoCarrinho.getOrDefault(produto, 0);
    }

    // Retorna um Iterator para todos os produtos no carrinho.
    public Iterator<Map.Entry<Produto, Integer>> listarProdutos() {
         // Obtém o iterator
         Iterator<Map.Entry<Produto, Integer>> iterator = produtosNoCarrinho.entrySet().iterator();

         // Imprime os itens do iterator
         while (iterator.hasNext()) {
             Map.Entry<Produto, Integer> entry = iterator.next();
             Produto produto = entry.getKey();
             int quantidade = entry.getValue();
             System.out.println("Produto: " + produto.getNome() + ", Quantidade: " + quantidade);
         }

         // Retorna um novo iterator
         return produtosNoCarrinho.entrySet().iterator();
     }

    // Método para calcular o preço total do carrinho
    public double getPrecoTotal() {
        double precoTotal = 0.0;
        for (Map.Entry<Produto, Integer> entry : produtosNoCarrinho.entrySet()) {
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();
            precoTotal += produto.getPreco() * quantidade;
        }
        return precoTotal;
    }


    public Map<Produto, Integer> listaProdutos()
    {
        return this.produtosNoCarrinho;
    }
}
    
