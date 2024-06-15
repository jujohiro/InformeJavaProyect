
package EstructuraWhile;

import java.util.Scanner;

// contar estudiantes aprobados
public class EstructuraWhile3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aprobados = 0;  
        int calificacion;

        System.out.println("Introduce las calificaciones de los estudiantes (un número negativo para terminar):");

        // Leer la primera calificación
        calificacion = scanner.nextInt();

        while (calificacion >= 0) {  // Condición: mientras la calificación no sea negativa
            if (calificacion >= 60) {  // Si la calificación es 60 o más, el estudiante ha aprobado
                aprobados++;
            }

            // Leer la siguiente calificación
            calificacion = scanner.nextInt();
        }

        System.out.println("El número de estudiantes aprobados es: " + aprobados);
    }
}
    

