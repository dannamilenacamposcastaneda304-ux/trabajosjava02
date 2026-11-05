package CicloWhile;
import java.util.Scanner;

public class ContarCifras {

    public static void main(String[] args) {

        Scanner tecl = new Scanner(System.in);

        System.out.println("Ingrese un numero entero:");
        int num = tecl.nextInt();

        int numCifras = 0;

        int numero = Math.abs(num);

        while (numero > 0) {
            numero = numero / 10;
            numCifras++;
        }

        if (num == 0) {
            numCifras = 1;
        }

        System.out.println(num + " tiene " + numCifras + " cifras");

        tecl.close();
    }
}
