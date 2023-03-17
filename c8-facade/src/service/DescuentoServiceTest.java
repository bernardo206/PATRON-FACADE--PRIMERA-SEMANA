package service;

import model.Producto;
import model.Tarjeta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescuentoServiceTest {

    @Test
    void test_tengo_20_de_descuento_en_banco_star() {

        //Arrange
        Tarjeta tarjeta = new Tarjeta("1", "Star Bank");
        Producto producto = new Producto("tomate", "fresco");
        int cantidad = 10;
        DescuentoService service = new DescuentoService();

        //Act
        int descuento = service.descuento(tarjeta, producto, cantidad);
        //Assert
        Assertions.assertEquals(20, descuento);

    }

    @Test
    void test_tengo_10_de_descuento_en_latas() {

        //Arrange
        Tarjeta tarjeta = new Tarjeta("1", "BBVA");
        Producto producto = new Producto("tomate", "LATA");
        int cantidad = 10;
        DescuentoService service = new DescuentoService();

        //Act
        int descuento = service.descuento(tarjeta, producto, cantidad);
        //Assert
        Assertions.assertEquals(10, descuento);

    }

    @Test
    void test_tengo_15_de_descuento_en_cantidad_mayor_a_12() {

        //Arrange
        Tarjeta tarjeta = new Tarjeta("1", "BBVA");
        Producto producto = new Producto("tomate", "FRESCO");
        int cantidad = 15;
        DescuentoService service = new DescuentoService();

        //Act
        int descuento = service.descuento(tarjeta, producto, cantidad);
        //Assert
        Assertions.assertEquals(15, descuento);

    }

    @Test
    void test_tengo_25_de_descuento_en_cantidad_mayor_a_12_y_lata() {

        //Arrange
        Tarjeta tarjeta = new Tarjeta("1", "BBVA");
        Producto producto = new Producto("tomate", "LATA");
        int cantidad = 15;
        DescuentoService service = new DescuentoService();

        //Act
        int descuento = service.descuento(tarjeta, producto, cantidad);
        //Assert
        Assertions.assertEquals(25, descuento);

    }

}