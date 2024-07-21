package model;

import java.io.Serializable;

public abstract class Usuario implements Serializable{
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public abstract String getTipoUsuario();
}
