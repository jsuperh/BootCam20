package estructuras;

import java.util.Scanner;

public class Condicional1 {

    public static void main(String[] args) {

        System.out.println("Ingrese el día de la semana");

        Scanner scanner = new Scanner(System.in);
        String dia = scanner.nextLine();

        switch (dia){
            case "lunes":
                System.out.println("base de datos");
                break;
            case "martes":
                System.out.println("programacion 1");
                break;
            case "miercoles":
                System.out.println("redes");
                break;
            case "jueves":
                System.out.println("data mining");
                break;
            case "viernes":
                System.out.println("proyectos");
                break;
            default:
                System.out.println("ese día no tiene clases o es incorrecto");

        }


    }
}
