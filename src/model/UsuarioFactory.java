package model;

public class UsuarioFactory {
    public static Usuario criarUsuario(String tipo, String nome, String senha) {
        switch (tipo) {
            case "Dono":
                return new Dono(nome, senha);
            case "Comprador":
                return new Clinte(nome, senha);
            default:
                throw new IllegalArgumentException("Tipo de usuário desconhecido");
        }
    }
}

