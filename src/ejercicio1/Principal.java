package ejercicio1;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("Bienvenido al analizador de números");
        Scanner sc = new Scanner(System.in);
        String repetir;

        do {
            int numero, mayor, menor;
            System.out.print("Introduce el primer número : ");
            numero = sc.nextInt();
            mayor = numero;
            menor = numero;

            for (int i = 2; i <= 6; i++) {
                System.out.print("Introduce un número : ");
                numero = sc.nextInt();

                if (numero > mayor) mayor = numero;
                if (numero < menor) menor = numero;

            }
            System.out.println("El número más alto es: " + mayor);
            System.out.println("El número más bajo es: " + menor);

            System.out.print("¿Quieres repetir? (si/no): ");
            repetir = sc.next();

        } while (repetir.equalsIgnoreCase("si"));
        if  (repetir.equalsIgnoreCase("no")) {
            System.out.println("Perfecto, gracias por confiar en nuestro programa");
        }
    }
}



