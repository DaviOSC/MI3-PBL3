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
}
