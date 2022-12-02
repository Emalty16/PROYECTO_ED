
package proyecto.FuncionalidadesVehiculo;


public class Nodo {
    
    private Vehiculo v;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(Vehiculo v) {
        this.v = v;
        this.siguiente = null;
        this.anterior = null;
    }

    public Vehiculo getV() {
        return v;
    }

    public void setV(Vehiculo v) {
        this.v = v;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    
         
}
