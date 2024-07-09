package model;

import java.util.HashMap;
import java.util.Map;

public class Clinte extends Usuario {
    public Map<String, Pagamento> metodosPagamentos = new HashMap<>();
    private Carrinho carrinho;
    
    public Clinte(String nome, String senha) {
        super(nome, senha);
    }

    @Override
    public String getTipoUsuario() {
        return "Comprador";
    }
    
    public void cadastrarPagamento(String tipo, Pagamento pagamento) {
        metodosPagamentos.put(tipo, pagamento);
    }
    
    public Pagamento getPagamento(String tipo) {
        return metodosPagamentos.get(tipo);
    }

    // Métodos para interagir com o carrinho
    public void criarCarrinho(){
        // pra criar o carrinho tem que ter um atributo tipo gerenciamentoDePedidos ou é só criar diretamente ?
    }

    public void adicionarProdutoAoCarrinho(Produto produto, int quantidade) {
        carrinho.adicionarProduto(produto, quantidade);
    }

    public void removerProdutoDoCarrinho(Produto produto, int quantidade) {
        carrinho.removerProduto(produto, quantidade);
    }
}
