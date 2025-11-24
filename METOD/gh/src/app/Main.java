package app;

import domain.Estudiante;
import domain.Materia;
import services.GestionHorarios;

public class Main {
    public static void main(String[] args) {
        GestionHorarios gestion = new GestionHorarios();
    
        // Creación de materias y sus horarios
    
        Materia cal = new Materia("Cálculo","CALTD", 4);
        cal.agregarHorario("Jueves 8-10 am");
        cal.agregarHorario("Viernes 8-10 am");

        Materia prog = new Materia("Programacion", "PROG01", 2);
        prog.agregarHorario("Lunes 6-8 am");
        prog.agregarHorario("Sábado 8-10 am");

        Materia fis = new Materia("Física", "FISIC1", 4);
        fis.agregarHorario("Lunes 2-4 pm");
        fis.agregarHorario("Jueves 4-7 pm");

        // Registrar las materias
        gestion.registarMaterias(cal);
        gestion.registarMaterias(prog);
        gestion.registarMaterias(fis);
         
        // Crear estudiantes 
        Estudiante e1 = new Estudiante("Keiner", "192605");
        Estudiante e2 = new Estudiante("Grissell", "192606");
        Estudiante e3 = new Estudiante("Miryian", "162662");

        // Registrar los estudiantes
        gestion.inscribirEstudiantes(e1);
        gestion.inscribirEstudiantes(e2);
        gestion.inscribirEstudiantes(e3);

        // Inscribir cada estudiante en las materias
        e1.inscribirMateria(fis, "Jueves 4-7 pm");
        e1.inscribirMateria(prog, "Lunes 6-8 am");

        e2.inscribirMateria(cal, "Jueves 8-10 am");
        e3.inscribirMateria(cal, "Viernes 8-10 am");

        fis.mostrarHorariosDisponibles();
        e1.mostrarHorarioCompletoEstudiante();
    }
}
