
package proyecto.FuncionalidadesClientes;


public class Cliente {
    private String cedula;
    private String nombreCompleto;
    private int fechaNacimiento;
    private String correoElectronico;
    private String categoria;

    public Cliente(String cedula, String nombreCompleto, int fechaNacimiento, String correoElectronico, String categoria) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.correoElectronico = correoElectronico;
        this.categoria = categoria;
    }

    Cliente(String id, String cedula, String nombre, int fechaNacimiento, String correo, String categoria) {
       
    }

    Cliente(String id, String nombre, String cedula, String nombre0, int fechaNacimiento, String correo, String categoria) {
        
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
