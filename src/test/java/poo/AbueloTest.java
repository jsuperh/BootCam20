package poo;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import poo.interfaces.EjemploInterface;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

class AbueloTest {

    Abuelo abuelo;


    @BeforeEach
    void iniciandoMetodo() {
        System.out.println("iniciando metodo");
        abuelo = new Abuelo("Pedro","M", (short) 75,"Loreto");
    }

    @Test
    void finalizandoMetodo() {
        System.out.println("Finaliza el metodo");
    }

    @Test
    void testNombreAbuelo() {
        //Abuelo abuelo = new Abuelo("Pedro","M", (short) 75,"Loreto");

        String nombreEsperado = "Pedro";
        String nombreReal = abuelo.getNombre();

        Assertions.assertEquals(nombreEsperado, nombreReal);
        Assertions.assertEquals(75, abuelo.getEdad());
        Assertions.assertNotNull(abuelo.getLugarResidencia(), () -> "No existe el lugar");
        Assertions.assertTrue(18 < abuelo.getEdad());
    }

    @Test
    void comparaReferencias() {
        Abuelo abuelo1 = new Abuelo("Pedro","M", (short) 75,"Loreto");
        Abuelo abuelo2 = new Abuelo("Pedro","M", (short) 75,"Loreto");

        //no son iguales, a pesar de tener los mismos atributos con los mismos valores
        Assertions.assertNotEquals(abuelo1,abuelo2);
    }

    @Test
    void testHijoPadre() {
        Hijo hijito = new Hijo("Mario", "M",(short) 15,"Ica", (float) 1.60, "Soltero","Marito", 15);
        Assertions.assertInstanceOf(Padre.class, hijito);

    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void soloWindows() {
        System.out.println("se ejcuto sòlo en Windows");
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.MAC})
    void soloLinuxMac() {
        System.out.println("se ejcuto sòlo Linux y Mac");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void testJre8() {
        System.out.println("solo se ejecuta el jdk 8");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void testJre11() {
        System.out.println("solo se ejecuta el jdk 11");
    }

    @Test
    void imprimeSystemProperties() {
        Properties properties = System.getProperties();
        properties.forEach( (k,v) -> System.out.println(k + ": "+ v));
    }
}