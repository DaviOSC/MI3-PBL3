package facade;

import java.util.List;

import controller.ControllerLoja;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Map;
import model.Pedido;
import model.Produto;
import model.Usuario;

public class Facade {
    private ControllerLoja controller;

    public Facade() {
        this.controller = new ControllerLoja();
    }

    public void adicionarProdutoEmEstoque(Produto produto, int quantidade) {
        controller.adicionarProdutoEmEstoque(produto, quantidade);
    }

    public void removerProdutoDoEstoque(Produto produto, int quantidade) throws IllegalArgumentException {
        controller.removerProdutoDoEstoque(produto, quantidade);
    }

    public void adicionarProdutoAoCarrinho(Produto produto, int quantidade) throws IllegalArgumentException {
        controller.adicionarProdutoAoCarrinho(produto, quantidade);
    }

    public void removerProdutoDoCarrinho(Produto produto, int quantidade) {
        controller.removerProdutoDoCarrinho(produto, quantidade);
    }

    public void criarPedido() throws IllegalAccessException {
        controller.criarPedido();
    }

    public void finalizarPedido() {
        controller.finalizarPedido();
    }

    public void pedidoEnviado() {
        controller.pedidoEnviado();
    }

    public void pedidoEntregue() {
        controller.pedidoEntregue();
    }

    public Iterator<Pedido> listarPedidos() {
        return controller.listarPedidos();
    }

    public int getQuantidadeProduto(Produto produto) {
        return controller.getQuantidadeProduto(produto);
    }
    
    public Iterator<Map.Entry<Produto, Integer>> listarProdutosCarrinhoIterator()
    {
        return controller.listarProdutosCarrinhoIterator();
    }
    public Iterator<Map.Entry<Produto, Integer>> listarProdutosEstoqueIterator()
    {
        return controller.listarProdutosEstoqueIterator();
    }
    
    public Usuario fazerLogin(String usuario, String senha) throws IllegalArgumentException , IllegalAccessException
    {
        return controller.fazerLogin(usuario,senha);
    }

    public void removerTipoProdutoDoEstoque(Produto produto)
    {
        controller.removerTipoProdutoDoEstoque(produto);
    }
    public double getPreçoCarrinho()
    {
        return controller.getPreçoCarrinho();
    }
    
    public void salvarDados(String arquivo) throws IOException
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo)))
        {
            oos.writeObject(this.controller);
            oos.close();
        }
        catch (IOException e)
        {
            throw e;
        }    
    } 
    
    public void carregarDados(String arquivo) throws IOException, ClassNotFoundException
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo)))
        {
            this.controller = (ControllerLoja) ois.readObject();
            ois.close();
        }
        catch (IOException | ClassNotFoundException e)
        {
            throw e;
        }        
    }
    
    public Usuario cadastrarUsuario(String tipo, String nome, String senha) throws IllegalArgumentException , IllegalAccessException
    {
        return controller.cadastrarUsuario(tipo, nome, senha);
    }
}

