package modulo_01_fundamentos_do_java.aula01;

public class sintaxe_e_semantica {
    public static void main(String[] args) {
        Conta conta = new Conta(100.00);

        conta.exibirSaldo();
        conta.sacar(50.00);
        conta.exibirSaldo();
    }
}
