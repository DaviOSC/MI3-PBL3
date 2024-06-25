package model;

public class FormaPagamento {
    private String tipo;
    private String detalhes;

    public FormaPagamento(String tipo, String detalhes) {
        this.tipo = tipo;
        this.detalhes = detalhes;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    @Override
    public String toString() {
        return "Forma de Pagamento: " + tipo + ", Detalhes: " + detalhes;
    }
}

