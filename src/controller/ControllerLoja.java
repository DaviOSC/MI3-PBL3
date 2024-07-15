package controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import model.*;

public class ControllerLoja {
    private Estoque estoque;
    private GerenciamentoDePedidos gerenciamentoDePedidos;
    private Usuario usuarioLogado;

    public ControllerLoja() {
        this.estoque = Estoque.getInstancia();
        this.gerenciamentoDePedidos = GerenciamentoDePedidos.getInstancia();
    }

    // Métodos de login e logout
    public void login(Usuario usuario) {
        this.usuarioLogado = usuario;
    }

    public void logout() {
        this.usuarioLogado = null;
    }

    // Métodos para Dono
    public void adicionarProdutoEmEstoque(Produto produto, int quantidade) {
        if (usuarioLogado instanceof Dono) {
            ((Dono) usuarioLogado).adicionarProdutoEmEstoque(estoque, produto, quantidade);
                    System.out.print("CriarProdutoController \n");
        } else {
            //throw new IllegalAccessException("Acesso negado: Apenas o Dono pode adicionar produtos ao estoque.");
        }
    }

    public void removerProdutoDoEstoque(Produto produto, int quantidade) {
        if (usuarioLogado instanceof Dono) {
            ((Dono) usuarioLogado).removerProdutoDoEstoque(estoque, produto, quantidade);
        } else {
            //throw new IllegalAccessException("Acesso negado: Apenas o Dono pode remover produtos do estoque.");
        }
    }

    // Métodos para Cliente
    public void adicionarProdutoAoCarrinho(Produto produto, int quantidade) {
        if (usuarioLogado instanceof Cliente) {
            ((Cliente) usuarioLogado).adicionarProdutoAoCarrinho(estoque, produto, quantidade);
                    System.out.print("ADDProdutoCARController \n");
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

    public void criarPedido() {
        if (usuarioLogado instanceof Cliente) {
            ((Cliente) usuarioLogado).criarPedido(gerenciamentoDePedidos, estoque);
        } else {
            //throw new IllegalAccessException("Acesso negado: Apenas Clientes podem criar pedidos.");
        }
    }

    public void finalizarPedido() {
        if (usuarioLogado instanceof Cliente) {
            ((Cliente) usuarioLogado).finalizarPedido(gerenciamentoDePedidos, estoque);
        } else {
            //throw new IllegalAccessException("Acesso negado: Apenas Clientes podem finalizar pedidos.");
        }
    }

    public void pedidoEnviado() {
        if (usuarioLogado instanceof Cliente) {
            ((Cliente) usuarioLogado).pedidoEnviado(((Cliente) usuarioLogado).getPedido());
        } else {
            //throw new IllegalAccessException("Acesso negado: Apenas Clientes podem enviar pedidos.");
        }
    }

    public void pedidoEntregue() {
        if (usuarioLogado instanceof Cliente) {
            ((Cliente) usuarioLogado).pedidoEntregue(((Cliente) usuarioLogado).getPedido());
        } else {
            //throw new IllegalAccessException("Acesso negado: Apenas Clientes podem confirmar entrega de pedidos.");
        }
    }
    public Iterator<Map.Entry<Produto, Integer>> listarProdutosCarrinhoIterator() {
        if (usuarioLogado instanceof Cliente) {
            return ((Cliente) usuarioLogado).getCarrinho().listarProdutos();
        } else {
            return null;//throw new IllegalAccessException("Acesso negado: Apenas Clientes podem confirmar entrega de pedidos.");
        }
        
    }

    // Métodos para listar pedidos e verificar estoque (acessíveis a todos)
    public List<Pedido> listarPedidos() {
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
