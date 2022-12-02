
package sc303.proyecto_est_dat.Alquileres;

public class Nodo {
 
    private Alquiler alquiler;
    private Nodo izq;
    private Nodo der;

    public Nodo(Alquiler alquiler) {
        this.alquiler = alquiler;
        this.izq = null;
        this.der = null;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
    
}
