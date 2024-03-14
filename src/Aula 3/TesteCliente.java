package Aula

public class TesteCliente {
    public static void main(String[] args) {
        // Criar um novo cliente
        Cliente cliente = new Cliente("João", "Rua Principal");

        // Exibir informações do cliente
        cliente.exibirInformacoes();
    }
}

public class Cliente {
    private String nome;
    private String endereco;

    // Construtor
    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método para exibir informações do cliente
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
    }
}

