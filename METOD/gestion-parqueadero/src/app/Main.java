package app;

import domain.Vehiculo;
import services.GestionParqueadero;
import domain.EspacioParqueadero;

public class Main {
    public static void main(String[] args) {
        System.out.println("**** Gestión de Parqueadero Iniciada ****");

        GestionParqueadero gestion1 = new GestionParqueadero(); // Creamos el objeto de gestión del parqueadero

        // Creamos los espacios del parqueadero
        EspacioParqueadero espacio1 = new EspacioParqueadero(1, "Carro", "Disponible");
        EspacioParqueadero espacio2 = new EspacioParqueadero(2, "Moto", "Disponible");
        EspacioParqueadero espacio3 = new EspacioParqueadero(3, "Carro", "Disponible");

        // Agregamos los espacios al sistema de gestión
        gestion1.agregarEspacioParqueadero(espacio1);
        gestion1.agregarEspacioParqueadero(espacio2);
        gestion1.agregarEspacioParqueadero(espacio3);
        
        // Creamos (instanciamos) ojetos de tipo Vehiculo
        Vehiculo vehiculo1 = new Vehiculo("KKY942", "Carro", "William");
        Vehiculo vehiculo2 = new Vehiculo("TMO53H", "Moto", "Keiner");
        Vehiculo vehiculo3 = new Vehiculo("LPA564", "Carro", "Ana");


        // Registramos los vehículos en el sistema
        System.out.println("Registrando vehículos...");
        gestion1.registrarVehiculo(vehiculo1);
        gestion1.registrarVehiculo(vehiculo2);
        gestion1.registrarVehiculo(vehiculo3);

        // Mostramos los espacios disponibles
        System.out.println("Espacios disponibles...");
        gestion1.mostrarEspaciosDisponibles();

        // Asignamos espacios a los vehículos
        System.out.println("Asignando espacios a los vehículos...");
        gestion1.asignarEspacio(vehiculo1);
        gestion1.asignarEspacio(vehiculo2);
        gestion1.asignarEspacio(vehiculo3);

        // Mostramos los espacios disponibles después de las asignaciones
        System.out.println("Espacios disponibles después de las asignaciones...");
        gestion1.mostrarEspaciosDisponibles();
    }
    
}
