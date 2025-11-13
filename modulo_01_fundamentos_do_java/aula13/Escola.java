package modulo_01_fundamentos_do_java.aula13;

public class Escola {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7){
            System.out.println("Aprovado!");
        } else if (nota >= 5){
           fluxoIntermediario();
        } else {
            System.out.println("Reprovado!");
        }
    }

    public static void fluxoIntermediario(){
        System.out.println("Recuperação");
        System.out.println("Estude um pouco mais!");
    }
}
