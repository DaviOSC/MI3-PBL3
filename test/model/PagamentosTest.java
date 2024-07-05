package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class PagamentosTest {

    @Test
    public void testCriarPagamentoCartaoCredito() {
        Pagamento pagamento = PagamentosFactory.criarPagamento("CartaoCredito", "1234567890123456", "João Silva", "12/25", "123");

        assertTrue(pagamento instanceof PagamentoCartaoCredito);

        PagamentoCartaoCredito pagamentoCartao = (PagamentoCartaoCredito) pagamento;
        assertEquals("1234567890123456", pagamentoCartao.getNumeroCartao());
        assertEquals("João Silva", pagamentoCartao.getNomeTitular());
        assertEquals("12/25", pagamentoCartao.getDataValidade());
        assertEquals("123", pagamentoCartao.getCodigoSeguranca());
    }

    @Test
    public void testCriarPagamentoPayPal() {
        Pagamento pagamento = PagamentosFactory.criarPagamento("PayPal", "joao@example.com");

        assertTrue(pagamento instanceof PagamentoPayPal);

        PagamentoPayPal pagamentoPayPal = (PagamentoPayPal) pagamento;
        assertEquals("joao@example.com", pagamentoPayPal.getEmail());
    }

    @Test
    public void testCriarPagamentoTransferenciaBancaria() {
        Pagamento pagamento = PagamentosFactory.criarPagamento("TransferenciaBancaria", "123456789", "Banco do Brasil");

        assertTrue(pagamento instanceof PagamentoTransferenciaBancaria);

        PagamentoTransferenciaBancaria pagamentoTransferencia = (PagamentoTransferenciaBancaria) pagamento;
        assertEquals("123456789", pagamentoTransferencia.getContaBancaria());
        assertEquals("Banco do Brasil", pagamentoTransferencia.getBanco());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarPagamentoTipoNaoSuportado() {
        PagamentosFactory.criarPagamento("Bitcoin", "bitcoinAddress");
    }

    @Test
    public void testCriarPagamentoTipoNaoSuportadoMenssagem() {
        try {
            PagamentosFactory.criarPagamento("Bitcoin", "bitcoinAddress");
            fail("Esperava IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de pagamento não suportado: Bitcoin", e.getMessage());
        }
    }
}
