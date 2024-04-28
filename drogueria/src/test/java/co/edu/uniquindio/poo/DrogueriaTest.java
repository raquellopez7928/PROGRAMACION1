package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class DrogueriaTest {
    private static final Logger LOG = Logger.getLogger(DrogueriaTest.class.getName());

    @Test
    public void pedidosSinStock (){
        LOG.info("Inicio test pedidosSinStock");
        assertThrows(Throwable.class, ()-> new Pedido(LocalDate.of(2024, 04, 20), 6, 
        new Hogar("82819", "bloqueador solar", "bloqueador solar con color", "82827",
         0, "3456", "Aplicar todos los días"), 
        new Cliente("Sofia", "López", "1091883672", "Calle 19 n10.42", "3166877447")));
        LOG.info("Fin test pedidos con pedidosSinStock");
    }

    @Test
    public void ProductosStock100 (){
        LOG.info("Inicio test obtener ProductosStockMayor100");
        var drogueria = new Drogueria("hsbdj");

        CuidadoPersonal producto1 = new CuidadoPersonal("9282773", "vitamina c", "serum vitamina c", "281993",
         15000, 20, "10");
        Hogar producto2 = new ProductoHogar("7832643", "Jabon", "Jabon para lavar la loza", 5000,
         19, "8192848", "Mantener limpio");
        Medicamento producto3 = new Medicamento("83826", "Acetaminofen", "para tratar dolores", "9282727", 1000, 90, "15");

        drogueria.agregarProducto(producto3);
        drogueria.agregarProducto(producto2);
        drogueria.agregarProducto(producto1);

        Collection<Producto> listaEsperada = List.of(producto3, producto1);

        assertIterableEquals(listaEsperada, drogueria.getProductoStock100());

        LOG.info("Fin test obtener ProductosStockMayor100");
    }

    @Test 
    public void costoTotalPedido (){
        LOG.info("Inicio test costoTotalPedido");
        var drogueria = new Drogueria("a");
        Pedido  pedido = new Pedido(LocalDate.of(2024, 04, 20), 25, 
        new CuidadoPersonal("182736", "Retinol", "wjejurufu", "2837262",
         60000, 26, "wjwuwje"), 
        new Cliente("Sofia", "Lopez", "1091883672", "calle 19 n10.42", "3166877447"));
        drogueria.agregarPedido(pedido);
        assertEquals(1440000, pedido.calcularValorPedido(), 0.05, App.PRECISION);
        LOG.info("Fin test costoTotalPedido");
    }
}