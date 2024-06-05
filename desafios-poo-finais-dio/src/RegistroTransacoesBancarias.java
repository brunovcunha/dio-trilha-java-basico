import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double valorTransacao = 0.0;

        int quantidadeTransacoes = scanner.nextInt();

        // TODO: Crie a lista para armazenar as transações:
        List transacoeList = new ArrayList<>();

        // TODO: Implemente um loop 'for' para iterar sobre as transações:

        for (int i = 0; i < quantidadeTransacoes; i++) {
            // Aqui é verificar o tipo de transação e atualiza o saldo da conta de acordo:
            char tipoTransacao = scanner.next().charAt(0);

            if (tipoTransacao == 'D' || tipoTransacao == 'd') {
                valorTransacao = scanner.nextDouble();
                saldo += valorTransacao;
                // TODO: Adicione a transação à lista:
                String transacaoDeposito = i + 1 + ". Deposito de " + valorTransacao;

                transacoeList.add(transacaoDeposito);

            } else if (tipoTransacao == 'S' || tipoTransacao == 's') {
                valorTransacao = scanner.nextDouble();
                saldo -= valorTransacao;
                // TODO: Adiciona a transação à lista
                String transacaoSaque = i + 1 + ". Saque de " + valorTransacao;

                transacoeList.add(transacaoSaque);

            } else {
                // Se o tipo de transação não for reconhecido, exibe uma mensagem de erro
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--;
            }
        }

        // Aqui é exibido o saldo final e a lista de transações ao final do processo:
        System.out.println("\nSaldo: " + saldo);
        System.out.println("\nTransacoes:");

        // TODO: Crie um loop 'for' para exibir cada transação na lista:
        for (Object object : transacoeList) {
            // TODO: Agora exibA o número da transação seguido da descrição da transação:
            System.out.println(object);
        }

        

        scanner.close();

    }

    // Fechamos o scanner para liberar recursos:
}
