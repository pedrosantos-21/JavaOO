package br.com.caelum.contas.modelo;

public class Conta {
    protected double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return "Conta";
    }
}
