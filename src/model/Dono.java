package model;

public class Dono extends Usuario {
    public Dono(String nome, String senha) {
        super(nome, senha);
    }

    @Override
    public String getTipoUsuario() {
        return "Dono";
    }
}
