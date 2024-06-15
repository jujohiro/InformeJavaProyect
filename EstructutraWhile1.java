
package EstructuraWhile;

import java.util.Scanner;

class EstructutraWhile1 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;  // Inicializamos la suma en 0
        int numero;

        System.out.println("Introduce un numero (0 para terminar):");
        numero = scanner.nextInt();  // Leemos el primer número

        while (numero != 0) {  // Condición: mientras el número no sea 0
            suma += numero;  // Sumamos el número a la suma
            System.out.println("Introduce un numero (0 para terminar):");
            numero = scanner.nextInt();  // Leemos el siguiente número
        }

        System.out.println("La suma total es: " + suma);
    }
}
    
    

