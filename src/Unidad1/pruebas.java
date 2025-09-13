package Unidad1;

import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        Scanner consulta =new Scanner(System.in);

        System.out.print("Ingrese numero para el arreglo: ");
        int dato= consulta.nextInt();
        
        int[] numbers = {dato};
        System.out.println(numbers.length);

    }
    
}
