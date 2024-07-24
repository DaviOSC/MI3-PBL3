package model;

public class PagamentoPayPal extends Pagamento
{
    private String email;

    public PagamentoPayPal(String email)
    {
        this.email = email;
    }

    @Override
    protected boolean validarDetalhesPagamento() {
        // Lógica de validação específica para PayPal
        return email != null && !email.isEmpty() && email.contains("@");
    }

    @Override
    protected boolean processarPagamento() {
        // Lógica para processar o pagamento via PayPal
        return true; // Supondo que o pagamento foi bem-sucedido
    }

    public String getEmail()
    {
        return email;
    }
    
    @Override 
    public String toString()
    {
        return "PayPal - " + email;
    }
}