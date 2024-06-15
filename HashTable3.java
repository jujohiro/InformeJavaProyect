
import java.util.Hashtable;


public class HashTable3 {
       public static void main(String[] args) {
        // Crear un Hashtable para el inventario
        Hashtable<String, Integer> inventario = new Hashtable<>();
        
        // Agregar productos al inventario
        inventario.put("Manzanas", 50); 
        inventario.put("Naranjas", 30); 
        inventario.put("Platanos", 20); 
        
        // Verificar la existencia de un producto en el inventario
        String productoBuscado = "Naranjas"; 
        if (inventario.containsKey(productoBuscado)) { 
            System.out.println(productoBuscado + " estan disponibles en el inventario."); 
        } else {
            System.out.println(productoBuscado + " no estan disponibles en el inventario.");
        }
        
        // Actualizar la cantidad de un producto en el inventario
        String productoActualizar = "Manzanas"; 
        int nuevaCantidad = 75; 
        if (inventario.containsKey(productoActualizar)) { 
            inventario.put(productoActualizar, nuevaCantidad); 
            System.out.println("La cantidad de " + productoActualizar + " se ha actualizado a " + nuevaCantidad + ".");
        } else {
            System.out.println("No se puede actualizar " + productoActualizar + " porque no estan en el inventario.");
        }
        
        // Mostrar todos los productos disponibles en el inventario
        System.out.println("Inventario completo:");
        for (String producto : inventario.keySet()) { 
            System.out.println("Producto: " + producto + ", Cantidad: " + inventario.get(producto)); 
        }
    }
}

