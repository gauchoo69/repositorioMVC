package vista;

import controlador.CocheControlador;
import modelo.*;

import java.util.Scanner;

public class CocheVista {
    public static void main(String[] args) {
        Coche coche = new Coche(0.02, 0.1);
        coche.añadirObservador(new AlarmaRepostar());
        CocheControlador controlador = new CocheControlador(coche);
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n---- Menú ----");
            System.out.println("1. Avanzar");
            System.out.println("2. Poner gasolina");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos metros quieres avanzar?: ");
                    double metros = sc.nextDouble();
                    System.out.println(controlador.avanzar(metros));
                    break;
                case 2:
                    System.out.print("¿Cuántos litros de gasolina quieres añadir?: ");
                    double litros = sc.nextDouble();
                    System.out.println(controlador.ponerGasolina(litros));
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        sc.close();
    }
}
