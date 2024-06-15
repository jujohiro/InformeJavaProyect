

public class EstructurasDatos2{
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        // Declaramos e inicializamos el arreglo con 5 elementos
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) { 
            suma += numeros[i];
            System.out.println(" La suma de los elementos del arreglo es:"+ suma);
        }
    }}