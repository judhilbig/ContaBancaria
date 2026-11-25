import java.util.ArrayList;

public class Gerente {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Gerente(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void adicionarCliente(Cliente cliente) {
        if (cliente == null) {
            return;
        }

        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
            cliente.setGerente(this);
        }
    }

    public void listarClientes() {
        System.out.println("\nClientes do gerente " + nome + ":");

        if (clientes.isEmpty()) {
            System.out.println("Este gerente ainda nao possui clientes.");
            return;
        }

        for (Cliente cliente : clientes) {
            System.out.println("------------------------------");
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Conta: " + cliente.getConta().getNumero());
            System.out.printf("Saldo: R$ %.2f%n", cliente.getConta().getSaldo());
        }
    }
}
