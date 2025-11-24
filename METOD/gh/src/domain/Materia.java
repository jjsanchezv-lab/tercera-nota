package domain;

import java.util.ArrayList;

public class Materia {
    // Creación de los atributos
    private String nombre; 
    private String codigo;
    private int creditos;
    ArrayList <String> horariosDisponibles;

    // Creacion del constructor
    public Materia(String nombre, String codigo, int creditos){
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.horariosDisponibles = new ArrayList<>();
    }

    // Creación de los getters
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public ArrayList<String> getHorariosDisponibles() {
        return horariosDisponibles;
    }

    // Creacion de los metodos
    // Agregar un horario a la lsta de horarios disponibles
    public void agregarHorario(String horario){
        horariosDisponibles.add(horario);
    }

    //Muestra los horarios disponibles
    public void mostrarHorariosDisponibles(){
        System.out.println("*** Horarios disponibles para " + nombre + ", cod: (" + codigo + ").");
        for (String h : horariosDisponibles) {
            System.out.println("--> " + h);
        }
    }
}
