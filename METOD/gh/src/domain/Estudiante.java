package domain;

import java.util.ArrayList;

public class Estudiante {
    // Creacion de los atributos de la clase Estudiante
    private String nombreEstudiante;
    private String id;
    private ArrayList <Materia> materiasInscritas;

    // Creación del constructor
    public Estudiante(String nombreEstudiante, String id) {
        this.nombreEstudiante = nombreEstudiante;
        this.id = id;
        this.materiasInscritas = new ArrayList<>();
    }

    // Creacion de los getters
    public String getNombreEstudiante(){
        return nombreEstudiante;
    }

    public String getId(){
        return id;
    }

    public ArrayList<Materia> getMateriasInscritas() {
        return materiasInscritas;
    }

    // Creación de los métodos
    // Método para inscribir una materia en un horario específico
    public boolean inscribirMateria(Materia materia, String horario){
        // Se utiliza el ciclo if para luego usar las opciones "true o false" en una validación más
        if (!materia.getHorariosDisponibles().contains(horario)) {
            System.out.println("El horario " + horario + " no esta disponible para la materia " + materia.getNombre());
            return false;
        } else {
            materiasInscritas.add(materia);
            System.out.println("Materia " + materia.getNombre() + " inscrita con exito en el horario " + horario);
            return true;
        }
       
    }

    // Método para mostrar las materias inscritas con sus horarios
    public void mostrarHorarioCompletoEstudiante(){
        System.out.println("Horario completo del estudiante " + nombreEstudiante + ", id: (" + id + ").");
        if (materiasInscritas.isEmpty()) { // El método .isEmpty(), es para saber si u array esta vacio o no (vacio: true, lleno: false)
            System.out.println("Usted no tiene materias inscritas");            
        } else {
            for (Materia m : materiasInscritas) {
            System.out.println("Materia: " + m.getNombre() + ", cod: (" + m.getCodigo() + ").");
            }
        }
    }

    
    
}
