package exceptions;

import java.util.Scanner;

public class EjemploException {

    public static void main(String[] args) {

        System.out.println("Introduzca los numeros enteros");

        Scanner scanner = new Scanner(System.in);

        int maximo = Integer.MIN_VALUE;

        for(int i = 0; i < 4; i++){
            boolean datoInvalido = false;
            int numero = 0;
            do{
                try{
                    System.out.println("N° "+ i + ":  ");
                    numero = Integer.parseInt(scanner.nextLine());
                    datoInvalido = true;
                }catch (Exception e){
                    System.out.println("El dato no es el correcto, los datos deben ser enteros");
                    e.printStackTrace();
                }
            } while(!datoInvalido);
            if(numero > maximo){
                maximo = numero;
            }
        }
        System.out.println("el valor maximo introducido es " + maximo);
    }

}
