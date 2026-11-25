public class ContaBancaria {
    private int numero;
    private double saldo;

    public ContaBancaria(int numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = Math.max(0, saldoInicial);
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do deposito deve ser maior que zero.");
            return;
        }

        saldo += valor;
        System.out.printf("Deposito realizado! Novo saldo: R$ %.2f%n", saldo);
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser maior que zero.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.printf("Saque realizado! Novo saldo: R$ %.2f%n", saldo);
        }
    }

    public void exibirDados() {
        System.out.println("Numero da conta: " + numero);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}
