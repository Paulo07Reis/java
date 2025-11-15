package modulo_01_fundamentos_do_java.aula17;

import java.util.Random;

public class While {
    public static void main(String[] args) {
        boolean acordado = true;
        int i = 0;
        while(acordado){
            System.out.println(i++);
            acordado = !(new Random().nextInt(20) == i);
        }
        System.out.println(acordado);
    }
}
