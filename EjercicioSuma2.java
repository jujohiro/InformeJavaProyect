
public class EjercicioSuma2 {
    public static void main(String[] args) {
        
       int[] numeros ={5, 8, 15, 22, 35, 58};
       int suma=0;
       
        for (int i = 0; i < numeros.length; i +=2) {
            suma += numeros[i];
            System.out.println("La suma de los elementos en posiciones pares es: "+ suma);
            
        }
    }
    
}
