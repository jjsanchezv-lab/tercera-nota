package domain;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String id; // Cuando se privatiza un dato (se encapsula) se utiliza el get y el set
    private List<Materia> materiasInscritas;
    private List<String> horariosInscritos;
    // Hacemos el constructor
    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.materiasInscritas = new ArrayList<>();
        this.horariosInscritos = new ArrayList<>();
    }

    // Hacemos los gets
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public void inscribirMateria(Materia materia, String horario) {
        materiasInscritas.add(materia);
        horariosInscritos.add(horario);
        System.out.println("El estudiante: " + nombre + " esta inscrito en: " + materia.getnombre() + " en el horario: " + horario);
    }

    public void mostrarHorarioCompleto() {
        System.out.println("Horario completo del estudiante: " + nombre + ", con id: (" + id + ")" );
        // Validación  de las materias inscritas
        if (materiasInscritas.isEmpty()) { // el método .isEmpty(), es para saber si esta vacio o no.
            System.out.println(" - No tiene materias inscritas");
        }

        // Ciclo for para mostrar los horarios
        for (int i = 0; i < materiasInscritas.size(); i++) {
            Materia m = materiasInscritas.get(i); // Para obtener los valores de acuerdo al indice
            String horario = horariosInscritos.get(i);
            System.out.println(" - " + m.getnombre() + " (" + m.getcodigo() + ") -->" + horario);   
        }
    }

}
