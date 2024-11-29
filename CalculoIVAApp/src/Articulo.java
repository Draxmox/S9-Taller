public class Articulo {
    private String nombre; // Nombre del producto
    private double precio; // Precio sin IVA

    // Constructor
    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Métodos de acceso y modificación para el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método de acceso para el precio
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
