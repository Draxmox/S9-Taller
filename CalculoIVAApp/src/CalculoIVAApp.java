import java.util.ArrayList;
import java.util.Scanner;

public class CalculoIVAApp {
    public static void main(String[] args) {
        // Crear los artículos
        Tipo4 art1 = new Tipo4("Producto Tipo 4", 100.0);
        Tipo7 art2 = new Tipo7("Producto Tipo 7", 200.0);
        Tipo16 art3 = new Tipo16("Producto Tipo 16", 300.0);

        // Agregar los artículos a la lista
        ArrayList<Articulo> listaArticulos = new ArrayList<>();
        listaArticulos.add(art1);
        listaArticulos.add(art2);
        listaArticulos.add(art3);

        // Mostrar opciones al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione un artículo para mostrar su IVA y precio total:");
        for (int i = 0; i < listaArticulos.size(); i++) {
            System.out.println((i + 1) + ". " + listaArticulos.get(i).getNombre());
        }

        // Leer la selección del usuario
        int opcion = scanner.nextInt();
        if (opcion >= 1 && opcion <= listaArticulos.size()) {
            Articulo seleccionado = listaArticulos.get(opcion - 1);
            if (seleccionado instanceof Tipo4) {
                System.out.println("Valor del IVA: " + ((Tipo4) seleccionado).getParteIVA());
            } else if (seleccionado instanceof Tipo7) {
                System.out.println("Valor del IVA: " + ((Tipo7) seleccionado).getParteIVA());
            } else if (seleccionado instanceof Tipo16) {
                System.out.println("Valor del IVA: " + ((Tipo16) seleccionado).getParteIVA());
            }
            System.out.println("Precio total: " + seleccionado.getPrecio());
        } else {
            System.out.println("Opción inválida.");
        }

        scanner.close();
    }
}