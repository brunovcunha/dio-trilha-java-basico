package aplicacao;

import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        // TODO: Crie um loop 'for' para iterar sobre os saques:
        for (int i = 0; i <= limiteDiario;) {
            // TODO: Solicite ao usuário o valor do saque:
            double saque = scanner.nextDouble();

            // TODO: Verifique se o valor do saque é zero, encerrando as transações:
            if (saque == 0.0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            if(limiteDiario == 0.0 || saque > limiteDiario){
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

            if (saque <= limiteDiario) {
                limiteDiario -= saque;

                System.out.printf("Saque realizado. Limite restante: %.1f\n", limiteDiario);
            }

        }

        // TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor
        // do saque do limite diário:

        // TODO: Informe que o saque foi realizado e mostre o limite restante:

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}
