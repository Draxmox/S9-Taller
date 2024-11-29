#ifndef ARTICULO_H
#define ARTICULO_H

#include <string>

class Articulo {
private:
    std::string nombre;
    double precio;
    double porcentajeIVA; // El IVA como porcentaje

public:
    Articulo(const std::string& nombre, double precio, double porcentajeIVA);
    ~Articulo();

    std::string getNombre() const;
    void setNombre(const std::string& nombre);

    double getPrecioBase() const;
    double getParteIVA() const; // Calcula el IVA
    double getPrecioTotal() const; // Precio base + IVA
};

#endif // ARTICULO_H
