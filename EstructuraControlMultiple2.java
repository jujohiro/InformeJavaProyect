
package EstructuraControlMultiple;


public class EstructuraControlMultiple2 {
    public static void main(String[] args) {
        int mes=8;
        String NombreMes = null;
        NombreMes = switch (mes){
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Septiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            case 12 -> "Diciembre";
            default -> "Mes no existente en calendario";
        };
            System.out.println("estamos en el mes : "+NombreMes);
        }
        
    }

