
import java.util.Hashtable;


public class HashTable {

    public static void main(String[] args) {
        
         Hashtable<String, Integer> hashtable = new Hashtable<>();
         
         hashtable.put("Uno", 1); 
        hashtable.put("Tres", 3); 
        hashtable.put("Cuatro", 4);
        
        hashtable.remove("Dos"); // Eliminar la entrada con clave "Dos"
        hashtable.remove("Cuatro");
        
         System.out.println("Elementos del hashtable despues de eliminar:");
        for (String key : hashtable.keySet()) { // Usar un bucle for-each para recorrer las claves del Hashtable
            System.out.println("Clave: " + key + ", Valor: " + hashtable.get(key));}
        
    }
}
