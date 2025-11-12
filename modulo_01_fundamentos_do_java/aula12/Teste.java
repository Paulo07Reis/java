package modulo_01_fundamentos_do_java.aula12;

public class Teste {
    public static void main(String[] args) {
        Aluno paulo = new Aluno("Paulo", 21);

        paulo.setNome("Paulo Reis");
        paulo.setIdade(-1);

        System.out.println(paulo.getNome());
        System.out.println(paulo.getIdade());
    }
}
