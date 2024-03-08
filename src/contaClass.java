//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class contaClass {
    String nomeTitular;
    int numeroConta;
    String agencia;
    double saldoConta;
    String dataAbertura;

    public contaClass() {
    }

    void saca(double var1) {
        this.saldoConta -= var1;
    }

    void deposita(double var1) {
        this.saldoConta += var1;
    }

    double calculaRendimento() {
        return this.saldoConta * 0.1;
    }

    void recuperaDadosParaImpressao() {
        System.out.println("Nome do titular: " + this.nomeTitular);
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Saldo da conta: " + this.saldoConta);
        System.out.println("Data de abertura: " + this.dataAbertura);
    }
}
