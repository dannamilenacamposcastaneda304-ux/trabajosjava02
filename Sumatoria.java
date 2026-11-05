package CicloWhile;

import java.util.Scanner;

public class Sumatoria {

    public static void main(String[] args) {

        Scanner tecl = new Scanner(System.in);

        int numero;
        int suma = 0;

        System.out.println("Ingrese números (0 para terminar):");
        numero = tecl.nextInt();

        while (numero != 0) {

            suma = suma + numero;

            System.out.println("Ingrese otro número (0 para terminar):");
            numero = tecl.nextInt();
        }

        System.out.println("La sumatoria es: " + suma);

        tecl.close();
    }
}
