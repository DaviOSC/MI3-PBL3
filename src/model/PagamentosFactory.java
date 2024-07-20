package model;

public class PagamentosFactory {
    public static Pagamento criarPagamento(String tipo, String... detalhes)
    {
        switch (tipo)
        {
            case "Cartao de Credito":
                return new PagamentoCartaoCredito(detalhes[0], detalhes[1], detalhes[2], detalhes[3]);
            case "PayPal":
                return new PagamentoPayPal(detalhes[0]);
            case "Transferencia Bancaria":
                return new PagamentoTransferenciaBancaria(detalhes[0], detalhes[1]);
            default:
                throw new IllegalArgumentException("Tipo de pagamento não suportado: " + tipo);
        }
    }
}
