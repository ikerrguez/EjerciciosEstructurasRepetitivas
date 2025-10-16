package ejercicio2;

import java.util.Scanner;

public class Principal {
    static void main() {

        System.out.println("Bienvenido al cajero automático");
        System.out.println("Tu saldo inicial es de 1000 euros");
        int saldoInicial = 1000;
        int opcion;

        do {
            System.out.println("Ingrese una opción");
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Consultar saldo / 2.Ingresar dinero / 3.Retirar Dinero / 4.Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Tu saldo es de " + saldoInicial + " euros ");
                    break;

                case 2:
                    System.out.println("Ingrese su dinero");
                    int ingreso = sc.nextInt();
                    saldoInicial = ingreso + saldoInicial;
                    System.out.println("Tu dinero actual es: " +saldoInicial + " euros ");
                    break;

                case 3:
                    System.out.println("Retirar dinero");
                    int retiro;
                    do {
                        System.out.print("Introduce la cantidad a retirar: ");
                        retiro = sc.nextInt();

                        if (retiro <= 0) {
                            System.out.println("Cantidad inválida. Debe ser mayor que 0.");
                        } else if (retiro > saldoInicial) {
                            System.out.println("No tienes suficiente saldo");

                        }
                    } while (retiro <= 0 || retiro > saldoInicial);
                    saldoInicial -= retiro;
                    System.out.println("Tu saldo actual es de " + saldoInicial + " €");
                    break;

                case 4:
                    System.out.println("Gracias por usar el cajero. Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        }while(opcion!=4);
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}


