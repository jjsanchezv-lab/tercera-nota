package Unidad1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Elige una opcion");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int numMenu= scanner.nextInt();
        scanner.close();

        System.out.print("Ingrese primer numero : ");
        int num1= scanner.nextInt();
         System.out.print("Ingrese segundo numero : ");
        int num2= scanner.nextInt();


        switch (numMenu) {
            case 1:
                 
                 System.out.println("La suma de sus dos numeros es : "+ (num1+num2)); 
                
                break;
            case 2:
                System.out.println("La resta de sus dos numeros es : "+ (num1-num2)); 

                break;
            case 3:
                System.out.println("La multiplicacion de sus dos numeros es : "+ (num1*num2)); 

                break;
            case 4:
                System.out.println("La division de sus dos numeros es : "+ (num1/num2)); 
                break;
        
            default:

            System.out.println("Opcion no valida");

                break;
        }


    }
    
}
