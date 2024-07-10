package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DonoTest {
    private Estoque estoque;
    private Dono dono;
    private Produto produto1;

    @Before
    public void setUp() {
        estoque = Estoque.getInstancia();
        produto1 = new Eletronico("Laptop", 1000.00, "Laptop de última geração");

        // Limpar o estoque antes de cada teste
        List<Produto> produtosParaRemover = new ArrayList<>(estoque.listarProdutos().keySet());
        for (Produto produto : produtosParaRemover) {
            estoque.removerProduto(produto, estoque.getQuantidadeProduto(produto));
        }

        dono = new Dono("Alice", "1234");
    }

    @Test
    public void testAdicionarProdutoEmEstoque() {
        dono.adicionarProdutoEmEstoque(estoque, produto1, 10);
        assertEquals(10, estoque.getQuantidadeProduto(produto1));
    }

    @Test
    public void testRemoverProdutoDoEstoque() {
        dono.adicionarProdutoEmEstoque(estoque, produto1, 10);
        dono.removerProdutoDoEstoque(estoque, produto1, 5);
        assertEquals(5, estoque.getQuantidadeProduto(produto1));
    }

    @Test
    public void testRemoverProdutoDoEstoqueQuantidadeInsuficiente() {
        dono.adicionarProdutoEmEstoque(estoque, produto1, 10);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            dono.removerProdutoDoEstoque(estoque, produto1, 15);
        });

        String expectedMessage = "Quantidade insuficiente em estoque";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}
