package sc303.proyecto_est_dat.Alquileres;

public class Arbol {

    private Nodo root;
    private int cantNodos;

    public Arbol() {
        this.root = null;
    }

    public boolean esVacio() {
        return root == null;
    }

    public void insert(Alquiler a) {
        if (esVacio()) {
            root = new Nodo(a);
            this.cantNodos++;
        } else {
            insertar(root, a);
            this.cantNodos++;
        }

    }

    private void insertar(Nodo nodo, Alquiler a) {
        //Si el dato insertado es menor al actual, entonces se debe colocar a la izquierda

        if (a.getSolideAlquiler() < nodo.getAlquiler().getSolideAlquiler()) {

            //Verificar que el nodo izquierdo este vacio
            if (nodo.getIzq() == null) {
                nodo.setIzq(new Nodo(a));
            } else {
                insertar(nodo.getIzq(), a);
            }
        } //si el valor insertado es mayor al actual, entonces se debe insertar a la derecha
        else {
            //comprobar si el nodo derecho este vacio 
            if (nodo.getDer() == null) {
                nodo.setDer(new Nodo(a));
            } else {
                insertar(nodo.getDer(), a);
            }
        }
    }

    //--------------------------------------------------------------------------------------------
    public void listarPreOrder() {
        if (esVacio()) {
            System.out.println("Arbol vacio");
        } else {
            listarPreOrder(root);
        }
    }
    private void listarPreOrder(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.getAlquiler().getEstadeSolicitud()
                    + nodo.getAlquiler().getSolideAlquiler());
            listarPreOrder(nodo.getIzq());
            listarPreOrder(nodo.getDer());
        }
    }
    //--------------------------------------------------------------------------------------------

    public void listarInOrder() {
        if (esVacio()) {
            System.out.println("Arbol vacio");
        } else {
            listarInOrder(root);
        }

    }

    private void listarInOrder(Nodo nodo) {
        if (nodo != null) {
            listarInOrder(nodo.getIzq());
            System.out.println(nodo.getAlquiler().getEstadeSolicitud()
                    + nodo.getAlquiler().getSolideAlquiler());
            listarInOrder(nodo.getDer());
        }

    }
    //--------------------------------------------------------------------------------------------

    public void listarPostOrden() {
        if (esVacio()) {
            System.out.println("Arbol vacio");
        } else {
            listarPostOrden(root);
        }
    }

    private void listarPostOrden(Nodo nodo) {
        if (nodo != null) {
            listarPostOrden(nodo.getIzq());
            listarPostOrden(nodo.getDer());
            System.out.println(nodo.getAlquiler().getEstadeSolicitud()
                    + nodo.getAlquiler().getSolideAlquiler());
        }
    }
    //--------------------------------------------------------------------------------------------

    public Nodo menor(Nodo nodo) {

        if (nodo.getIzq() != null) {
            return menor(nodo.getIzq());
        }
        return nodo;
    }
    
    //--------------------------------------------------------------------------------------------
    public Nodo mayor(Nodo nodo) {

        if (nodo.getDer() != null) {
            return mayor(nodo.getDer());
        }
        return nodo;
    }

//---------------------------------------------------------      
    //GETTERS AND SETTERS
//---------------------------------------------------------      
    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }

    public int getCantNodos() {
        return cantNodos;
    }

    public void setCantNodos(int cantNodos) {
        this.cantNodos = cantNodos;
    }
}
