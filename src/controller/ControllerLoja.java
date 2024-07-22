package controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import model.*;

public class ControllerLoja implements Serializable{
    private Estoque estoque;
    private GerenciamentoDePedidos gerenciamentoDePedidos;
    private transient Usuario usuarioLogado;
    private Map<String, Usuario> usuarios ;

    public ControllerLoja() {
        this.estoque = Estoque.getInstancia();
        this.gerenciamentoDePedidos = GerenciamentoDePedidos.getInstancia();
        this.usuarios = new HashMap<>();
    }

    // Métodos de login e logout
    public Usuario fazerLogin(String login, String senha) throws IllegalArgumentException, IllegalAccessException
    {
        Usuario usuario = usuarios.get(login);

        if (usuario != null && usuario.getSenha().equals(senha))
        {
            this.usuarioLogado = usuario;
            return usuario; 
        }
        else if (usuario != null && !usuario.getSenha().equals(senha))
        {
            throw new IllegalArgumentException("Senha incorreta");
        }
        else
        {
            throw new IllegalArgumentException("Usuario não encontrado");
        }
    }
    public Usuario cadastrarUsuario(String tipo, String nome, String senha) throws IllegalArgumentException, IllegalAccessException
    {
        Usuario usuario = UsuarioFactory.criarUsuario(tipo, nome, senha); 
        if(usuarios.containsKey(nome))
        {
            throw new IllegalArgumentException("Usuário já existente");
        }
        if(senha.equals(""))
        {
            throw new IllegalArgumentException("Senha inválida");
        }
        if(nome.equals(""))
        {
            throw new IllegalArgumentException("Nome inválido");
        }
        usuarios.put(nome, usuario);
        return usuario;    
        
    }

    public void logout() {
        this.usuarioLogado = null;
    }

    // Métodos para Dono
    public void adicionarProdutoEmEstoque(Produto produto, int quantidade) {
        if (usuarioLogado instanceof Dono) {
            ((Dono) usuarioLogado).adicionarProdutoEmEstoque(estoque, produto, quantidade);
        } else {
            //throw new IllegalAccessException("Acesso negado: Apenas o Dono pode adicionar produtos ao estoque.");
        }
    }

    public void removerProdutoDoEstoque(Produto produto, int quantidade) throws IllegalArgumentException{
        if (usuarioLogado instanceof Dono) {
            ((Dono) usuarioLogado).removerProdutoDoEstoque(estoque, produto, quantidade);
        } else {
            //throw new IllegalAccessException("Acesso negado: Apenas o Dono pode remover produtos do estoque.");
        }
    }
    public void avancarPedido(Pedido pedido) throws IllegalArgumentException{
        if (usuarioLogado instanceof Dono) {
            ((Dono) usuarioLogado).avancarPedido(gerenciamentoDePedidos, pedido);
        } else {
            //throw new IllegalAccessException("Acesso negado: Apenas Clientes podem finalizar pedidos.");
        }
    }

    // Métodos para Cliente
    public void adicionarProdutoAoCarrinho(Produto produto, int quantidade) throws IllegalArgumentException{
        if (usuarioLogado instanceof Cliente) {
            ((Cliente) usuarioLogado).adicionarProdutoAoCarrinho(estoque, produto, quantidade);
        } else {
            //throw new IllegalAccessException("Acesso negado: Apenas Clientes podem adicionar produtos ao carrinho.");
        }
    }

    public void removerProdutoDoCarrinho(Produto produto, int quantidade) {
        if (usuarioLogado instanceof Cliente) {
            ((Cliente) usuarioLogado).removerProdutoDoCarrinho(estoque,produto, quantidade);
        } else {
           // throw new IllegalAccessException("Acesso negado: Apenas Clientes podem remover produtos do carrinho.");
        }
    }

    public Pedido criarPedido() throws IllegalAccessException {
        if (usuarioLogado instanceof Cliente) {
            return ((Cliente) usuarioLogado).criarPedido(gerenciamentoDePedidos, estoque);
        } else {
            return null;//throw new IllegalAccessException("Acesso negado: Apenas Clientes podem criar pedidos.");
        }
    }

    public Iterator<Map.Entry<Produto, Integer>> listarProdutosCarrinhoIterator() {
        if (usuarioLogado instanceof Cliente) {
            return ((Cliente) usuarioLogado).getCarrinho().listarProdutos();
        } else {
            return null;//throw new IllegalAccessException("Acesso negado: Apenas Clientes podem confirmar entrega de pedidos.");
        }   
    }
    public double getPreçoCarrinho()
    {
        return ((Cliente)usuarioLogado).getPreçoTotal();
    }
    
    public void criarMetodoPagamento(String tipo,Pagamento pagamento)
    {
        ((Cliente)usuarioLogado).cadastrarPagamento(tipo, pagamento);
    }
    public Iterator<Map.Entry<String, Pagamento>> listarMetodosPagamento() {
        return ((Cliente)usuarioLogado).listarMetodosPagamento();
    }
    public Pedido getPedido()
    {
        return ((Cliente)usuarioLogado).getPedido();
    }
    
    public boolean pagarPedido(Pagamento pagamento)
    {
        return ((Cliente)usuarioLogado).pagarPedido(pagamento);
    }
    
    public boolean verificaPedido()
    {
        return ((Cliente)usuarioLogado).getPedido() != null && ((Cliente)usuarioLogado).getPedido().getPagamento() == null;
    }

    // Métodos para listar pedidos e verificar estoque (acessíveis a todos)
    public Iterator<Pedido> listarPedidos() {
        return gerenciamentoDePedidos.listarPedidos();
    }

    public int getQuantidadeProduto(Produto produto) {
        return estoque.getQuantidadeProduto(produto);
    }

    public Map<Produto, Integer> listarProdutosEstoque() {
        return estoque.listarProdutos();
    }

    public Iterator<Map.Entry<Produto, Integer>> listarProdutosEstoqueIterator() {
        return estoque.listarProdutos().entrySet().iterator();
    }
    

    public void removerTipoProdutoDoEstoque(Produto produto) {
        estoque.removerTipoProduto(produto);
    }
    
    
        
}
