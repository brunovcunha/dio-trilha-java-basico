package aplicacao;

import java.util.Scanner;

public class VerificacaoChequeEspecial { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        double saldo = scanner.nextDouble(); 
        double saque = scanner.nextDouble(); 
        double limiteChequeEspecial = 500; 

        // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:
        if(saque > saldo && saque > (saldo + limiteChequeEspecial)){
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");
        } else if(saque > saldo && saque < (saldo + limiteChequeEspecial)){
            saque -= saldo;
            limiteChequeEspecial -= saque;
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
        } else {
            saldo -= saque;
            System.out.println("Transação realizada com sucesso.");
        }
  

// Fechamos o objeto Scanner para liberar os recursos:
        scanner.close(); 
    }
}