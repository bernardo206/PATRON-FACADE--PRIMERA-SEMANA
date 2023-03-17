package service;

import model.Tarjeta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApiTarjetaTest {

    @Test
    void test_star_bank_tiene_20_de_descuento() {

        //Arrange
        Tarjeta tarjeta = new Tarjeta("1", "Star Bank");

        ApiTarjeta api = new ApiTarjeta();
        //Act
        int descuento = api.descuento(tarjeta);
        //Assert
        Assertions.assertEquals(20, descuento);
    }

    @Test
    void test_otros_bancos_tiene_0_de_descuento() {

        //Arrange
        Tarjeta tarjeta = new Tarjeta("1", "Corodoba");

        ApiTarjeta api = new ApiTarjeta();
        //Act
        int descuento = api.descuento(tarjeta);
        //Assert
        Assertions.assertEquals(0, descuento);
    }


}