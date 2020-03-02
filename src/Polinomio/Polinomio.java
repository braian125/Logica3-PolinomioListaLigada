package Polinomio;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Polinomio.util.Termino;

public class Polinomio {
    public static void main(String[] args) throws Exception {
        char opc;

        JTextField coeficiente = new JTextField(5);
        JTextField exponente = new JTextField(5);

        do{
            opc = Menu();

            switch (opc) {
                case '1':
                    JPanel nuevoTermino = new JPanel();
                    nuevoTermino.add(new JLabel("Coeficiente:"));
                    nuevoTermino.add(coeficiente);
                    nuevoTermino.add(Box.createHorizontalStrut(15));
                    nuevoTermino.add(new JLabel("Exponente:"));
                    nuevoTermino.add(exponente);

                    ListaLigadaSimpleConCabeza listaPolinomio = new ListaLigadaSimpleConCabeza();
                    Nodo cA = listaPolinomio.getCabeza();

                    int addTermino;
                    do {
                        coeficiente.setText("");
                        exponente.setText("");
                        int result = JOptionPane.showConfirmDialog(null, nuevoTermino, 
                                "Crear termino", JOptionPane.OK_CANCEL_OPTION);
                        if (result == JOptionPane.OK_OPTION) {
                            Nodo n = new Nodo(new Termino(Integer.parseInt(coeficiente.getText()), Integer.parseInt(exponente.getText())));
                            cA.setLiga(n);
                            cA = n;
                        }
                        
                        addTermino = JOptionPane.showConfirmDialog(
                            null, "Desea continuar agregando términos?",
                            "An Inane Question",
                        JOptionPane.YES_NO_OPTION);
                    } while(addTermino == JOptionPane.YES_OPTION);

                    System.out.println(listaPolinomio);
                    break;
            }
        } while(opc != '6');
        
    }

    static char Menu()
    {
        char opcion;
        do{
            opcion = JOptionPane.showInputDialog(null, 
                "\n" + "Seleccione alguna opción" + "\n\n"
                +  "[1] - Crear polinomio"        + "\n"
                +  "[2] - Mostrar polinomio"      + "\n"
                +  "[3] - Multiplicar polinomio"  + "\n"
                +  "[4] - Dividir polinomio"      + "\n"
                +  "[5] - Derivar polinomio"      + "\n"
                +  "[6] - Salir"                  + "\n"
                + "\n"
            ).charAt(0);
        } while(opcion < '1' || opcion > '6');
        return opcion;
    }
}