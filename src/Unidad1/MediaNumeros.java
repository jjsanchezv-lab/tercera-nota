package Unidad1;

import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese primer numero: ");
    int numero1=scanner.nextInt();
    System.out.print("Ingrese segundo numero: ");
    int numero2=scanner.nextInt();
    System.out.print("Ingrese tercer numero: ");
    int numero3=scanner.nextInt();
    scanner.close();

    double mediaNum= (numero1+numero2+numero3)/3;

    System.out.println("La media de los tres numeros es: " + mediaNum );
    
  }
}
