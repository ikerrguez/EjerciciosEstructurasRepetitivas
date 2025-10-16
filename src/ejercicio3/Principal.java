package ejercicio3;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("Bienvenido al scape room");
        Scanner sc = new Scanner(System.in);
        boolean haGanado = false;
        boolean haPerdido = false;
        int intentos = 3;

        while (!haGanado && !haPerdido) {
            System.out.println("Debes escapar de la habitación");
            System.out.println("Estás en una habitación cerrada.");
            System.out.println("Opciones:");
            System.out.println("1. Buscar llave en el cajón");
            System.out.println("2. Forzar la cerradura de la puerta");
            System.out.println("3. Esperar y descansar");

            System.out.println("Elige una opción");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:

            }


        }


    }
}

