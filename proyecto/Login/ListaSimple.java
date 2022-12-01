package proyecto.Login;


import javax.swing.JOptionPane;

public class ListaSimple {

    private Nodo_usuario primer;
    private Nodo_usuario ultimo;
    private int cant_Nodos;
    //atributos necesarios para todas las listas

    public ListaSimple() {
        this.primer = null;
        this.ultimo = null;

    }

    public boolean esVacia() {
        return (this.primer == null);
        //evaluamos la existencia de un primer nodo para saber si esta vacia
    }

    public void insertarPrimero(Usuario u) {
        Nodo_usuario newNodo = new Nodo_usuario(u);
        if (esVacia()) {
            this.ultimo = newNodo;
        } else {

        }
        newNodo.setnext(this.primer);
        this.primer = newNodo;
        this.cant_Nodos++;
    }

    public void agregarFinal(Usuario u) {
        Nodo_usuario nuevoNodo = new Nodo_usuario(u);

        if (esVacia()) {
            this.primer = nuevoNodo;
        } else {
            this.ultimo.setnext(nuevoNodo);
        }
        this.ultimo = nuevoNodo;
        this.cant_Nodos++;
    }

    public void mostrar_lista() {
        Nodo_usuario actual = this.primer;
        if (esVacia()) {
            System.out.println("Lista vacia!!!!!");
        } else {
            while (actual != null) {
                //imprimimos
                System.out.println(" | " + actual.getUsuario().getNombre());
                actual = actual.getnext();
            }
        }

    }

    public boolean busc_IDusuario(String idUsuario) {
        String searchKey = idUsuario;
        Nodo_usuario actual = this.primer;
        Usuario temp = null;
        boolean resultado = false;
        if (esVacia()) {
            resultado = false;
        } else {
            while (actual != null) {

                if (actual.getUsuario().getId_User().equals(searchKey)) {
                    temp = actual.getUsuario();
                    actual = null;
                    resultado = true;
                } else {
                    actual = actual.getnext();

                }

            }

            if (temp == null) {
                // JOptionPane.showMessageDialog(null, "No se encontro Usuarios con el ID " + searchKey, "Record", 1);
                resultado = false;
            }

        }
        return resultado;
    }

    public boolean desactivar_Usuario(String idUsuario) {
        String searchKey = idUsuario;
        Nodo_usuario actual = this.primer;
        Usuario temp = null;
        boolean resultado = false;
        if (esVacia()) {
            resultado = false;
        } else {
            while (actual != null) {

                if (actual.getUsuario().getId_User().equals(searchKey)) {
                    actual.getUsuario().setEstado("Inactivo");
                    temp = actual.getUsuario();
                    actual = null;
                    resultado = true;

                } else {
                    actual = actual.getnext();

                }

            }

            if (temp == null) {
                // JOptionPane.showMessageDialog(null, "No se encontro Usuarios con el ID " + searchKey, "Record", 1);
                resultado = false;
            }

        }
        return resultado;
    }

    //Getters and Setters
    public Nodo_usuario getPrimer() {
        return primer;
    }

    public void setPrimer(Nodo_usuario primero) {
        this.primer = primero;
    }

    public Nodo_usuario getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo_usuario ultimo) {
        this.ultimo = ultimo;
    }

    public int getCant_Nodos() {
        return cant_Nodos;
    }

    public void setCant_Nodos(int cantNodos) {
        this.cant_Nodos = cantNodos;
    }

}
