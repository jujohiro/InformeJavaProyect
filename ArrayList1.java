
import java.util.ArrayList;


public class ArrayList1 {

    public static void main(String[] args) {
        
        ArrayList<String> listaNombres= new ArrayList<String>();
        
        listaNombres.add("pepe");
        listaNombres.add("juan");
        listaNombres.add("ramon");
        listaNombres.add("simon");
        listaNombres.add("carlos");
        
        System.out.println(listaNombres);
        listaNombres.add ("Elena");
        System.out.println(listaNombres);
        listaNombres.add(2, "Samuel");
        System.out.println(listaNombres);
    }
}
