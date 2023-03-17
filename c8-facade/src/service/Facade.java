package service;

import model.Producto;
import model.Tarjeta;

public interface Facade {
    public int descuento(Tarjeta tarjeta, Producto producto, int cantidad);
}
