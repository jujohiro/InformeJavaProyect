
public class EjercicioSuma3 {
    public static void main(String[] args) {
        
        int[] arreglo1 = {1, 2, 3, 4, 5};
        int[] arreglo2= {6, 7, 8, 9, 10};
        int[] sumarArreglos = new int[arreglo1.length];
        for (int i = 0; i < arreglo1.length; i++) {
            sumarArreglos[i] = arreglo1[i] + arreglo2[i];    
        }
        System.out.println("La suma de los dos arreglos es: ");
        for (int i = 0; i < sumarArreglos.length; i++) {
            System.out.print(sumarArreglos[i]+" ");
            
        }
    }
    
}
