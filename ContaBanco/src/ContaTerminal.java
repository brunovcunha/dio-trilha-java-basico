import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Bem vindo ao banco, vamos criar sua conta?");

        System.out.print("Infome seu numero de conta: ");
        numero = s.nextInt();
        s.nextLine();
        System.out.print("Informe sua Agencia: ");
        agencia = s.nextLine();
        System.out.print("Informe seu nome: ");
        nomeCliente = s.nextLine();
        System.out.print("Infome o saldo inicial: ");
        saldo = s.nextDouble();

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque ", nomeCliente, agencia, numero, saldo);

        s.close();

}
}
