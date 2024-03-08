//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class testeConta {
    testeConta() {
    }

    public static void main(String[] var0) {
        conta var1 = new conta();
        var1.nomeTitular = "Pedro Vinicius";
        var1.numeroConta = 123;
        var1.agencia = "56338-7";
        var1.saldoConta = 50.0;
        var1.dataAbertura = "01/07/2010";
        var1.deposita(100.0);
        var1.saca(20.0);
        System.out.println("Saldo atual: " + var1.saldoConta);
        System.out.println("Rendimento mensal: " + var1.calculaRendimento());
        var1.recuperaDadosParaImpressao();
    }
}

