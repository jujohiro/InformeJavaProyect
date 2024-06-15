public class EstructuraDatos1 {

    public static void main(String[] args) {
        
        double[] notas ={85.5, 90.0, 78.5, 88.0, 92.5};
        double suma=0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];     
        }
        double promedio = suma/notas.length;
        System.out.println(" El promedio de las notas es: "+ promedio);
        }
        
    }

