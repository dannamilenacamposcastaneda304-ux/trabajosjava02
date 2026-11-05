package CicloWhile;
import java.util.Scanner;

public class ConjeturaUlam {

    public static void main(String[] args) {

        Scanner tecl = new Scanner(System.in);

        System.out.println("Ingrese un numero entero:");
        int num = tecl.nextInt();

        System.out.println("Secuencia de Ulam:");

        while (num != 1) {

            System.out.print(num + " -> ");

            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (num * 3) + 1;
            }
        }

        System.out.println("1");

        tecl.close();
    }
}
