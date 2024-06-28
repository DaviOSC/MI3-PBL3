package model;

public class PagamentoTransferenciaBancaria extends Pagamento
{
    private String contaBancaria;
    private String banco;

    public PagamentoTransferenciaBancaria( String contaBancaria, String banco)
    {
        this.contaBancaria = contaBancaria;
        this.banco = banco;
    }

    public String getContaBancaria()
    {
        return contaBancaria;
    }

    public String getBanco()
    {
        return banco;
    }
}
