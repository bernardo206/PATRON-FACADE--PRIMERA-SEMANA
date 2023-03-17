package com.dh.facade.sistemadedescuentos;

import com.dh.facade.model.Producto;
import com.dh.facade.model.Tarjeta;

public class ApiDescuentoMiniSupers implements IApiDescuentos{
    @Override
    public int calcularPorcentajeDeDescuento(Tarjeta t, Producto p, int cant) {
        return 0;
    }
}
