package modulo_01_fundamentos_do_java.exercicio01;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

        ContaCorrente conta01 = new ContaCorrente(
                "001",
                "777",
                "Paulo",
                "07-06-2004",
                1000.00
        );

        ContaCorrente conta02 = new ContaCorrente(
                "001",
                "777",
                "Paulo",
                "07-06-2004",
                1000.00
        );

        conta01.consultarExtrato();

        conta01.transferir(conta02, 100.00);

        conta01.consultarExtrato();

        conta01.saldoAtual();
    }
}
