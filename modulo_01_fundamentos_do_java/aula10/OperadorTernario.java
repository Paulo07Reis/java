package modulo_01_fundamentos_do_java.aula10;

public class OperadorTernario {
    public static void main(String[] args) {
        String nome = "Paulo";
        int idade = 20;
        final int MAIOR_IDADE = 18;
        boolean maiorIdade = idade >= MAIOR_IDADE;
        String mensagem = nome + (maiorIdade ? " +18" : " -18");
        System.out.println(mensagem);
    }
}
