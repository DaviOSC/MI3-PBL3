package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ProdutoTest {

    @Test
    public void testCriarEletronico() {
        Produto p = new Eletronico("Smartphone", 1200.0, "Um smartphone de última geração");
        assertNotNull(p);
        assertEquals("Smartphone", p.getNome());
        assertEquals(1200.0, p.getPreco(), 0.01);
        assertEquals("Um smartphone de última geração", p.getDescricao());
        assertEquals("Eletrônico", p.getTipoProduto());
    }

    @Test
    public void testCriarRoupa() {
        Produto p = new Roupa("Camiseta", 50.0, "Uma camiseta de algodão");
        assertNotNull(p);
        assertEquals("Camiseta", p.getNome());
        assertEquals(50.0, p.getPreco(), 0.01);
        assertEquals("Uma camiseta de algodão", p.getDescricao());
        assertEquals("Roupa", p.getTipoProduto());
    }

    @Test
    public void testCriarAlimento() {
        Produto p = new Alimento("Biscoito", 5.0, "Um pacote de biscoitos");
        assertNotNull(p);
        assertEquals("Biscoito", p.getNome());
        assertEquals(5.0, p.getPreco(), 0.01);
        assertEquals("Um pacote de biscoitos", p.getDescricao());
        assertEquals("Alimento", p.getTipoProduto());
    }
}