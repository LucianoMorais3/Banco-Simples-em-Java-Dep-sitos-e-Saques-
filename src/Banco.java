import java.util.Locale;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Informe o nome do titular: ");
        String nomeTitular = sc.nextLine();

        System.out.print("Haverá depósito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);

        double saldoInicial = 0;
        if (resposta == 's' || resposta == 'S') {
            System.out.print("Informe o valor do depósito inicial: ");
            saldoInicial = sc.nextDouble();
        }

        Conta conta1 = new Conta(numeroConta, nomeTitular, saldoInicial);
        conta1.exibirDados();

        System.out.print("\nInforme um valor para depósito: ");
        double valorDeposito = sc.nextDouble();
        conta1.depositar(valorDeposito);
        conta1.exibirDados();

        System.out.print("\nInforme um valor para saque: ");
        double valorSaque = sc.nextDouble();
        conta1.sacar(valorSaque);
        conta1.exibirDados();

        sc.close();
    }
}

