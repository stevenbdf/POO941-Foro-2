package Dispositivo;

import javax.swing.JOptionPane;

public class Dispositivo {

    private String fabricante;

    private String modelo;

    private String microProcesador;

    private int memoria;

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the microProcesador
     */
    public String getMicroProcesador() {
        return microProcesador;
    }

    /**
     * @param microProcesador the microProcesador to set
     */
    public void setMicroProcesador(String microProcesador) {
        this.microProcesador = microProcesador;
    }

    /**
     * @return the memoria
     */
    public int getMemoria() {
        return memoria;
    }

    /**
     * @param memoria the memoria to set
     */
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public <T> T mostrarDialogo(String mensaje, boolean convertirEntero) {
        boolean valorValido = false;
        Object valor = null;

        do {
            try {
                String texto = JOptionPane.showInputDialog(mensaje);

                if (convertirEntero) {
                    valor = Integer.parseInt(texto);
                    if ((int) valor < 0) {
                        throw new Exception();
                    }
                }

                if (!convertirEntero && texto != null && !texto.trim().isEmpty()) {
                    valor = texto;
                }

                if (valor == null) {
                    throw new Exception();
                }
                
                valorValido = true;

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor invalido, intentalo de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } while (!valorValido);

        return (T) valor;
    }

    public void ingresarDatosFabricante() {

        this.fabricante = this.mostrarDialogo("Ingrese el nombre del fabricante", false);

        this.modelo = this.mostrarDialogo("Ingrese el nombre del modelo", false);

        this.microProcesador = this.mostrarDialogo("Ingrese el nombre del microprocesador", false);

        this.memoria = this.mostrarDialogo("Ingrese la cantidad de memoria del dispositivo en GB", true);
    }
    
    public String imprimirDatosGenerales(){
        //JOptionPane.showMessageDialog(null, "Fabricante: "+this.fabricante+"\n"+"Modelo: "+this.modelo+"\n"+"Microprocesador: "+this.microProcesador+"\n"+"Memoria: "+this.memoria+"\n");
        return("Fabricante: "+this.fabricante+"\n"+"Modelo: "+this.modelo+"\n"+"Microprocesador: "+this.microProcesador+"\n"+"Memoria: "+this.memoria+" GB RAM\n");
    }
}
