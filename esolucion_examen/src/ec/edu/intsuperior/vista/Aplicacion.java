package ec.edu.intsuperior.vista;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Aplicacion {

    public static void main(String[] args) {

        Inicio window = new Inicio();
        window.inicializar();
        window.setTitle("Ingreso de empleados");
        window.setVisible(true);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //window.setSize(720, 500);
        window.setLocationRelativeTo(null);

    }

}
