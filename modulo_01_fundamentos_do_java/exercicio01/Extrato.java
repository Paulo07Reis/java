package modulo_01_fundamentos_do_java.exercicio01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Extrato {
    private List<LocalDateTime> dataExtrato = new ArrayList<LocalDateTime>();
    private List<TipoDeTransacao> tipoDeTransacaoExtrato = new ArrayList<TipoDeTransacao>();
    private List<Double> valorExtrato = new ArrayList<Double>();


    public void inserirTransacao(LocalDateTime data, TipoDeTransacao tipo, Double valor){
        dataExtrato.add(data);
        tipoDeTransacaoExtrato.add(tipo);
        valorExtrato.add(valor);
    }

    public void exibirExtrato(){
        System.out.println("Extrato: ");
        for (int i = 0; i < valorExtrato.size() ; i++) {
            StringBuilder sb = new StringBuilder();

            sb.append("ID: ").append(i + 1).append(" | ");
            sb.append("Data: ").append(dataExtrato.get(i)).append(" | ");
            sb.append("Tipo de transação: ").append(tipoDeTransacaoExtrato.get(i)).append(" | ");
            sb.append("Valor: ").append(valorExtrato.get(i)).append(" | ");

            System.out.println(sb);
        }
        System.out.println("\n\n");
    }

    public void exibirEntreDatas(LocalDateTime origem, LocalDateTime fim){
        int indexOrigem = 0, indexFim = 0;

        for (int i = 0; i < dataExtrato.size(); i++) {
            if (dataExtrato.get(i).isEqual(origem)){
                indexOrigem = i;
            }
        }

        for (int i = indexOrigem; i < dataExtrato.size(); i++) {
            if (dataExtrato.get(i).isAfter(fim)){
                indexFim = i - 1;
            }
        }

        System.out.println("Extrato: ");
        for (int i = indexOrigem; i < indexFim ; i++) {
            StringBuilder sb = new StringBuilder();

            sb.append("ID: ").append(i + 1).append(" | ");
            sb.append("Data: ").append(dataExtrato.get(i)).append(" | ");
            sb.append("Tipo de transação: ").append(tipoDeTransacaoExtrato.get(i)).append(" | ");
            sb.append("Valor: ").append(valorExtrato.get(i)).append(" | ");

            System.out.println(sb);
        }
        System.out.println("\n\n");

        System.out.println();
    }
}
