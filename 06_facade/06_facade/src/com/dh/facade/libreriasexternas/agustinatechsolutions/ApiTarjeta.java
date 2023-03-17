package com.dh.facade.libreriasexternas.agustinatechsolutions;

import com.dh.facade.model.Tarjeta;

public class ApiTarjeta {

    public int obtenerPorcentajeDeDescuentoPorBanco(Tarjeta t){
        return t.getBanco().equalsIgnoreCase("star bank") ? 20 : 0;
    }
}
