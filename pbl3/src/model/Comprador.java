package model;

public class Comprador extends Usuario {
    public Comprador(String nome, String senha, FormaPagamento formaPagamento) {
        super(nome, senha, formaPagamento);
    }

    @Override
    public String getTipoUsuario() {
        return "Comprador";
    }
}

