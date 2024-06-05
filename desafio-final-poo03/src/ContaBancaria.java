public class ContaBancaria {
    // TODO: Crie uma variável para armazenar o saldo da conta
    private double saldo;

    // TODO: Crie o construtor que inicializa a conta com um saldo inicial fornecido pelo usuário:
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        // Aqui é incrementado o saldo da conta com o valor do depósito:
        this.saldo += valor;
        // É impresso uma mensagem indicando que o depósito foi feito:
        System.out.println("Deposito feito.");
    }

    // Método para realizar saque da conta:
    public void sacar(double valor) {
        // Verificamos se o valor do saque é maior que o saldo disponível na conta:
        if (valor > saldo) {
            // Se for, imprime uma mensagem informando que o saque não pode ser realizado por saldo insuficiente:
            System.out.println("Saldo insuficiente. Saque não realizado.");
        } else {
            // Caso contrário, realiza o saque subtraindo o valor do saldo da conta:
            this.saldo -= valor;
            // Imprime uma mensagem indicando que o saque foi feito:
            System.out.println("Saque feito.");
        }
    }

    // Método para obter o saldo atual da conta
    public double getSaldo() {
        return saldo;
    }
}
