package Unidad1;

public class EjercicioArreglo {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        int suma = 0;

        for (int i = 0; i < 10; i++) {
            suma = suma + numeros[i];
        }

        double promedio = (double) suma / 10;

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
}


