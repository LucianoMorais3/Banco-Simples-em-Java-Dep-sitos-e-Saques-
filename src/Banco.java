import java.util.Locale;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta1 = new Conta();

        System.out.println("Informe o número da conta: ");
        conta1.setNumConta(sc.nextInt());

        System.out.println("Informe o nome do titular: ");
        conta1.setNomeConta(sc.next());
        System.out.println("Haverá depósito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);
        conta1.setSaldo(0);

        if (resposta == 's' || resposta == 'S') {
            System.out.print("Informe o valor do depósito inicial: ");
            conta1.setSaldo(sc.nextDouble());
        }
        conta1.exibirDados();

        System.out.print("Informe um valor para depósito: ");
        double valorDeposito = sc.nextDouble();
        conta1.depositar(valorDeposito);
        conta1.exibirDados();

        System.out.print("Informe um valor para saque: ");
        double valorSaque = sc.nextDouble();
        conta1.sacar(valorSaque);
        conta1.exibirDados();

        sc.close();
    }
}
