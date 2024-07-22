package model;

public class PagamentosFactory {
    public static Pagamento criarPagamento(String tipo, String... detalhes)
    {
        switch (tipo) {
            case "Cartao de Credito":
                if (detalhes[0].isEmpty() || detalhes[1].isEmpty() || detalhes[2].isEmpty() || detalhes[3].isEmpty()) {
                    throw new IllegalArgumentException("Nenhum campo pode estar vazio para Cartão de Crédito.");
                }
                return new PagamentoCartaoCredito(detalhes[0], detalhes[1], detalhes[2], detalhes[3]);
            case "PayPal":
                if (detalhes[0].isEmpty()) {
                    throw new IllegalArgumentException("O campo do email não pode estar vazio para PayPal.");
                }
                return new PagamentoPayPal(detalhes[0]);
            case "Transferencia Bancaria":
                if (detalhes[0].isEmpty() || detalhes[1].isEmpty()) {
                    throw new IllegalArgumentException("Nenhum campo pode estar vazio para Transferência Bancária.");
                }
                return new PagamentoTransferenciaBancaria(detalhes[0], detalhes[1]);
            default:
                throw new IllegalArgumentException("Tipo de pagamento não suportado: " + tipo);
        }
    }
}
