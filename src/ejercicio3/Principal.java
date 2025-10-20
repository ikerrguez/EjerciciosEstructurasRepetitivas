package ejercicio3;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("BIENVENIDO AL SCAPE ROOM");
        Scanner sc = new Scanner(System.in);
        boolean haGanado = false;
        boolean haPerdido = false;

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
                    System.out.println("Buscando la llave ...");
                    System.out.println("Tienes 3 opciones:");
                    System.out.println("1. Está debajo de la alfombra");
                    System.out.println("2. Está dentro del armario");
                    System.out.println("3. Está dentro del cajón");
                    System.out.println("Elige una opcion");
                    int opcion2 = sc.nextInt();
                    if (opcion2 == 1) {
                        System.out.println("Has encontrado la llave. Enhorabuena");
                        haGanado = true;
                        break;
                    }else if  (opcion2 ==2 || opcion2 == 3) {
                        System.out.println("Incorrecto. Sigue buscando la llave");
                        break;
                    }

                case 2:
                    System.out.println("Tienes que forzar la cerradura de la puerta");
                    System.out.println("Forzando la cerradura de la puerta ...");
                    for (int i = 1; i <= 2; i++) {
                        System.out.println("Intento número " + i + ":");
                        System.out.println("No lo has conseguido. Inténtelo de nuevo");
                    }
                        System.out.println("Intento número 3:");
                        System.out.println("Has conseguido abrir la puerta. Enhorabuena");
                        haGanado = true;
                        break;

                case 3:
                    System.out.println("Tienes que esperar o descansar");
                    System.out.println("¿Qué eliges?");
                    System.out.println("1. Esperar");
                    System.out.println("2. Descansar");
                    int opcion3 = sc.nextInt();
                    if (opcion3 == 1) {
                        System.out.println("Lo siento. Estarás atrapado eternamente en la habitación");
                        break;

                    }if (opcion3 ==2) {
                    System.out.println("Elige cuánto tiempo quieres descansar");
                    System.out.println("1. 1 mes");
                    System.out.println("2. 1 año");
                    int opcion4 = sc.nextInt();
                    if (opcion4 == 1) {
                        System.out.println("No es suficiente tiempo como para que el árbol haya crecido y la llave haya nacido");
                        break;
                    } else if (opcion4 ==2) {
                        System.out.println("Enhorabuena. Has encontrado la llave, ya que has esperado el tiempo suficiente para que haya crecido el árbol que contenía la llave");
                    haGanado = true;
                    }


                }
                    break;

            }
        }
    }
}
