package modulo_01_fundamentos_do_java.exercicio01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import static modulo_01_fundamentos_do_java.exercicio01.Staus.ATIVO;
import static modulo_01_fundamentos_do_java.exercicio01.Staus.CANCELADA;
import static modulo_01_fundamentos_do_java.exercicio01.TipoDeTransacao.DESPESA;
import static modulo_01_fundamentos_do_java.exercicio01.TipoDeTransacao.RECEITA;


public class ContaCorrente {
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    private Staus status;
    private Double saldoDaConta;
    private String NomeDoCliente;
    private String numeroDaConta;
    private Date DataDeNascimento;
    private String numeroDaAgencia;
    private String motivoCancelamento;
    private Extrato extrato = new Extrato();

    public ContaCorrente(String numeroDaConta, String numeroDaAgencia, String nomeDoCliente, String dataDeNascimento, Double saldoDaConta) throws ParseException {
        this.numeroDaConta = numeroDaConta;
        this.numeroDaAgencia = numeroDaAgencia;
        this.NomeDoCliente = nomeDoCliente;
        this.DataDeNascimento = sdf.parse(dataDeNascimento);
        this.saldoDaConta = saldoDaConta;
        this.status = ATIVO;
        this.motivoCancelamento = "";

        extrato.inserirTransacao(LocalDateTime.now(), RECEITA, saldoDaConta);
    }

    public void saque(Double valor){
        System.out.println("Iniciando Saque: ");
        if (saldoDaConta - valor < 0){
            System.out.println("Saldo insuficiente!\n\n");
            return;
        }

        saldoDaConta -= valor;
        System.out.println("Saque realizado!\n\n");
        System.out.println("Saldo atual: " + saldoDaConta + "\n\n");
        extrato.inserirTransacao(LocalDateTime.now(), DESPESA, valor);
    }

    public void deposito(Double valor){
        saldoDaConta += valor;
    }

    public void transferir(ContaCorrente destino, Double valor){
        System.out.println("Iniciando Transferência: ");
        if (saldoDaConta < valor){
            System.out.println("Saldo para transação insuficiente!\n\n");
            return;
        }

        saque(valor);
        destino.deposito(valor);
        System.out.println("Transação Realizada!\n\n");
        destino.extrato.inserirTransacao(LocalDateTime.now(), RECEITA, valor);
    }

    public void cancelamento(String motivo){
        status = CANCELADA;
        motivoCancelamento = motivo;
    }

    public void consultarExtrato(){
        extrato.exibirExtrato();
    }

    public void saldoAtual(){
        System.out.println("Saldo: " + saldoDaConta);
    }
}
