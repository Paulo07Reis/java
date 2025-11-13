package modulo_01_fundamentos_do_java.aula13;

public class Fluxo {
    public static void main(String[] args) {
        double saldo = 17.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado <= saldo){
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }

        System.out.println(saldo);
    }
}
