package service;

import java.util.ArrayList;
import java.util.List;

import domain.Estudiante;
import domain.Materia;

public class GestionHorarios {
    private List<Materia> materiasRegistradas;
    private List<Estudiante> estudiantesRegistrados;
    // Constructor
    public GestionHorarios(){
        this.materiasRegistradas = new ArrayList<>();
        this.estudiantesRegistrados = new ArrayList<>();
    }

    public void resgistrarMateria(Materia materia) {
        // Agregar materias
        materiasRegistradas.add(materia);
        System.out.println("Materia registrada: " + materia.getnombre() + ", código: (" + materia.getcodigo() + ")");
    }

    public void registrarEstudiante(Estudiante estudiante) {
        estudiantesRegistrados.add(estudiante);
        System.out.println("El estudiate: " + estudiante.getNombre() + ", id: (" + estudiante.getId() + ")");
    }

    private Materia buscarMateriaPorCodigo(String codigo) {
        for (Materia m : materiasRegistradas) {
            if (m.getcodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }

    private Estudiante buscarEstudiantePorId(String id) {
        for (Estudiante e: estudiantesRegistrados) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
    return null;
    }


    public void inscribirEstuduianteEnMateria(String idEstudiante, String codigoMateria, String horario) {
        Estudiante estudiante = buscarEstudiantePorId(idEstudiante);
        Materia materia = buscarMateriaPorCodigo(codigoMateria);

        if (estudiante == null) {
            System.out.println("Error: Estudiante con ID " + idEstudiante + " no encontrado.");
        }

        if (materia == null) {
            System.out.println("Error: Materia con código " + codigoMateria + " no encontrada.");
        }

        if (!materia.gethorariosDisponibles().contains(horario)) {
            System.out.println("Error; El horario " + horario + " no esta disponible para la materia " + materia.getnombre());
        }

        // Si ninguna de estas validaciones se cumple, se inscribe un estudiante en una materia y horario indicado.
        estudiante.inscribirMateria(materia, horario);
    }  
    
    // Mostrar los horarios del estudiante
    public void mostrarHorarioEstudiante(String idEstudiante) {
        Estudiante estudiante = buscarEstudiantePorId(idEstudiante);
        // Si se encuentra, es porque ya esta agregado
        if (estudiante == null) {
            System.out.println("El estudiante con ID " + idEstudiante + " no encontrado.");
        }
        estudiante.mostrarHorarioCompleto();
    }
}
