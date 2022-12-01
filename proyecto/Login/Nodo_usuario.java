package proyecto.Login;

public class Nodo_usuario {

    private Usuario usuario;
    private Nodo_usuario next;

    public Nodo_usuario(Usuario usuario) {
        this.usuario = usuario;
      
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.usuario = Usuario;
    }

    public Nodo_usuario getnext() {
        return next;
    }

    public void setnext(Nodo_usuario siguiente) {
        this.next = siguiente;
    }

}
