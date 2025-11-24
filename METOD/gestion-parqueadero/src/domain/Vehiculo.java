package domain;

public class Vehiculo {
    // Creamos los atributos para la clase Vehiculo
    private String placa;
    private String tipo; // Carro o moto
    private String propietario;

    //  Elaboramos el constructor
    public Vehiculo(String placa, String tipo, String propietario){
        this.placa = placa; 
        this.tipo = tipo;
        this.propietario = propietario;
    }

    // Elaboramos geters
    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPropietario() {
        return propietario;
    }
}
