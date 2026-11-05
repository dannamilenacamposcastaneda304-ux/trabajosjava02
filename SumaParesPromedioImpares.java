package CicloWhile;
import java.util.Scanner;

public class SumaParesPromedioImpares {

    public static void main(String[] args) {

        Scanner tecl = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros enteros:");
        int cantidad = tecl.nextInt();

        int contador = 1;
        int sumaPares = 0;
        int sumaImpares = 0;
        int contadorImpares = 0;

        while (contador <= cantidad) {

            System.out.println("Ingrese un numero entero:");
            int numero = tecl.nextInt();

            if (numero % 2 == 0) {
                sumaPares = sumaPares + numero;
            } else {
                sumaImpares = sumaImpares + numero;
                contadorImpares++;
            }

            contador++;
        }

        System.out.println("La sumatoria de los pares es: " + sumaPares);

        if (contadorImpares > 0) {
            double promedio = (double) sumaImpares / contadorImpares;
            System.out.println("El promedio de los impares es: " + promedio);
        } else {
            System.out.println("No se ingresaron numeros impares.");
        }

        tecl.close();
    }
}
