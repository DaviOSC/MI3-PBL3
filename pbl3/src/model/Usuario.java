package model;

public abstract class Usuario {
    private String nome;
    private String senha;
    private FormaPagamento formaPagamento;

    public Usuario(String nome, String senha, FormaPagamento formaPagamento) {
        this.nome = nome;
        this.senha = senha;
        this.formaPagamento = formaPagamento;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public abstract String getTipoUsuario();
}
