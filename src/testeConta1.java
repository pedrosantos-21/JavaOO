class testeConta1 {
    public static void main(String[] args) {
        conta c1 = new conta();
        c1.nomeTitular = "Pedro Vinicius";
        c1.numeroConta = 123;
        c1.agencia = "56338-7";
        c1.saldoConta = 50.0;
        c1.dataAbertura = "01/07/2010";
        c1.deposita(100.0);
        c1.saca(20.0);
        System.out.println("Saldo atual: " + c1.saldoConta);
        System.out.println("Rendimento mensal: " + c1.calculaRendimento());
        c1.recuperaDadosParaImpressao();
    }
}