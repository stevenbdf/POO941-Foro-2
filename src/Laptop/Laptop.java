package Laptop;

import Dispositivo.Dispositivo;

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
}