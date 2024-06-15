
import java.util.HashMap;


public class HashMap3 {
    public static void main(String[] args) { 

        // Crear un HashMap para almacenar las calificaciones de los estudiantes
        HashMap<String, HashMap<String, Integer>> estudiantes = new HashMap<>();
        
        // Agregar estudiantes y sus calificaciones
        HashMap<String, Integer> calificacionesJuan = new HashMap<>();
        calificacionesJuan.put("Matemáticas", 90);
        calificacionesJuan.put("Historia", 85);
        calificacionesJuan.put("Ciencias", 95);
        estudiantes.put("Juan", calificacionesJuan);

        HashMap<String, Integer> calificacionesMaria = new HashMap<>();
        calificacionesMaria.put("Matemáticas", 78);
        calificacionesMaria.put("Historia", 88);
        calificacionesMaria.put("Ciencias", 80);
        estudiantes.put("Maria", calificacionesMaria);

        HashMap<String, Integer> calificacionesPedro = new HashMap<>();
        calificacionesPedro.put("Matemáticas", 85);
        calificacionesPedro.put("Historia", 70);
        calificacionesPedro.put("Ciencias", 90);
        estudiantes.put("Pedro", calificacionesPedro);

        // Obtener y mostrar las calificaciones de un estudiante
        String estudianteBuscado = "Maria";
        if (estudiantes.containsKey(estudianteBuscado)) {
            System.out.println("Calificaciones de " + estudianteBuscado + ":");
            HashMap<String, Integer> calificaciones = estudiantes.get(estudianteBuscado);
            for (String materia : calificaciones.keySet()) {
                System.out.println(materia + ": " + calificaciones.get(materia));
            }
        } else {
            System.out.println(estudianteBuscado + " no está registrado.");
        }

        // Calcular el promedio de calificaciones de un estudiante
        String estudiantePromedio = "Juan";
        if (estudiantes.containsKey(estudiantePromedio)) {
            HashMap<String, Integer> calificaciones = estudiantes.get(estudiantePromedio);
            int suma = 0;
            for (int calificacion : calificaciones.values()) {
                suma += calificacion;
            }
            double promedio = suma / (double) calificaciones.size();
            System.out.println("Promedio de " + estudiantePromedio + ": " + promedio);
        } else {
            System.out.println(estudiantePromedio + " no está registrado.");
        }
    }
}
        
    

