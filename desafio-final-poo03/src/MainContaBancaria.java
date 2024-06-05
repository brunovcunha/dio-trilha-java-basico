import java.util.Scanner;

public class MainContaBancaria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(saldoInicial);

        double valorDeposito = scanner.nextDouble();

        conta.depositar(valorDeposito);

        System.out.printf("Saldo atual: %.1f\n", conta.getSaldo());

        double valorSaque = scanner.nextDouble();

        conta.sacar(valorSaque);

        System.out.printf("Saldo atual: %.1f\n", conta.getSaldo());

        // Aqui fechamos o scanner para evitar vazamento de recursos:
        scanner.close();
    }
}