package sc303.proyecto_est_dat.devoluciones;

public class Cola {

    private Nodo head;
    private Nodo back;
    private int size;

    public Cola(Nodo head, Nodo back, int size) {
        this.head = head;
        this.back = back;
        this.size = size;
    }    

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void encolar(Devoluciones d) {
        Nodo nuevoNodo = new Nodo(d);
        if (isEmpty()) {
            setHead(nuevoNodo);
        } else {
            getBack().setNext(nuevoNodo);
        }
        setBack(nuevoNodo);
        this.size++;
    }

    public void listarCola() {
        Nodo aux = head;
        if (!isEmpty()) {
            while (aux != null) {
                System.out.println();
                System.out.print(aux.getDev().getCedCliente() + "\n");
                System.out.print(aux.getDev().getNumPlaca() + "\n");
                System.out.print(aux.getDev().getCondiciones() + "\n");
                aux = aux.getNext();
            }
        } else {
            System.out.println("La cola esta vacia");
        }

    }

    public void atiende() {
        Nodo aux = head;
        if (isEmpty()) {
            System.out.println("La cola esta vacia");
        } else {
            if (aux.getNext() == null) {
                setBack(null);
            }
            head = head.getNext();
            size--;
        }
    }

//-----------------------------------------------------------------------------------------------
    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getBack() {
        return back;
    }

    public void setBack(Nodo back) {
        this.back = back;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
