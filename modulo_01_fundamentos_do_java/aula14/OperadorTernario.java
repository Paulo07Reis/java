package modulo_01_fundamentos_do_java.aula14;

public class OperadorTernario {
    public static void main(String[] args) {
        int nota = 6;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? fluxoIntermediario() :"Reprovado";
        System.out.println(resultado);
    }

    public static String fluxoIntermediario(){
        System.out.println("Estude um pouco mais!");
        return "Recuperação";
    }
}
