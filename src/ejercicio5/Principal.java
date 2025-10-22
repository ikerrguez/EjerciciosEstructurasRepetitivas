package ejercicio5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double nota;
        double suma = 0;
        int contador = 0;

        while (true) {
            System.out.print("Introduce una nota (0-10) o -1 para terminar: ");
            nota = sc.nextDouble();

            if (nota == -1) {
                break;
            }

            if (nota < 0 || nota > 10) {
                System.out.println(" Nota no válida. Debe estar entre 0 y 10.");
            } else {
                suma = suma+nota;
                contador = contador+1;
            }
        }

        if (contador > 0) {
            double media = suma / contador;
            System.out.println("La media de las notas es: " + media);
        } else {
            System.out.println("No se introdujeron notas válidas.");
        }
    }
}






















