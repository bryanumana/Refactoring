package co.com.bancolombia.ejerciciouno.model;

public class Producto {

    private String nombreProducto;

    public Producto() {
    }

    public Producto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
}
