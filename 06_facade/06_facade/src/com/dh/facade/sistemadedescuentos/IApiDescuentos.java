package com.dh.facade.sistemadedescuentos;

import com.dh.facade.model.Producto;
import com.dh.facade.model.Tarjeta;

public interface IApiDescuentos { //Esta es la definición de la fachada (contrato)
    int calcularPorcentajeDeDescuento(Tarjeta t, Producto p, int cant);
}
