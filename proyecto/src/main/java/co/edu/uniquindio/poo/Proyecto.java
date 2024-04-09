package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Proyecto {

    private final String nombre;
    private final double costoTotal;
    private final Collection <ParqueInfantil> listaParqueInfantils;
   
    public String getNombre() {
        return nombre;
    }

    public double getcostoTotal() {
        return costoTotal;
    }

    public Collection<ParqueInfantil> getListParqueInfantils() {
        return listaParqueInfantils;
    }

    public Proyecto(String nombre, double costoTotal, Collection<ParqueInfantil> listaParqueInfantils) {
        this.nombre = nombre;
        this.costoTotal = costoTotal;
        this.listaParqueInfantils = new LinkedList<>();
    }

}

/**
 * Clase para representar la zona del parque
 */

 class Zona {
    
    private final String nombre;
    private final Material material;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    
    public Zona(String nombre, Material material) {
        this.nombre = nombre;
        this.material = material;
    }


}

/**
 * Clase ParqueInfantil
 */
    
 class ParqueInfantil {

    private final String nombre;
    private final String descripcion;
    private final Collection <Zona> listaZonas;

    

    private final Municipio municipio;

    public ParqueInfantil(String nombre, String descripcion, Municipio municipio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.municipio = municipio;
        listaZonas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public Collection<Zona> getListaZonas() {
        return listaZonas;
    }
 
}

 /**
  * Clase para representar los sobrecostos del Municipio
  */

  enum Municipio {
    ARMENIA(0),
    CALARCA(10000),
    MONTENEGRO(20000),
    QUIMBAYA(30000),
    LA_TEBAIDA(150000),
    CIRCASIA(18000),
    FILANDIA(22000),
    GENOVA(70000),
    SALENTO(50000),
    PIJAO(40000),
    CORDOBA(30000),
    BUENAVISTA(35000);

    private final int sobreCosto;

    Municipio(int sobreCosto) {
        this.sobreCosto = sobreCosto;
    }


  
/**
 * Clase para representar los costos del material
 */

    enum Material {
        ARENA(10000);
        GRAMA_SINTETICA(20000);

        private final int costo;

        private Material(int costo) {
            this.costo = costo;
        }

    }

/**
 * Clase para figuras geométricas
 */

 class FiguraGeometrica {

    private CalcularArea calcularArea;

    public CalcularArea getCalcularArea() {
        return calcularArea;
    }

    public FiguraGeometrica(CalcularArea calcularArea) {
        this.calcularArea = calcularArea;
    }
 }

}

/**
 * Clase para representar la zona circular
 */

 class ZonaCircular extends Zona {
    
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public ZonaCircular(String nombre, Material material, double radio) {
        super(nombre, material);
        this.radio = radio;
    }

 }

 /**
  * Clase para representar la zona rectangular
  */

  class ZonaRectangular extends Zona {
    private double ancho;
    private double alto;

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return alto * ancho;
    }

    public ZonaRectangular(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

  }

  /**
   * Clase para representar la zona cuadrada
   */

   class ZonaCuadrada extends ZonaRectangular {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public ZonaCuadrada(double lado) {
        this.lado = lado;
    }

   }

   /**
    * Clase para representar la zona triangular
    */

    class ZonaTriangular extends Zona {
        private double base;
        private double altura;

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return 0.5 * base * altura;
        }

        public ZonaTriangular(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }
    }