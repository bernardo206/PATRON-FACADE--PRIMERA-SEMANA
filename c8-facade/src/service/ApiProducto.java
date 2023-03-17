package service;

import model.Producto;

public class ApiProducto {

    public int descuento(Producto producto) {
        if (producto.getTipo().equals("LATA")) {
            return 10;
        }
        return 0;
    }
}
