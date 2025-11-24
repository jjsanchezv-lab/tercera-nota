package domain;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    private String nombre;
    private String codigo;
    private int creditos;
    // Creamos una lista de strings para los horarios diponibles
    private List<String> horariosDisponibles;

    // Constructor
    public Materia(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo; 
        this.creditos = creditos;
        this.horariosDisponibles = new ArrayList<>();
    }
    // Hacemos los seters y los geters
    public String getnombre() {
        return nombre;
    }

    public String getcodigo() {
        return codigo;
    }

    public int getcreditos() {
        return creditos;
    }

    public List<String> gethorariosDisponibles() {
        return horariosDisponibles;
    }

    // Creamos los métodos
    public void agregarHorario(String horario) {
        System.out.println("Horarios disponibles para " + nombre + "("+ codigo + ")");
        for (String h : horariosDisponibles) {
            System.out.println(" --> " + h);
        }
    }
}

    

