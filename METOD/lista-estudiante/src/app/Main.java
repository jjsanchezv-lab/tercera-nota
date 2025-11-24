package app;

import domain.Estudiante;
import utils.Listas;

public class Main {
    public static void main(String[] args) {
        // Creamos un objeto (Es decir, instanciamos la clase "plantilla" Estudiante)
        Estudiante estudiante1 = new Estudiante("E1", "111", 17);
        Estudiante estudiante2 = new Estudiante("E2", "222", 18);
        Estudiante estudiante3 = new Estudiante("E3", "333", 19);
        Estudiante estudiante4 = new Estudiante("E4", "444", 20);
        Estudiante estudiante5 = new Estudiante("E5", "555", 21);
        Estudiante estudiante6 = new Estudiante("E6", "666", 22);
        //Creamos la matriz para almacenar todos los objetos (Estudiantes).
        Estudiante[] estudiantes = {estudiante1, estudiante2, estudiante3, estudiante4, estudiante5, estudiante6};

        // Llamamos la clase "Listas" y con ello el método de la clase.
        Listas.EstudiantesParImpar(estudiantes);
    }
}
