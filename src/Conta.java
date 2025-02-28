public class Conta {
    private String nomeConta;
    private int numConta;
    private double saldo;


    public Conta(){
    }

    public Conta(String nomeConta, int numConta, double saldo){
        this.nomeConta = nomeConta;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        }else {
            System.out.println("Valor invalido para depósito.");
        }
    }

    public void sacar(double valor){
        double valorTotal = valor + 5.00;
        saldo -= valorTotal;
        System.out.println("Saque realizado. Taxa de $5.00 cobrada.");
    }

    public void exibirDados(){
        System.out.println("Número da conta: " + numConta);
        System.out.println("Nome do titular: " + nomeConta);
        System.out.println("Saldo: " + saldo);
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public void setNomeConta(String nomeConta){
        this.nomeConta = nomeConta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
