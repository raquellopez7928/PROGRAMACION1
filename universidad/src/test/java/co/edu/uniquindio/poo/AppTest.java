* Clase para probar el funcionamiento del código de la veterinaria
* @author Área de programación UQ
* @since 2024-02
* 
* Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
*/
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
* Clase para realizar un banco de pruebas.
*/
public class AppTest {
   private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

   /**
    * Rigorous Test :-)
    */
   @Test
   public void shouldAnswerWithTrue() {
       LOG.info("Iniciado test shouldAnswerWithTrue");
       assertTrue(true);
       LOG.info("Finalizando test shouldAnswerWithTrue");
   }
}
