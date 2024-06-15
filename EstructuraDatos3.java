
public class EstructuraDatos3 {
     public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 4, 5, 3, 2, 3, 1 };
        int valorViejo =3;
        int valorNuevo =9;
        
         for (int i = 0; i < numeros.length; i++) { // para recorrer cada numero del arreglo
             if ( numeros[i] == valorViejo){
                 numeros[i] = valorNuevo;  
                }
             }
          System.out.println(" El arreglo modificado es:");
                 for (int i = 0; i< numeros.length; i++) {
                     System.out.print(numeros[i]+" ");
         }
     }
}
                 
             
         
     
         
         
     
