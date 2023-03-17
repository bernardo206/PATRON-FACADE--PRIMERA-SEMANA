package com.dh.facade.libreriasexternas.compumundohipermegaalanisnet;

import com.dh.facade.model.Producto;

public class ApiProducto {

    public int obtenerPorcentajeDeDescuentoPorTipoDeProducto(Producto p){
        return p.getTipo().equalsIgnoreCase("lata") ? 10 : 0;
    }
}
