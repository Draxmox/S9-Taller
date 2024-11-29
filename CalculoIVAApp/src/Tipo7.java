public class Tipo7 extends Articulo {
    private static final double TIPO = 7.0; // Porcentaje del IVA

    // Constructor
    public Tipo7(String nombre, double precio) {
        super(nombre, precio);
    }

    // Calcula el IVA correspondiente
    public double getParteIVA() {
        return (super.getPrecio() * TIPO) / 100;
    }

    // Devuelve el precio con el IVA incluido
    @Override
    public double getPrecio() {
        return super.getPrecio() + getParteIVA();
    }
}
