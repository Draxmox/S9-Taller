#include "Articulo.h"

Articulo::Articulo(const std::string& nombre, double precio, double porcentajeIVA)
    : nombre(nombre), precio(precio), porcentajeIVA(porcentajeIVA) {}

Articulo::~Articulo() {}

std::string Articulo::getNombre() const {
    return nombre;
}

void Articulo::setNombre(const std::string& nombre) {
    this->nombre = nombre;
}

double Articulo::getPrecioBase() const {
    return precio;
}

double Articulo::getParteIVA() const {
    return (precio * porcentajeIVA) / 100.0; // Calcula el IVA
}

double Articulo::getPrecioTotal() const {
    return precio + getParteIVA(); // Precio base + IVA
}
