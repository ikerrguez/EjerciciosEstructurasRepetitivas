package ejercicio4;

import java.util.Scanner;

public class Principal {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intento;
        int contador = 0;
        String intentos = "";

        System.out.println("Adivina un número del 1 al 100");

        do {
            System.out.print("Introduce el número: ");
            intento = sc.nextInt();
            contador++;
            System.out.println("Intento número " +contador + ": " + intento);

            if (intento < numeroSecreto) {
                System.out.println("El número es más alto.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es más bajo.");
            }

        } while (intento != numeroSecreto);

        System.out.println("¡Has acertado! El número era " + numeroSecreto);
        System.out.println("Has usado " + contador + " intentos.");
        System.out.println("Intentos: " + intentos);

        for (int i = 0; i < 3; i++) {
            System.out.println("¡FELICIDADES!");
        }
    }
}