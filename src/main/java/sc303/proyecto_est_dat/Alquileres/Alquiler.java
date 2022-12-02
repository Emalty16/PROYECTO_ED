
package sc303.proyecto_est_dat.Alquileres;

public class Alquiler {
    
    private int solideAlquiler;
    private String estadeSolicitud;

    public Alquiler(int solideAlquiler, String estadeSolicitud) {
        this.solideAlquiler = solideAlquiler;
        this.estadeSolicitud = estadeSolicitud;
    }

    public Alquiler() {
    }

    public int getSolideAlquiler() {
        return solideAlquiler;
    }

    public void setSolideAlquiler(int solideAlquiler) {
        this.solideAlquiler = solideAlquiler;
    }

    public String getEstadeSolicitud() {
        return estadeSolicitud;
    }

    public void setEstadeSolicitud(String estadeSolicitud) {
        this.estadeSolicitud = estadeSolicitud;
    }

    
    
   
    
}
