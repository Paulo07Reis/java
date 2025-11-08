package modulo_01_fundamentos_do_java.aula01;

public class Conta {
    private Double saldo;

    public Conta(Double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        saldo = saldo - valor;
    }

    public void exibirSaldo(){
        System.out.println("Saldo: " + saldo);
    }
}
