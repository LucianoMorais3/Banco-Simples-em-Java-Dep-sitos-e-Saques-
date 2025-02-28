public class Conta {
    private String nomeTitular;
    private int numConta;
    private double saldo;
    private static final double TAXA_SAQUE = 5.00;

    public Conta(int numConta, String nomeTitular, double saldoInicial) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        double valorTotal = valor + TAXA_SAQUE;
        if (valorTotal > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= valorTotal;
            System.out.println("Saque de R$" + valor + " realizado. Taxa de R$5.00 cobrada.");
        }
    }

    public void exibirDados() {
        System.out.println("\n--- Dados da Conta ---");
        System.out.println("Número da conta: " + numConta);
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.printf("Saldo: R$%.2f\n", saldo);
    }

    public int getNumConta() {
        return numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }
}
