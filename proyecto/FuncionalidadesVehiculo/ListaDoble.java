
package proyecto.FuncionalidadesVehiculo;

import javax.swing.JOptionPane;

public class ListaDoble {
    Nodo first;
    Nodo last;
    private int CantidadNodos;
    
    
    public ListaDoble(){
        this.first = null;
        this.last = null;
    }
    

    public boolean Vacia(){
        return (this.first ==null);  
    }
//------------------------------------------------------------------------
     public void insertarPrimero(Vehiculo v){
         Nodo nuevo  = new Nodo(v);
         if (Vacia()){
             this.last = nuevo;
         }else{
             this.first.setAnterior(nuevo);
         }
                       
         nuevo.setSiguiente(this.first);
         this.first = nuevo;
                           
         this.CantidadNodos++;
         
     }
//------------------------------------------------------------------------
     public void insertarFinal(Vehiculo v){
          Nodo nuevo = new Nodo(v);
          if(Vacia()){
            this.first = nuevo;
          }else{
             this.last.setSiguiente(nuevo);
             nuevo.setAnterior(this.last);
          }
          
          this.last = nuevo;
          this.CantidadNodos++;
         
     }

     
     public Vehiculo[] listarenArreglo() {
        Vehiculo arregloVehiculo[] = new Vehiculo[this.getCantidadNodos()];
        Nodo actual = this.first;
        int c = 0;

        while (actual != null) {
            arregloVehiculo[c] = new Vehiculo(actual.getV().getPlaca(),
                    actual.getV().getMarca(),
                    actual.getV().getModelo(),
                    actual.getV().getAño(),
                    actual.getV().getColor(),
                    actual.getV().getCilindrada(),
                    actual.getV().getTipoDeCombustible(),
                    actual.getV().getCapacidadPasajeros(),
                    actual.getV().getPrecioDeAlquiler(),
                    actual.getV().getEstadoVehiculo(),  
                    actual.getV().getExtras());
            actual = actual.getSiguiente();
            c++;
        }

        for (Vehiculo vehiculo : arregloVehiculo) {
            System.out.println(vehiculo.getMarca());
        }

        return arregloVehiculo;

    }
     
public boolean esPosicionValida(int indice) {
    return (indice>0 && indice <= this.CantidadNodos)||(indice>0 && indice == this.CantidadNodos+1);
}

     
public void insertarPosicion(Vehiculo v, int posicion) {	
                if(!this.esPosicionValida(posicion)) {
			System.out.println("Indice no valido en la lista");				
		}else {
			Nodo nuevoNodo = new Nodo(v);
			Nodo actual = first;
		
			if (posicion==1) {
				this.insertarPrimero(v);				
			}else if (posicion==this.CantidadNodos+1){
				this.insertarFinal(v);						
			}else {
				for(int i =1;i<posicion && actual.getSiguiente()!=null;i++) {
                                    actual = actual.getSiguiente();
				}
				
                                nuevoNodo.setSiguiente(actual);
                                actual.getAnterior().setSiguiente(nuevoNodo);
                                nuevoNodo.setAnterior(actual.getAnterior());
                                actual.setAnterior(nuevoNodo);                                				
				this.CantidadNodos++;			
			}
						
		}

}
//------------------------------------------------------------------------
 	public void removerPrimero() {
		if(this.Vacia()) {
			System.out.println("La lista está vacia");		
		}else {
			
			//si hay un solo nodo
			if(this.first.getSiguiente()==null) {
				this.last=null;
			}else{
                            first.getSiguiente().setAnterior(null);
                        }
			
			this.first=first.getSiguiente();
			this.CantidadNodos--;
		}	
	}

 	public void removerUltimo() {
		if(this.Vacia()) {
			System.out.println("La lista está vacia");			
		}else {		
			if(this.first.getSiguiente()==null) {
				first = null;
			}else{
                            this.last.getAnterior().setSiguiente(null);
                        }

                        this.last = last.getAnterior();
			this.CantidadNodos--;
			
		}
				
	}           

  	public void removerPosicion(int posicion) {
		if(!this.esPosicionValida(posicion)) {
			System.out.println("Indice no valido en la lista");				
		}else {
			Nodo actual = this.first;		
			
			if(posicion==1) {
				this.removerPrimero();
			}else if (posicion==this.CantidadNodos) {				
				this.removerUltimo();
			}else {
				for(int i=1;i<posicion &&actual.getSiguiente()!=null;i++) {
					actual= actual.getSiguiente();
				}
                                actual.getAnterior().setSiguiente(actual.getSiguiente());
                                actual.getSiguiente().setAnterior(actual.getAnterior());				
				this.CantidadNodos--;
			}
			
		}
				
	}      


 public void listarAdelante(){
     Nodo actual  = this.first;
     
     if(Vacia()){
         System.out.println("Lista vacia");
     }else{
         while(actual!=null){
             System.out.print(actual.getV().getExtras()+"-->"+
                     actual.getV().getCapacidadPasajeros()+"-->"+
                     actual.getV().getAño()+"-->"+
                     actual.getV().getCilindrada()+"-->"+
                     actual.getV().getColor()+"-->"+
                     actual.getV().getEstadoVehiculo()+"-->"+
                     actual.getV().getMarca()+"-->"+
                     actual.getV().getModelo()+"-->"+
                     actual.getV().getPlaca()+"-->"+
                     actual.getV().getPrecioDeAlquiler()+"-->"+
                     actual.getV().getTipoDeCombustible());
             actual = actual.getSiguiente();
         }     
     }
 }    

 public void listarAtras(){
     Nodo actual = this.last;
          if(Vacia()){
         System.out.println("Lista vacia");
     }else{
         while(actual!=null){
             System.out.println(actual.getV().getExtras()+"-->"+
                     actual.getV().getCapacidadPasajeros()+"-->"+
                     actual.getV().getAño()+"-->"+
                     actual.getV().getCilindrada()+"-->"+
                     actual.getV().getColor()+"-->"+
                     actual.getV().getEstadoVehiculo()+"-->"+
                     actual.getV().getMarca()+"-->"+
                     actual.getV().getModelo()+"-->"+
                     actual.getV().getPlaca()+"-->"+
                     actual.getV().getPrecioDeAlquiler()+"-->"+
                     actual.getV().getTipoDeCombustible());                                  
             actual = actual.getAnterior();
         }     
     }      
 }

 public void eliminarDato(Vehiculo v){
     
     Nodo actual  = this.first;
     int posicion =1;
     
     if(Vacia()){
         System.out.println("Lista vacia");
     }else{
         while(actual!=null){
             if(actual.getV()==v){
                 this.removerPosicion(posicion);
                 break;
             }
          posicion++;      
          actual = actual.getSiguiente();
         }     
     } 
 }
   
   

    

    public boolean buscarVehiculo(String placa, String marca) {
        String searchKey1 = placa;
        String searchKey2 = marca;
        Nodo actual = this.first;
        boolean existente = false;
        Vehiculo temp = null;
        if (Vacia()) {
            System.out.println("No hay eventos en la lista");
            return existente;
        } else {
            while (actual != null) {

                if (actual.getV().getPlaca().equals(searchKey1) && actual.getV().getMarca().equals(searchKey2)) {
                    temp = actual.getV();
                    JOptionPane.showMessageDialog(null, "Ya existe este vehiculo! \n"
                            + actual.getV().getPlaca() + " | Placa:  "
                            + actual.getV().getMarca(), ",Marca", 1);
//                  System.out.println(actual.getPersona().getId() + " | " + actual.getPersona().getNombre());
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

    public Vehiculo buscarPorPlaca(String placa) {
        String searchKey1 = placa;

        Nodo actual = this.first;

        Vehiculo temp = null;
        if (Vacia()) {
            System.out.println("No hay eventos en la lista");
            return temp;
        } else {
            while (actual != null) {

                if (actual.getV().getPlaca().equals(searchKey1)) {
                    temp = actual.getV();
                    JOptionPane.showMessageDialog(null, "Se Encontro Placa! \n"
                            + actual.getV().getPlaca() + " | Placa:  "
                            + actual.getV().getMarca(), "Marca", 1);
                    actual = actual.getSiguiente();
                } else {
                    actual = actual.getSiguiente();

                }

            }
            return temp;
        }

    }

    public void editarVehiculo(Vehiculo vehiculoAEditar) {
        String searchKey1 = vehiculoAEditar.getPlaca();

        Nodo actual = this.first;

        Vehiculo temp = null;
        if (Vacia()) {
            System.out.println("No hay eventos en la lista");

        } else {
            while (actual != null) {

                if (actual.getV().getPlaca() == searchKey1) {
                    temp = actual.getV();
                    temp.setPlaca(vehiculoAEditar.getPlaca());
                    temp.setMarca(vehiculoAEditar.getMarca());
                    temp.setModelo(vehiculoAEditar.getModelo());
                    temp.setCilindrada(vehiculoAEditar.getCilindrada());
                    temp.setColor(vehiculoAEditar.getColor());
                    temp.setCapacidadPasajeros(vehiculoAEditar.getCapacidadPasajeros());
                    temp.setEstadoVehiculo(vehiculoAEditar.getEstadoVehiculo());
                    temp.setPrecioDeAlquiler(vehiculoAEditar.getPrecioDeAlquiler());
                    temp.setExtras(vehiculoAEditar.getExtras());
                    temp.setTipoDeCombustible(vehiculoAEditar.getTipoDeCombustible());
                    temp.setAño(vehiculoAEditar.getAño());

                    JOptionPane.showMessageDialog(null, """
                                                        Se edito el vehiculo! 
                                                         | ID del Vehiculo:  """
                            + actual.getV().getPlaca() + " | Placa:  "
                            + actual.getV().getMarca() + " | Marca:  "
                            + actual.getV().getModelo(), "Modelo", 1);
                    actual = actual.getSiguiente();

                } else {
                    actual = actual.getSiguiente();

                }

            }

        }

    }
    
    
    public Vehiculo[] listarEnArreglo() {
        Vehiculo arregloVehiculo[] = new Vehiculo[this.getCantidadNodos()];
        Nodo actual = this.first;
        int c = 0;

        do {
            arregloVehiculo[c] = new Vehiculo(actual.getV().getPlaca(),
                    actual.getV().getMarca(),
                    actual.getV().getModelo(),
                    actual.getV().getAño(),
                    actual.getV().getColor(),
                    actual.getV().getCilindrada(),
                    actual.getV().getTipoDeCombustible(),
                    actual.getV().getCapacidadPasajeros(),
                    actual.getV().getPrecioDeAlquiler(),
                    actual.getV().getEstadoVehiculo(),  
                    actual.getV().getExtras());

            actual = actual.getSiguiente();
            c++;
        } while (actual != first);

        for (Vehiculo vehiculo : arregloVehiculo) {
            System.out.println(vehiculo.getPlaca());
        }

        return arregloVehiculo;

    }
     
    public Vehiculo[] listarenArreglo(Object vehiculo) {
        Vehiculo arregloVehiculo[] = new Vehiculo[this.getCantidadNodos()];
        Nodo actual = this.first;
        int c = 0;

        while (actual != null) {
                    arregloVehiculo[c] = new Vehiculo(actual.getV().getPlaca(),
                    actual.getV().getMarca(),
                    actual.getV().getModelo(),
                    actual.getV().getAño(),
                    actual.getV().getColor(),
                    actual.getV().getCilindrada(),
                    actual.getV().getTipoDeCombustible(),
                    actual.getV().getCapacidadPasajeros(),
                    actual.getV().getPrecioDeAlquiler(),
                    actual.getV().getEstadoVehiculo(),  
                    actual.getV().getExtras());
            actual = actual.getSiguiente();
            c++;
        }

        for (Vehiculo v : arregloVehiculo) {
            System.out.println(v.getMarca());
        }

        return arregloVehiculo;

    }

  
    public Nodo getFirst() {
        return first;
    }

    public void setFirst(Nodo first) {
        this.first = first;
    }

    public Nodo getLast() {
        return last;
    }

    public void setLast(Nodo last) {
        this.last = last;
    }

    public int getCantidadNodos() {
        return CantidadNodos;
    }

    public void setCantidadNodos(int CantidadNodos) {
        this.CantidadNodos = CantidadNodos;
    }
   
}

    
