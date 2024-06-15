
public class Constantes {

    public static void main(String[] args) {
       final int EDAD_MINIMA=18;
       
       int EdadUsuario=15;
       
       if(EdadUsuario>=EDAD_MINIMA){
           System.out.println(" ¡Bienvenido, eres mayor de edad: "+EdadUsuario);
       }else{
           if(EdadUsuario<EDAD_MINIMA){
               System.out.println("¡Lo siento, eres menor de edad, no puedes ingresar: "+"la edad minima es: " +EDAD_MINIMA);
           }
        
    }
       
       
    }
}
