
package proyecto.FuncionalidadesClientes;

import javax.swing.JOptionPane;


public class Pila {
    
    private Nodo inicio;
    private int size;

    public Pila() {
        this.inicio = null;
        this.size = 0;
    }
                    
    public boolean esVacia(){
        
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    
    public void apilar(Cliente c){
        Nodo nuevoNodo = new Nodo(c);
        nuevoNodo.setCliente(c);
        
        if(esVacia()){
           this.inicio = nuevoNodo; 
        }else{            
            nuevoNodo.setSiguiente(inicio);
            this.inicio = nuevoNodo;
        }        
        size++;
    }
    
    
    public void listarPila(){
        Nodo aux = inicio;        
        if (esVacia()){
            System.out.println("La pila esta vacia");
        }else{
            while (aux !=null){
                System.out.println(aux.getCliente().getNombreCompleto()+"-->"+
                        aux.getCliente().getCedula()+"-->"+
                        aux.getCliente().getCorreoElectronico()+"-->"+
                        aux.getCliente().getCategoria());
                aux = aux.getSiguiente();
            }
        }        
    }
    
    public void desapilar(){
        if(esVacia()){
            System.out.println("La pila esta vacia");
        }else{
            inicio = inicio.getSiguiente();
            size--;
        }    
    }
    
    public void eliminarPila(){
        inicio = null;
        size=0;
    }
    
    public Cliente[] listarenArreglo() {
        Cliente arregloAsientos[] = new Cliente[this.size];
        Nodo actual = this.inicio;
        int c = 0;

       {
            do {
                arregloAsientos[c] = new Cliente(actual.getCliente().getNombreCompleto(),
                        actual.getCliente().getCedula(),
                        actual.getCliente().getFechaNacimiento(),
                        actual.getCliente().getCorreoElectronico(),
                        actual.getCliente().getCategoria());

                actual = actual.getSiguiente();
                c++;
            } while (actual != inicio);

            for (Cliente cliente : arregloAsientos) {
                System.out.println(cliente.getCedula());
            }

        }

        return arregloAsientos;

    }

    public Cliente[] listarTODOenArreglo() {
        Cliente arregloAsientos[] = new Cliente[this.size];
        Nodo actual = this.inicio;
        int c = 0;

        do {
            arregloAsientos[c] = new Cliente(actual.getCliente().getNombreCompleto(),
                        actual.getCliente().getCedula(),
                        actual.getCliente().getFechaNacimiento(),
                        actual.getCliente().getCorreoElectronico(),
                        actual.getCliente().getCategoria());
            actual = actual.getSiguiente();
            c++;
        } while (actual != inicio);

        for (Cliente cliente : arregloAsientos) {
            System.out.println(cliente.getCedula());
        }

        return arregloAsientos;

    }
    
    public boolean buscarCliente(String nombreCompleto, String cedula) {
        String searchKey1 = nombreCompleto;
        String searchKey2 = cedula;
        Nodo actual = this.inicio;
        boolean existente = false;
        Cliente temp = null;     
        if (esVacia()) {
            System.out.println("No hay clientes en la lista");
            return existente;
        } else {
            while (actual != null) {

                if (actual.getCliente().getNombreCompleto().equals(searchKey1) && actual.getCliente().getCedula().equals(searchKey2)) {
                    temp = actual.getCliente();
                    JOptionPane.showMessageDialog(null, "Se Encontro Cliente! \n",
                             actual.getCliente().getNombreCompleto(),
                             Integer.parseInt(actual.getCliente().getCedula()));
//                    System.out.println(actual.getPersona().getId() + " | " + actual.getPersona().getNombre());
                    existente = true;
                    return true;
                } else {
                    actual = actual.getSiguiente();
                    existente = false;

                }

            }

        }
        return existente;
    }

    public Cliente buscarCliente(String nombreCompleto) {
        String searchKey1 = nombreCompleto;

        Nodo actual = this.inicio;

        Cliente temp = null;
        if (esVacia()) {
            System.out.println("No hay clientes en la lista");
            return temp;
        } else {
            while (actual != null) {

                if (actual.getCliente().getNombreCompleto().equals(searchKey1)) {
                    temp = actual.getCliente();
                    JOptionPane.showMessageDialog(null, "Se Encontro Cliente! \n",
                             actual.getCliente().getNombreCompleto(),
                             Integer.parseInt(actual.getCliente().getCedula()));
                    actual = actual.getSiguiente();
                } else {
                    actual = actual.getSiguiente();

                }

            }
            return temp;
        }

    }
     public void editarCliente(Cliente clienteAEditar) {
        String searchKey1 = clienteAEditar.getCedula();

        Nodo actual = this.inicio;

        Cliente temp = null;
        if (esVacia()) {
            System.out.println("No hay eventos en la lista");

        } else {
            while (actual != null) {

                if (actual.getCliente().getCedula() == searchKey1) {
                    temp = actual.getCliente();
                    temp.setCedula(clienteAEditar.getCedula());
                    temp.setNombreCompleto(clienteAEditar.getNombreCompleto());
                    temp.setCorreoElectronico(clienteAEditar.getCorreoElectronico());
                    temp.setCategoria(clienteAEditar.getCategoria());
                    

                    JOptionPane.showMessageDialog(null, "Se edito el vehiculo! \n"
                            + " | ID del Vehiculo:  "
                            + actual.getCliente().getCedula() + " | Cedula:  "
                            + actual.getCliente().getNombreCompleto() + " | Nombre:  "
                            + actual.getCliente().getCorreoElectronico() + " | Correo:  "
                            + actual.getCliente().getCategoria(), "Categoria", 1);
                    actual = actual.getSiguiente();

                } else {
                    actual = actual.getSiguiente();

                }

            }

        }

    }
    
    public boolean revisarOcupacion() {
        Nodo actual = this.inicio;
        boolean disponible = false;

        if (esVacia()) {
            System.out.println("Lista vacia");
        } else {
            do {
                if (!actual.getCliente().getCategoria().equals("Activo")) {
                    disponible = true;
                }

                actual = actual.getSiguiente();
            } while (actual != inicio);

        }
        return disponible;
    }
    
    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
            
}
