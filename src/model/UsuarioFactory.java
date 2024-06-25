package model;

public class UsuarioFactory {
    public static Usuario criarUsuario(String tipo, String nome, String senha, FormaPagamento formaPagamento) {
        switch (tipo) {
            case "Dono":
                return new Dono(nome, senha, formaPagamento);
            case "Comprador":
                return new Comprador(nome, senha, formaPagamento);
            default:
                throw new IllegalArgumentException("Tipo de usuário desconhecido");
        }
    }
}

