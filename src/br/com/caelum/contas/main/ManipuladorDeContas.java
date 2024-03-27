package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class ManipuladorDeContas {
    public void criaConta(Evento evento) {
        String tipo = evento.getSelecionadoNoRadio("tipo");
        Conta conta;
        if (tipo.equals("Conta Corrente")) {
            conta = new ContaCorrente();
        } else {
            conta = new ContaPoupanca();
        }
        conta.deposita(evento.getDouble("valorInicial"));
    }

    public void saca(Evento evento) {
        Conta conta = (Conta) evento.getSelecionadoNoCombo("conta");
        double valor = evento.getDouble("valorOperacao");
        conta.saca(valor);
    }

    public void transfere(Evento evento) {
        Conta origem = (Conta) evento.getSelecionadoNoCombo("contaOrigem");
        Conta destino = (Conta) evento.getSelecionadoNoCombo("contaDestino");
        double valor = evento.getDouble("valorTransferencia");
        origem.saca(valor);
        destino.deposita(valor);
    }
}
