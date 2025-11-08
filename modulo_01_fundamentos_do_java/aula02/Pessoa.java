package modulo_01_fundamentos_do_java.aula02;

public class Pessoa {
    private String nome;
    private Conta conta;

    public Pessoa(String nome, double saldo) {
        this.nome = nome;
        this.conta = new Conta(saldo);
    }

    public void financeiro(){
        conta.exibirSaldo();
    }
}
