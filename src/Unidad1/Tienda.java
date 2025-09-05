package Unidad1;

import java.util.Scanner;

public class Tienda {
    public static void main (String[] args) {

        double camiseta=25;
        double pantalon = 30;

        double descuentoGeneral = 0.15;
        double descuentoAdicional = 0.05;

        double camisetaConDescuento = camiseta-(camiseta*descuentoGeneral);

        double pantalonConDescuento = pantalon-(pantalon*descuentoGeneral);

        double segundaCamiseta = camisetaConDescuento-(camisetaConDescuento*descuentoAdicional);

        double total = camisetaConDescuento+pantalonConDescuento+segundaCamiseta;

        System.out.println("Primera camiseta: " + camisetaConDescuento);
        System.out.println("Segunda camiseta: " + segundaCamiseta);
        System.out.println("Pantalón: " + pantalonConDescuento);
        System.out.println("Total: " + total);
    }
}

