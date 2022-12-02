
package sc303.proyecto_est_dat.devoluciones;

public class Nodo {
    
    private Devoluciones dev;
    private Nodo next;

    public Nodo(Devoluciones dev) {
        this.dev = dev;
        this.next = null;
    }

    public Nodo() {
    }

    public Devoluciones getDev() {
        return dev;
    }

    public void setDev(Devoluciones dev) {
        this.dev = dev;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
}
