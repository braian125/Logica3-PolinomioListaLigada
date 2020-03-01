package Polinomio;

import Polinomio.util.Termino;

/**
 * PolinomioListaSimpleConCabeza
 */
public class PolinomioListaSimpleConCabeza {

    private final Nodo cabeza;

    /**
     * Constructor
     */
    PolinomioListaSimpleConCabeza() {
        cabeza = new Nodo(null);
        cabeza.setLiga(null);
    }

    /**
     * Obtener el nodo cabeza de la lista
     *
     * @return
     */
    public Nodo getCabeza() {
        return cabeza;
    }

    public int getGrado() throws Exception {
        Nodo primero = cabeza.getLiga();
        if (primero == null) {
            return 0;
        }
        return primero.getTermino().getE();
    }

    @Override
    public String toString() {
        StringBuilder polinomio = new StringBuilder();
        Nodo p = cabeza.getLiga();
        while (!finRecorrido(p)) {
            Termino ti = p.getTermino();
            double j = ti.getC();
            int i = ti.getE();
            // Para adicionar el simbolo del coeficiente para numeros positivos, excluyendo el simbolo + del primer termino si es positivo.
            if (j >= 0) {
                polinomio.append("+");
            }
            polinomio.append(j).append("X^").append(i).append(" ");
            p = p.getLiga();
        }
        return polinomio.toString();
    }

    private boolean finRecorrido(Nodo p) {
        return p == null;
    }
    
}