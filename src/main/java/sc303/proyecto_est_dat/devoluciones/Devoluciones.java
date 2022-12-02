
package sc303.proyecto_est_dat.devoluciones;


public class Devoluciones {
    private String cedCliente;
    private String numPlaca;
    private String condiciones;

    public Devoluciones(String cedCliente, String numPlaca, String condiciones) {
        this.cedCliente = cedCliente;
        this.numPlaca = numPlaca;
        this.condiciones = condiciones;
    }

    public Devoluciones() {
    }
    

    public String getCedCliente() {
        return cedCliente;
    }

    public void setCedCliente(String cedCliente) {
        this.cedCliente = cedCliente;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }
}
