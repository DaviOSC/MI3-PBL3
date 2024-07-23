import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import model.CarrinhoTest;
import model.ClienteTest;
import model.DonoTest;
import model.EstoqueTest;
import model.GerenciamentoDePedidosTest;
import model.PagamentosTest;
import model.PedidoTest;
import model.ProdutoTest;



@RunWith(Suite.class)
@Suite.SuiteClasses({
    CarrinhoTest.class,
    ClienteTest.class,
    GerenciamentoDePedidosTest.class,
    DonoTest.class,
    EstoqueTest.class,
    PagamentosTest.class,
    PedidoTest.class,
    ProdutoTest.class,
})
public class AllTests { }
