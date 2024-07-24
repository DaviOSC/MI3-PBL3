package model;

import java.io.Serializable;

public abstract class Pagamento implements Serializable{

    // Método template para realizar o pagamento
    public final boolean realizarPagamento(Pedido pedido) {
        if (podeRealizarPagamento(pedido)) {
            if (validarDetalhesPagamento() && processarPagamento()) {
                pedido.setEstado(Pedido.PROCESSANDO);
                pedido.setPagamento(this);
                return true;
            }
        }
        return false;
    }

    // Método concreto que pode ser usado ou sobrescrito pelas subclasses
    public boolean podeRealizarPagamento(Pedido pedido) {
        return pedido.getEstado() == Pedido.NOVO;
    }

    // Métodos abstratos que precisam ser implementados pelas subclasses
    protected abstract boolean validarDetalhesPagamento();
    protected abstract boolean processarPagamento();
}
