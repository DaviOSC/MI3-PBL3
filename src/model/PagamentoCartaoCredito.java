package model;

public class PagamentoCartaoCredito extends Pagamento
{
    private String numeroCartao;
    private String nomeTitular;
    private String dataValidade;
    private String codigoSeguranca;

    public PagamentoCartaoCredito(String numeroCartao, String nomeTitular, String dataValidade, String codigoSeguranca)
    {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    protected boolean validarDetalhesPagamento() {
        // Lógica de validação específica para cartão de crédito
        return !numeroCartao.isEmpty() && !nomeTitular.isEmpty() && !dataValidade.isEmpty() && !codigoSeguranca.isEmpty();
    }

    @Override
    protected boolean processarPagamento() {
        // Lógica para processar o pagamento com cartão de crédito
        System.out.println("Pagamento realizado com cartão de crédito.");
        return true; // Supondo que o pagamento foi bem-sucedido
    }
    
    public String getNumeroCartao()
    {
        return numeroCartao;
    }

    public String getNomeTitular()
    {
        return nomeTitular;
    }

    public String getDataValidade()
    {
        return dataValidade;
    }

    public String getCodigoSeguranca()
    {
        return codigoSeguranca;
    }
    @Override 
    public String toString()
    {
        return "Cartão " + numeroCartao+ " " + dataValidade;
    }
}
