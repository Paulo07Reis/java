package modulo_01_fundamentos_do_java.aula03;

public class Identacao {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                System.out.println("Número par: " + i);
            } else {
                System.out.println("Número ímpar: " + i);
            }
        }
    }
}
