package Unidad1;

    import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.close();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
    }
}

