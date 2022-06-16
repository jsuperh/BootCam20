package estructuras;

import poo.Abuelo;

import java.util.ArrayList;

public class Arreglos {

    public static void main(String[] args) {

        //arreglos1();
        //listarAbuelos();
        listarAbuelosArrayList();


    }

    static void arreglos1(){
        int [] num = new int[5];
        num[0] = 39;
        num[1] = -2;
        num[2] = -5;
        num[3] = 3;
        num[4] = 9;

        for (int i = 0; i < num.length; i++){
            System.out.printf("num[%2d]: %d\n", i, num[i]);
        }
        System.out.println("---------------------------");

        for(int numeros : num) {
            System.out.println(numeros);
        }
    }

    static void listarAbuelos(){

        Abuelo listarAbuelos[] = new Abuelo[4];

        listarAbuelos[0] = new Abuelo("Pedro","M", (short) 75,"Loreto");
        listarAbuelos[1] = new Abuelo("Juan","M", (short) 75,"Loreto");
        listarAbuelos[2] = new Abuelo("Mario","M", (short) 75,"Loreto");
        listarAbuelos[3] = new Abuelo("Pablo","M", (short) 75,"Loreto");

        for(Abuelo abuelos : listarAbuelos){
            System.out.println(abuelos);
        }
    }

    static void listarAbuelosArrayList(){

        ArrayList<Abuelo> listarAbuelos = new ArrayList<>();

        listarAbuelos.add(new Abuelo("Pedro","M", (short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Juan","M", (short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Pablo","M", (short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Mario","M", (short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Juan2","M", (short) 75,"Loreto"));
        listarAbuelos.add(new Abuelo("Juan3","M", (short) 75,"Loreto"));

        for(Abuelo abuelos : listarAbuelos){
            System.out.println(abuelos);
        }
    }



}
