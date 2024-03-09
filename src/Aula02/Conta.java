package Aula02;

public class Conta {

    public static void main(String[] args) {
        Conta minhaConta = new Conta("Pedro");

        minhaConta.deposita(1000);
        minhaConta.saca(500);

        minhaConta.recuperaDadosParaImpressao();
    }

    private String nomeTitular;
    private int numeroConta;
    private String agencia;
    private double saldoConta;
    private String dataAbertura;
    private static int contadorContas = 0;
    private int identificador;

    // Construtor que recebe o nome do titular opcionalmente
    public Conta(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.saldoConta = 0.0;
        this.numeroConta = ++contadorContas;
    }

    // Getters e setters
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public int getIdentificador() {
        return identificador;
    }

    // Métodos para operações bancárias
    public void saca(double valor) {
        if (valor > 0 && valor <= saldoConta) {
            saldoConta -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void deposita(double valor) {
        if (valor > 0) {
            saldoConta += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public double calculaRendimento() {
        return saldoConta * 0.1; // Exemplo simples de rendimento de 10% ao ano
    }

    public void recuperaDadosParaImpressao() {
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo da conta: " + saldoConta);
        System.out.println("Data de abertura: " + dataAbertura);
    }
}
