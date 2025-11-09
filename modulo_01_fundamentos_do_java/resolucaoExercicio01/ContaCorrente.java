package modulo_01_fundamentos_do_java.resolucaoExercicio01;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class ContaCorrente {
    Integer numero;
    Integer agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    Double saldo;
    Boolean ativo = true;

    Double consultarSaldo(){
       return saldo;
    }

    List consultarExtrato(LocalDate dataInicial, LocalDate dataFinal){
        return Collections.emptyList();
    }

    void cancelar(String justificativa){}

    void sacar(Double valorSolicitado){}

    void tranferir(ContaCorrente contaDestino, Double valorDeTransferencia){}
}
