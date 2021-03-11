package Desktop;

import Dispositivo.Dispositivo;

public class Desktop extends Dispositivo {

    private String tarjetaGrafica;

    private int tamanioTorre;

    private int capacidadDiscoDuro;

    /**
     * @return the tarjetaGrafica
     */
    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    /**
     * @param tarjetaGrafica the tarjetaGrafica to set
     */
    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    /**
     * @return the tamanioTorre
     */
    public int getTamanioTorre() {
        return tamanioTorre;
    }

    /**
     * @param tamanioTorre the tamanioTorre to set
     */
    public void setTamanioTorre(int tamanioTorre) {
        this.tamanioTorre = tamanioTorre;
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

        this.tarjetaGrafica = super.mostrarDialogo("Ingrese el nombre de la tarjeta grafica", false);

        this.tamanioTorre = super.mostrarDialogo("Ingrese el tamaño de torre en pulgadas", true);

        this.capacidadDiscoDuro = super.mostrarDialogo("Ingrese la capacidad del disco duro en GB", true);
    }

}
