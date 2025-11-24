package app;

import domain.Estudiante;
import domain.Materia;
import service.GestionHorarios;

// Flujo del programa
public class Main {
    public static void main(String[] args) {
        // Importamos el service desde el metodo main
        GestionHorarios sistema = new GestionHorarios();
        Materia programacion = new Materia("Programación 1", "PROG01", 4);

        // Agregamos un horario a la materia de programación
        programacion.agregarHorario("Lunes 6-8");
        programacion.agregarHorario("Sábado 6-8");

        // Registramos la materia de programación
        sistema.resgistrarMateria(programacion);

        // Creamos el estudiante
        Estudiante e1 = new Estudiante("Yisus", "123");
        sistema.registrarEstudiante(e1); // Resgistramos a el estudiante

        // Mostramos los horarios disponibles
        programacion.gethorariosDisponibles();

        //Inscribimos el estudiante en el horario específico de la materia agg
        sistema.inscribirEstuduianteEnMateria("123", "PROG01", "Lunes 6-8");

        sistema.mostrarHorarioEstudiante("123");
    }
}
