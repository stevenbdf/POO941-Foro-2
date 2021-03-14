package poo941.foro.pkg2;

import Tablet.Tablet;
import Laptop.Laptop;
import Desktop.Desktop;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
                    mostrarDispositivo(seleccionarTipoDispositivo());
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
        String[] opciones = {"Registrar equipo", "Ver equipo", "Salir del programa"};

        boolean opcionValida = false;

        // default return opcion is exit program
        int opcionSeleccionada = 5;

        do {
            int opcion = JOptionPane.showOptionDialog(
                    null, "Selecciona una opcion para continuar",
                    "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, opciones[0]) + 1;

            opcionValida = opcion == 1 || opcion == 2 || opcion == 3;

            if (opcionValida) {
                // if opcion is valid set return opcion to opcion
                opcionSeleccionada = opcion;
            } else {
                // else show invalid message and try again
                JOptionPane.showMessageDialog(null, "Opcion invalida intentalo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } while (!opcionValida);

        return opcionSeleccionada;
    }

    static boolean correrDeNuevo() {
        String[] opciones = {"Si, volver al menu", "No, salir del programa"};

        boolean opcionValida = false, correrDeNuevo = false;

        do {
            int opcion = JOptionPane.showOptionDialog(
                    null, "¿Quieres realizar otra accion?",
                    "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, opciones[0]) + 1;

            // if opcion is one of these values, opcion is valid
            opcionValida = opcion == 1 || opcion == 2;

            if (opcionValida) {
                // if opcion is 1 set correrDeNuevo = true, else correrDeNuevo = false
                correrDeNuevo = opcion == 1;
            } else {
                // else show invalid message and try again
                JOptionPane.showMessageDialog(null, "Opcion invalida intentalo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } while (!opcionValida);

        return correrDeNuevo;
    }

    static int seleccionarTipoDispositivo() {
        String[] opciones = {"Desktops", "Laptops", "Tablets"};

        boolean opcionValida = false;

        int opcionSeleccionada = 1;

        do {
            int opcion = JOptionPane.showOptionDialog(
                    null, "Selecciona un tipo de dispositivo",
                    "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, opciones[0]) + 1;

            // if opcion has one of these values, opcion is valid
            opcionValida = opcion == 1 || opcion == 2 || opcion == 3;

            if (opcionValida) {
                // if opcion is valid set return opcion to opcion
                opcionSeleccionada = opcion;
            } else {
                // else show invalid message and try again
                JOptionPane.showMessageDialog(null, "Opcion invalida intentalo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
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
                Laptop laptop = new Laptop();
                laptop.ingresarDatos();
                laptops.add(laptop);
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
    
    static void mostrarDispositivo(int tipoDispositivo){
        switch (tipoDispositivo){
            case 1:
                for (int i = 0; i < desktops.size(); i++ ){
                    desktops.get(i).imprimirDesktop();
                }
                break;
            case 2:
                for (int j = 0; j < laptops.size(); j++ ){
                    laptops.get(j).imprimirLaptop();
                }
                break;
            case 3:
                for (int k = 0; k < tablets.size(); k++ ){
                    //tablets.get(k).imprimirDatosGenerales();
                    tablets.get(k).imprimirTablet();
                } 
                break;
            default:
                throw new AssertionError();
        }
    }
}
