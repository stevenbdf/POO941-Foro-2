package Laptop;

import Dispositivo.Dispositivo;
import javax.swing.JOptionPane;

public class Laptop extends Dispositivo {

    private int tamanioPantalla;

    private int capacidadDiscoDuro;

    /**
     * @return the tamanioPantalla
     */
    public int getTamanioPantalla() {
        return tamanioPantalla;
    }

    /**
     * @param tamanioPantalla the tamanioPantalla to set
     */
    public void setTamanioPantalla(int tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    /**
     * @return the capacidadDiscoDuro
     */
    public int getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    /**
     * @param capacidadDiscoDuro the capacidadDiscoDuro to set
     */
    public void setCapacidadDiscoDuro(int capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public void ingresarDatos() {
        super.ingresarDatosFabricante();

        this.tamanioPantalla = super.mostrarDialogo("Ingrese el tamanio de la pantalla", true);

        this.capacidadDiscoDuro = super.mostrarDialogo("Ingrese la capacidad del disco duro en GB", true);
    }
    
    public void imprimirLaptop(){
        JOptionPane.showMessageDialog(null, super.imprimirDatosGenerales()+"Tamaño pantalla:  "+this.tamanioPantalla+"\"\n"+"Capacidad de disco duro: "+this.capacidadDiscoDuro+" GB");
    }
}
