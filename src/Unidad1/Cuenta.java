package Unidad1;


public class Cuenta {
    public static void main(String[] args) {
        int dineroInicial = 1000;
        int retiroSemanal = 200;
        int semanas = 4;
        int totalRetirado = retiroSemanal * semanas;
        int dineroFinal = dineroInicial - totalRetirado;

        System.out.println("Dinero inicial: " + dineroInicial);
        System.out.println("Total retirado: " + totalRetirado);
        System.out.println("Dinero final en la cuenta: " + dineroFinal);
    }
}

