package poo;

import poo.interfaces.Ijuego;

public class Hijo extends  Padre implements Ijuego {

    private String apodo;
    private int juegos;

    public Hijo() {
    }

    public Hijo(String nombre, String genero, short edad, String lugarResidencia, float altura, String estadoCivil, String apodo, int juegos ) {
        super(nombre, genero, edad, lugarResidencia, altura, estadoCivil);
        this.apodo = apodo;
        this.juegos = juegos;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getJuegos() {
        return juegos;
    }

    public void setJuegos(int juegos) {
        this.juegos = juegos;
    }

    @Override
    public String toString() {
        return "Hijo{" +
                "nombre='" + getNombre() + '\'' +
                ", genero='" + getGenero() + '\'' +
                ", edad=" + getEdad() +
                ", lugarResidencia='" + getLugarResidencia() + '\'' +
                "altura=" + getAltura() +
                ", estadoCivil='" + getEstadoCivil() + '\'' +
                "apodo='" + apodo + '\'' +
                ", juegos=" + juegos +
                '}';
    }

    public void devuelvaInformacion(){
        System.out.println("Soy el hijo y estoy jugando");
    }

    @Override
    public void iniciaJuego() {
        System.out.println("Esta comenzando el juego");
    }

    @Override
    public void jugar() {
        System.out.println("Estoy jugando");
    }

    @Override
    public void finalizaJuego() {
        System.out.println("El juego ya acabo");
    }
}
