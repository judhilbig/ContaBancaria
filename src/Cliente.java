public class Cliente {
    private String nome;
    private String cpf;
    private ContaBancaria conta;
    private Gerente gerente;

    public Cliente(String nome, String cpf, ContaBancaria conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public ContaBancaria getConta() {
        return conta;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public void exibirDados() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        conta.exibirDados();
        System.out.println("Gerente: " +
                (gerente != null ? gerente.getNome() : "Nao associado"));
    }
}
