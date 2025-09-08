package Unidad1;

public class NumPares {
    public static void main(String[] args) {
        int contador=0;
        for (int i = 1; i<=100 ; i++) {
            if (i%2==0) {
                System.out.println(""+ i);
                contador++;
            }
            
        }
        System.out.println("Hay "+ contador + " numeros pares del 1 al 100");
    }
    
}
