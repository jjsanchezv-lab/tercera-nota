package Unidad1;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.print("Ingrese primer numero: ");
    int numero1=scanner.nextInt();
    System.out.print("Ingrese segundo numero: ");
    int numero2=scanner.nextInt();
    System.out.print("Ingrese tercer numero: ");
    int numero3=scanner.nextInt();
    scanner.close();

    if ((numero1>numero2) && (numero1<numero3)) {

        System.out.println("Verdadero");
    } else {

        System.out.println("Falso");
    }
    }
    
}
