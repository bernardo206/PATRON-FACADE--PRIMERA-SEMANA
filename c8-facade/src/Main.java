import model.Producto;
import model.Tarjeta;
import service.*;

public class Main {
    public static void main(String[] args) {

        Facade service = new DescuentoService();
        int descuento = service.descuento(new Tarjeta("1", "BancoFrance"), new Producto("tomate", "LATA"), 15);

        System.out.println("Descuento: " + descuento);


    }
}