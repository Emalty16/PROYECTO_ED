
package proyecto.FuncionalidadesVehiculo;


public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String año;
    private String color;
    private String cilindrada;
    private String tipoDeCombustible;
    private int capacidadPasajeros;
    private String precioDeAlquiler;
    private String estadoVehiculo;
    private String extras;

    public Vehiculo(String placa, String marca, String modelo, String año, String color, String cilindrada, String tipoDeCombustible, int capacidadPasajeros, String precioDeAlquiler, String estadoVehiculo, String extras) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.cilindrada = cilindrada;
        this.tipoDeCombustible = tipoDeCombustible;
        this.capacidadPasajeros = capacidadPasajeros;
        this.precioDeAlquiler = precioDeAlquiler;
        this.estadoVehiculo = estadoVehiculo;
        this.extras = extras;
    }

    public Vehiculo(int id, String rep, String seleccion, String filtro, Vehiculo[] datos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getPrecioDeAlquiler() {
        return precioDeAlquiler;
    }

    public void setPrecioDeAlquiler(String precioDeAlquiler) {
        this.precioDeAlquiler = precioDeAlquiler;
    }

    public String getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(String estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    @Override
    public String toString() {
        return placa + "," + marca + "," + modelo + "," + año + "," + color + "," + cilindrada + "," + tipoDeCombustible + "," + capacidadPasajeros + "," + precioDeAlquiler + "," + estadoVehiculo + "," + extras ;
    }
    
    
}
