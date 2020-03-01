package Polinomio;

import Polinomio.util.Termino;

/**
 * Nodo
 */
public class Nodo {

    private Termino termino;
    private Nodo liga;

    Nodo(Termino t) {
        termino = t;
    }

    public Termino getTermino() {
        return termino;
    }

    public void setTermino(Termino termino) {
        this.termino = termino;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
}