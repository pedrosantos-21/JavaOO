package br.com.Caelum.contas;

public class TesteCliente {
    public static void main(String[] args) {
        // Criar um novo cliente
        Cliente cliente = new Cliente("João", "Rua Principal");

        // Exibir informações do cliente
        cliente.exibirInformacoes();
    }
};

