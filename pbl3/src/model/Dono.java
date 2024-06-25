package model;

public class Dono extends Usuario {
    public Dono(String nome, String senha, FormaPagamento formaPagamento) {
        super(nome, senha, formaPagamento);
    }

    @Override
    public String getTipoUsuario() {
        return "Dono";
    }
}
