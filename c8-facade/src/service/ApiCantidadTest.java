package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApiCantidadTest {

    @Test
    void test_si_es_menor_a_12_descuento_es_0() {
        //Arrange
        ApiCantidad api = new ApiCantidad();
        int cantidad = 2;
        //Act
        int descuento = api.descuento(cantidad);
        //Assert
        Assertions.assertEquals(0, descuento);
    }


    @Test
    void test_si_es_mayor_a_12_descuento_es_15() {
        //Arrange
        ApiCantidad api = new ApiCantidad();
        int cantidad = 14;
        //Act
        int descuento = api.descuento(cantidad);
        //Assert
        Assertions.assertEquals(15, descuento);
    }
}