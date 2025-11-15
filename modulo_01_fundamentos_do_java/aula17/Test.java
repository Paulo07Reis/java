package modulo_01_fundamentos_do_java.aula17;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        boolean dormiu = false;
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
            if (dormiu = new Random().nextInt(20) == i){
                System.out.println("Dormiu");
                dormiu = true;
                break;
            }
        }
    }
}
