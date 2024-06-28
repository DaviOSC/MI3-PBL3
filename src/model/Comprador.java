package model;

import java.util.HashMap;
import java.util.Map;

public class Comprador extends Usuario {
    public Map<String, Pagamento> metodosPagamentos = new HashMap<>();
    
    public Comprador(String nome, String senha, FormaPagamento formaPagamento) {
        super(nome, senha, formaPagamento);
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
}
