package com.dh.facade;

import com.dh.facade.sistemadedescuentos.ApiDescuento;
import com.dh.facade.sistemadedescuentos.ApiDescuentoMiniSupers;
import com.dh.facade.sistemadedescuentos.IApiDescuentos;


public class Supermercado {

    public static void main(String[] args) {
        IApiDescuentos sistemaDeDescuentos = new ApiDescuentoMiniSupers();
    }
}
