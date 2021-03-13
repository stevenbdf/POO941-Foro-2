package poo941.foro.pkg2;

import Tablet.Tablet;
import Laptop.Laptop;
import Desktop.Desktop;
import java.util.ArrayList;
import java.util.Scanner;

public class POO941Foro2 {

    static Scanner scanner = new Scanner(System.in);

    static ArrayList<Desktop> desktops = new ArrayList();
    static ArrayList<Laptop> laptops = new ArrayList();
    static ArrayList<Tablet> tablets = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salirPrograma = true;

        do {
            // Get selected opcion
            int opcionMenu = imprimirMenu();

            switch (opcionMenu) {
                case 1:
                    registrarDispositivo(seleccionarTipoDispositivo());
                    break;
                case 2:
                    break;
                case 3:
                    // Exit program 
                    salirPrograma = true;
                    break;
            }

            /**
             * Si la opcion es diferente a 3 preguntar si se vuelve a ejecutar
             * el programa
             */
            if (opcionMenu != 3) {
                // Negate returned value to exit do while
                salirPrograma = !correrDeNuevo();
            }

        } while (!salirPrograma);
    }

    static int imprimirMenu() {
        boolean opcionValida = false;

        // default return opcion is exit program
        int opcionSeleccionada = 5;

        do {
            System.out.println("\n**************************************************");
            System.out.println("* TODOPC                                         *");
            System.out.println("*                                                *");
            System.out.println("*                                                *");
            System.out.println("* Selecciona una opcion para continuar:          *");
            System.out.println("* 1. Registrar equipo                            *");
            System.out.println("* 2. Ver equipos                                 *");
            System.out.println("* 3. Salir del programa                          *");
            System.out.println("**************************************************");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            // if opcion has one of these values, opcion is valid
            opcionValida = opcion == 1 || opcion == 2 || opcion == 3;

            if (opcionValida) {
                // if opcion is valid set return opcion to opcion
                opcionSeleccionada = opcion;
            } else {
                // else show invalid message and try again
                System.out.println("Opcion invalida intentalo de nuevo");
            }

        } while (!opcionValida);

        return opcionSeleccionada;
    }

    static boolean correrDeNuevo() {
        boolean opcionValida = false, correrDeNuevo = false;

        do {
            System.out.println("\n¿Quieres realizar otra accion?");
            System.out.println(" 1. Si, volver al menu");
            System.out.println(" 2. No, salir del programa");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            // if opcion is one of these values, opcion is valid
            opcionValida = opcion == 1 || opcion == 2;

            if (opcionValida) {
                // if opcion is 1 set correrDeNuevo = true, else correrDeNuevo = false
                correrDeNuevo = opcion == 1;
            } else {
                // else show invalid message and try again
                System.out.println("Opcion invalida intentalo de nuevo");
            }

        } while (!opcionValida);

        return correrDeNuevo;
    }

    static int seleccionarTipoDispositivo() {
        boolean opcionValida = false;

        int opcionSeleccionada = 1;

        do {
            System.out.println("\nSelecciona un tipo de dispositivo");
            System.out.println(" 1. Desktops");
            System.out.println(" 2. Laptops");
            System.out.println(" 3. Tablets");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            // if opcion has one of these values, opcion is valid
            opcionValida = opcion == 1 || opcion == 2 || opcion == 3;

            if (opcionValida) {
                // if opcion is valid set return opcion to opcion
                opcionSeleccionada = opcion;
            } else {
                // else show invalid message and try again
                System.out.println("Opcion invalida intentalo de nuevo");
            }

        } while (!opcionValida);

        return opcionSeleccionada;
    }

    static void registrarDispositivo(int tipoDispositivo) {
        switch (tipoDispositivo) {
            case 1:
                Desktop desktop = new Desktop();
                desktop.ingresarDatos();
                desktops.add(desktop);
                break;
            case 2:
                //aqui vas Monica
                break;
            case 3:
                Tablet tableta = new Tablet();
                tableta.ingresarDatos();
                tablets.add(tableta);
                break;
            default:
                throw new AssertionError();
        }
    }
}
