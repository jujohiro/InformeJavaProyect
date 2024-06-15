
import java.util.HashMap;


public class HashMap1 {

    public static void main(String[] args) {
        // Crear un HashMap para almacenar los empleados y sus salarios
        HashMap<String, Double> empleados = new HashMap<>();
        
        // Agregar empleados y sus salarios
        empleados.put("Juan", 2500.00);
        empleados.put("Maria", 3000.00);
        empleados.put("Pedro", 2200.00);
        empleados.put("Ana", 2800.00);

        // Mostrar todos los empleados y sus salarios
        System.out.println("Registro de empleados:");
        for (String nombre : empleados.keySet()) {
            System.out.println("Empleado: " + nombre + ", Salario: $" + empleados.get(nombre));
        }

        // Actualizar el salario de un empleado
        String empleadoActualizar = "Pedro";
        if (empleados.containsKey(empleadoActualizar)) {
            empleados.put(empleadoActualizar, empleados.get(empleadoActualizar) + 500.00);
            System.out.println("Salario de " + empleadoActualizar + " actualizado a $" + empleados.get(empleadoActualizar));
        } else {
            System.out.println(empleadoActualizar + " no está en el registro.");
        }

        // Calcular el salario total de todos los empleados
        double salarioTotal = 0.0;
        for (double salario : empleados.values()) {
            salarioTotal += salario;
        }
        System.out.println("Salario total de todos los empleados: $" + salarioTotal);
    }
}
    
