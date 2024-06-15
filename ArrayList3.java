
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> marcasCarros = new ArrayList<String>();
        
        marcasCarros.add("suzuki");
        marcasCarros.add("kia");
        marcasCarros.add("toyota");
        marcasCarros.add("renault");
        marcasCarros.add("fiat");
        marcasCarros.add("bmw");
        marcasCarros.add("dodge journey");
        marcasCarros.add("chevrolet");
        
        System.out.println("lista de marcas de carros: ");
        for (String marca : marcasCarros) {
            JOptionPane.showInputDialog(marca);
            
            
        }
        
        
    }
}
