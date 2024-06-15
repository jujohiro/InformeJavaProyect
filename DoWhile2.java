package DoWhile;

import javax.swing.JOptionPane;

class respuesta {
    public static void main(String[] args) {
        char respuesta;

do {
    respuesta = JOptionPane.showInputDialog("¿Desea continuar? (s/n): ").charAt(0);
} while (respuesta != 's' && respuesta != 'S');
    }
}
