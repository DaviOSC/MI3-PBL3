package model;

public class PagamentoPayPal extends Pagamento
{
    private String email;

    public PagamentoPayPal(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }
}