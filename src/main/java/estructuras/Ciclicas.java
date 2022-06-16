package estructuras;

public class Ciclicas {
    public static void main(String[] args) {

        //conFor();
        //conDo();
        conWhile();

    }

    static void conFor(){
        for(int i = 1; i <= 100; i++){
            if(i % 5 == 0)
                System.out.println(i);
        }
    }

    static void conDo(){
        int i = 1;
        do{
            if(i % 5 == 0)
                System.out.println(i);
            i++;
        }while(i <= 100);
    }

    static void conWhile(){

        int i = 1;
        while (i <= 100){
            if(i % 5 == 0)
                System.out.println(i);
            i++;
        }

    }



}
