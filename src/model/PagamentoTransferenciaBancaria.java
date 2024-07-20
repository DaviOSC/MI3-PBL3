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

    @Override
    protected boolean validarDetalhesPagamento() {
        // Lógica de validação específica para transferência bancária
        return !contaBancaria.isEmpty() && !banco.isEmpty();
    }

    @Override
    protected boolean processarPagamento() {
        // Lógica para processar o pagamento por transferência bancária
        System.out.println("Pagamento realizado por transferência bancária.");
        return true; // Supondo que o pagamento foi bem-sucedido
    }
    
    public String getContaBancaria()
    {
        return contaBancaria;
    }

    public String getBanco()
    {
        return banco;
    }
    
    @Override 
    public String toString()
    {
        return "Conta " + contaBancaria;
    }
}
