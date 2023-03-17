package service;

import model.Producto;
import model.Tarjeta;

public class DescuentoService implements Facade {

    private ApiProducto apiProducto;
    private ApiCantidad apiCantidad;
    private ApiTarjeta apiTarjeta;


    public DescuentoService() {
        apiProducto = new ApiProducto();
        apiCantidad = new ApiCantidad();
        apiTarjeta = new ApiTarjeta();
    }

    public int descuento(Tarjeta tarjeta, Producto producto, int cantidad) {

        int totalDescuento = 0;

        totalDescuento = totalDescuento + apiProducto.descuento(producto);
        totalDescuento = totalDescuento + apiTarjeta.descuento(tarjeta);
        totalDescuento = totalDescuento + apiCantidad.descuento(cantidad);

        return totalDescuento;
    }
}
