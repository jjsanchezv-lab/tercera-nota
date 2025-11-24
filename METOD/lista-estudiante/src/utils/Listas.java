package utils;

import java.util.ArrayList;
import java.util.List;

import domain.Estudiante;

public class Listas {
    // Creamos un método y le pasamos como argumento una lista de tipo estudiante
    public static void EstudiantesParImpar(Estudiante[] estudiantes) {
        // Creamos dos arrays de tipo Estudiante donde vamos a almacenar los estudiantes con edades pares e impares
        List <Estudiante> estudiantesPar = new ArrayList<>();
        List <Estudiante> estudiantesImpar = new ArrayList<>();
        // Creamos la condición y le pasamos la lista que colocamos en el argumento del método
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getEdad() % 2 == 0) {
                estudiantesPar.add(estudiante);
            } else {
                estudiantesImpar.add(estudiante);
            }
        }

        System.out.println("***** Estudiantes pares *****");
        for (Estudiante estudiante : estudiantesPar) {
            System.out.println("Nombre: " + estudiante.getNombre());
        }

        System.out.println("***** Estudiantes impares *****");
        for (Estudiante estudiante : estudiantesImpar) {
            System.out.println("Nombre: " + estudiante.getNombre());
        }

    }
}
