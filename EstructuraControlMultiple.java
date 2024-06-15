package EstructuraControlMultiple;


public class EstructuraControlMultiple {

    public static void main(String[] args) {
        
        int dia = 6;
String nombreDia;

nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";                               
            case 7 -> "Domingo";                              
            default -> "Día no valido";
    }; 
           System.out.println("Hoy es " + nombreDia);
    }
}
