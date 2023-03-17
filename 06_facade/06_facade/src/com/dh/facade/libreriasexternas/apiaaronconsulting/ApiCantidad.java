package com.dh.facade.libreriasexternas.apiaaronconsulting;

public class ApiCantidad {

    public int obtenerPorcentajeDeDescuento(int cantidad){
        return cantidad > 11 ? 15 : 0;
    }
}
