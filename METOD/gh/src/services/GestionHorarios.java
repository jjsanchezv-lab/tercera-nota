package services;

import java.util.ArrayList;

import domain.Estudiante;
import domain.Materia;

public class GestionHorarios {
    // Creamos dos listas dentro de la clase Services
    private ArrayList <Materia> materiasRegisradas;
    private ArrayList <Estudiante> estudiantesInscritos;

    // Creamos el constructor 
    public GestionHorarios() {
        this.materiasRegisradas = new ArrayList<>();
        this.estudiantesInscritos = new ArrayList<>();
    }

    // Creamos el método para registrar materias 
    public void registarMaterias(Materia materia){
        materiasRegisradas.add(materia);
        System.out.println("Materia resgistrada: " + materia.getNombre() + ", cod: " + materia.getCodigo());
    }
    // Creamos otro método para inscribir estudiantes
    public void inscribirEstudiantes(Estudiante estudiante){
        estudiantesInscritos.add(estudiante);
        System.out.println("Estudiante registrado: " + estudiante.getNombreEstudiante() + ". ID: " + estudiante.getId() );
    }
}
