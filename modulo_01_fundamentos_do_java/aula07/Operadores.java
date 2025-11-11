package modulo_01_fundamentos_do_java.aula07;

public class Operadores {
    public static void main(String[] args) {
        //Atribuição (=)
        double number = 7.8;
        char sexo = 'M';
        String nome = "Paulo " + "Reis";
        System.out.println(nome);
        String teste = 1 + 2 + " é O RESULTADO DE 1 + 2";
        System.out.println(teste);
        boolean verdade = (1 + 2) > 5;
        System.out.println(verdade);

        //Operadores aritmeticos
        int modulo = 20 %3;
        System.out.println(modulo);

        int n1 = 10;
        int n2 = 20;
        n1 += n2;
        System.out.println(n1);

    }
}
