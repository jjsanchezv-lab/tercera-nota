package Unidad1;

public class pruebas {
    public static void main(String[] args) {
        int numero1 = 3;
        int numero2 = 5;
        int numero3 = 1;
        int numeroMax ;

        for (int i = 0; i < 4 ; i++) {
            if (numero1>numero2 && numero1>numero3) {
                numeroMax=numero1;

                
            } else if (numero2>numero1 && numero2>numero3) {
                numeroMax=numero2;
                
            } else {
                numeroMax=numero3;
            }
            
        }

    }
}

