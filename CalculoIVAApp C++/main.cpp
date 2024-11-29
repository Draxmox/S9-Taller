#include <iostream>
#include <vector>
#include "Articulo.h"

int main() {
    // Crear artículos con diferentes porcentajes de IVA
    Articulo art1("Producto 1", 100.0, 4.0);
    Articulo art2("Producto 2", 200.0, 7.0);
    Articulo art3("Producto 3", 300.0, 16.0);

    // Almacenar los productos en un vector para gestionarlos dinámicamente
    std::vector<Articulo> productos = {art1, art2, art3};

    // Mostrar la información de los productos
    std::cout << "Detalles de los productos:\n";
    for (const auto& producto : productos) {
        std::cout << producto.getNombre() << " - Precio Base: " << producto.getPrecioBase()
                  << ", IVA: " << producto.getParteIVA()
                  << ", Precio Total: " << producto.getPrecioTotal() << "\n";
    }

    return 0;
}
