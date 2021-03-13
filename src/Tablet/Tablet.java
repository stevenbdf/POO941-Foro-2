package Tablet;

import Dispositivo.Dispositivo;

public class Tablet extends Dispositivo {

    private int tamanioPantalla;

    private String tipoPantalla;

    private String sistemaOperativo;

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
     * @return the tipoPantalla
     */
    public String getTipoPantalla() {
        return tipoPantalla;
    }

    /**
     * @param tipoPantalla the tipoPantalla to set
     */
    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    /**
     * @return the sistemaOperativo
     */
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    /**
     * @param sistemaOperativo the sistemaOperativo to set
     */
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    
    public void ingresarDatos() {
        super.ingresarDatosFabricante();

        this.tamanioPantalla = super.mostrarDialogo("Ingrese el tamaño de la pantalla: ", true);

        this.tipoPantalla = super.mostrarDialogo("Ingrese el tipo de pantalla (capacitiva / resistiva): ", false);

        this.sistemaOperativo = super.mostrarDialogo("Ingrese el nombre del Sistema Operativo: ", false);
    }   
}
