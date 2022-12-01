package proyecto.Login;

public class Usuario {

    private String nombre;
    private String apellidos;
    private String Id_User;
    private String password;
    private String estado;

    public Usuario(int id, String nombre) {

        this.nombre = nombre;
    }

    public Usuario(String nombre, String apellidos, String Id_User, String password, String estado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Id_User = Id_User;
        this.password = password;
        this.estado = estado;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId_User() {
        return Id_User;
    }

    public void setId_User(String idUsuario) {
        this.Id_User = idUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
