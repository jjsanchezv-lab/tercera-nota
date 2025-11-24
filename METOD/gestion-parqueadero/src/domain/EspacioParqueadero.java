package domain;


public class EspacioParqueadero {
    // Creamos los atributos para EspacioParqueadero
    private int numeroEspacio;
    private String tipoPermitido; // Carro / moto
    private Boolean estado; // Disponible (false) / Ocupado (true)
    // Creamos un objeto de tipo Vehiculo
    private Vehiculo vehiculo;

    // Elabooramos el constructor
    public EspacioParqueadero(int numeroEspacio, String tipoPermitido, String estado){
        this.numeroEspacio = numeroEspacio; 
        this.tipoPermitido = tipoPermitido;
        this.estado = false;
        this.vehiculo = null; // Inicialmente no hay vehículo asignado
    }

    // Realizamos los geters
    public int getNumeroEspacio() {
        return numeroEspacio;
    }

    public String getTipoPermitido() {
        return tipoPermitido;
    }

    public Boolean getEstado() {
        return estado;
    }
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    // Creamos los métodos
    // Cambia el estado del espacio a ocupado
    public boolean asignarVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo; // Asignamos el vehículo al espacio
        estado = true;
        return true;
    }

    // Cambia el estado del espacio a disponible
    public void liberarEspacio(){
        vehiculo = null; // Removemos el vehículo del espacio
        estado = false;
    }

}
