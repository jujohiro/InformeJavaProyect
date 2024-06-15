 import java.util.HashMap;
class hashMap {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar el inventario de productos
        HashMap<String, Producto> inventario = new HashMap<>();
        
        // Agregar productos al inventario
        inventario.put("Manzana", new Producto("Manzana", 50, 0.5));
        inventario.put("Banana", new Producto("Banana", 30, 0.2));
        inventario.put("Cereza", new Producto("Cereza", 20, 1.0));

        // Mostrar el inventario completo
        System.out.println("Inventario de productos:");
        for (String nombre : inventario.keySet()) {
            Producto producto = inventario.get(nombre);
            System.out.println(producto);
        }

        // Actualizar la cantidad de un producto
        String productoActualizar = "Manzana";
        if (inventario.containsKey(productoActualizar)) {
            Producto producto = inventario.get(productoActualizar);
            producto.setCantidad(producto.getCantidad() + 10);
            System.out.println("Cantidad de " + productoActualizar + " actualizada a " + producto.getCantidad());
        } else {
            System.out.println(productoActualizar + " no está en el inventario.");
        }

        // Calcular el valor total del inventario
        double valorTotal = 0.0;
        for (Producto producto : inventario.values()) {
            valorTotal += producto.getCantidad() * producto.getPrecio();
        }
        System.out.println("Valor total del inventario: $" + valorTotal);
    }
}

// Clase Producto para representar los productos en el inventario
class Producto {
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + ": Cantidad = " + cantidad + ", Precio = $" + precio;
    }
}

