package services;

import java.util.ArrayList;

import domain.EspacioParqueadero;
import domain.Vehiculo;

public class GestionParqueadero {
    // Esta vendría siendo la clase donde van todas las funciones y donde se van a utilizar todas las clases y con ellas 
    // ... los respectivos métodos, atributos y constructores.

    // Creamos los atributos (listas de espacios de parqueadero).
    private ArrayList<Vehiculo> vehiculosRegistrados;
    private ArrayList<EspacioParqueadero> espaciosParqueadero;


    // Creamos el constructor
    public GestionParqueadero(){
        this.vehiculosRegistrados = new ArrayList<>();
        this.espaciosParqueadero = new ArrayList<>();
    }

    // Registrar un vehículo en el sistema
    public void registrarVehiculo(Vehiculo vehiculo){
        vehiculosRegistrados.add(vehiculo);
        System.out.println("Vehículo registrado: " + vehiculo.getPlaca());
    }

    // Mostrar los espacios disponibles
    public void mostrarEspaciosDisponibles(){
        for (EspacioParqueadero e : espaciosParqueadero) {
            if (!e.getEstado()) {
                System.out.println("Espacio Disponible: " + e.getNumeroEspacio() + ", Tipo Permitido: " + e.getTipoPermitido());
            }
        }
    }

    // Asignar un espacio según el tipo de vehículo
    public boolean asignarEspacio(Vehiculo vehiculo){
        for (EspacioParqueadero e : espaciosParqueadero) {
            if (!e.getEstado() && e.getTipoPermitido().equalsIgnoreCase(vehiculo.getTipo())){ // Verificamos si el espacio está disponible y si el tipo coincide
               
                System.out.println("Vehículo " + vehiculo.getPlaca() + " asignado al espacio " + e.getNumeroEspacio());
                return e.asignarVehiculo(vehiculo);
                
            }
        }
        System.out.println("No hay espacios disponibles para el tipo de vehículo: " + vehiculo.getTipo());
        return false; // No hay espacio disponible
    }

    // Agregar espacio de parqueadero
    public void agregarEspacioParqueadero(EspacioParqueadero espacio){
        espaciosParqueadero.add(espacio);
    }

}
