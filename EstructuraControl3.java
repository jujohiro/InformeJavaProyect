
package EstructuraControlMultiple;


public class EstructuraControl3 {
    public static void main(String[] args) {
        int dia = 6;
String mensaje;

switch (dia) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
        mensaje = "Dia laboral";
        break;
    case 6:
    case 7:
        mensaje = "Fin de semana";
        break;
    default:
        mensaje = "Dia no válido";
}

System.out.println("Estado del dia: " + mensaje);


    }
}
