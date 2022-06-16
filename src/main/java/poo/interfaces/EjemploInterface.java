package poo.interfaces;

import poo.Hijo;

public class EjemploInterface {

    public static void main(String[] args) {

        Hijo hijo = new Hijo();

        hijo.iniciaJuego();
        hijo.jugar();
        hijo.finalizaJuego();

    }

}
