package aplicacao;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        double deposito, saque;
        System.out.println(menu());
        int opcao = 1;
        // Loop infinito para manter o programa em execução até que o usuário decida
        // sair

        while (opcao != 0) {

            opcao = scanner.nextInt();
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas
            // pelo usuário.
            switch (opcao) {
                case 1:
                    deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.printf("Saldo atual: %.1f\n", saldo);

                    break;

                case 2:
                    saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                        break;
                    }

                    saldo -= saque;
                    System.out.printf("Saldo atual: %.1f\n", saldo);

                    break;

                case 3:
                    System.out.printf("Saldo atual: %.1f\n", saldo);

                    break;

                case 0:
                    System.out.println("Programa encerrado.");   
                    
                    break; 

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }

    public static String menu() {
        return " 1.Depositar\n 2.Sacar\n 3.Consultar Saldo\n 4.Sair";
    }

}