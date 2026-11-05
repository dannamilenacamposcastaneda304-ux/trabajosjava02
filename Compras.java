package CicloWhile;
import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {

        Scanner tecl = new Scanner(System.in);

        int cantidadProductos = 0;
        double precio;
        double subtotal = 0;
        double iva;
        double retencion;
        double totalPagar;

        String respuesta = "si";

        while (respuesta.equalsIgnoreCase("si")) {

            System.out.println("Ingrese el precio del producto:");
            precio = tecl.nextDouble();

            subtotal = subtotal + precio;
            cantidadProductos++;

            System.out.println("¿Desea comprar otro producto? (si/no)");
            respuesta = tecl.next();
        }

        iva = subtotal * 0.19;
        retencion = subtotal * 0.025;

        totalPagar = subtotal + iva - retencion;

        System.out.println("\n----- FACTURA DE COMPRA -----");
        System.out.println("Cantidad de productos: " + cantidadProductos);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (19%): $" + iva);
        System.out.println("Retencion (2.5%): $" + retencion);
        System.out.println("-----------------------------");
        System.out.println("TOTAL A PAGAR: $" + totalPagar);

        tecl.close();
    }
}
