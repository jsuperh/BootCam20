package poo.herencia;

import poo.Abuelo;
import poo.Hijo;
import poo.Padre;

public class Herencia {

    public static void main(String[] args) {

        Abuelo abuelito = new Abuelo("Pedro","M", (short) 75,"Loreto");
        Padre papa = new Padre("Juan", "M",(short) 42,"Lima", (float) 1.75, "Soltero");
        Hijo hijito = new Hijo("Mario", "M",(short) 15,"Ica", (float) 1.60, "Soltero","Marito", 15);

        System.out.println("Abuelo "+ abuelito);
        System.out.println("Padre "+ papa);
        System.out.println("Hijo "+ hijito);


    }

}
