
import java.util.Hashtable;


public class HashTable2 {
    public static void main(String[] args) {
        
      Hashtable<Integer, String> hashtable = new Hashtable<>();
        
        hashtable.put(1, "Manzana");
        hashtable.put(2, "Pera");
        hashtable.put(3, "Maracuya");
        
        System.out.println("clave 1:"+ hashtable.get(1));
         System.out.println("clave 2:"+ hashtable.get(2));
          System.out.println("clave 3:"+ hashtable.get(3));
    }
}
