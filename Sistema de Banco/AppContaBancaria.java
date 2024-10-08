//  Criação da Class App


package BankingSystem;
import java.util.Scanner;
public class App2{

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
        ContaBancaria contaBancaria1 = new ContaBancaria();
        ContaBancaria contaBancaria2 = new ContaBancaria();
       
        System.out.println("Informe o número do Titular da conta 1:");
        String titular01 = sc.next();
       
        System.out.println("Informe o número do Titular da conta 2:");
        String titular02 = sc.next();

        System.out.println("Informe quantos depósitos serão feitos na primeira conta:");
        int nDepositos = sc.nextInt();
       
        for(int i = 1; i <= nDepositos; i++){
        System.out.println("Informe o valor a ser depositado na primeira conta");
        contaBancaria1.depositar(sc.nextDouble());
       
        }

        System.out.println("Informe o valor a ser depositado na segunda conta");
        contaBancaria2.depositar(sc.nextDouble());
       
        System.out.println("Informe o valor do saque a ser feito na segunda conta");
        contaBancaria2.sacar(sc.nextDouble());
       
        System.out.println("Informe o valor que deseja ser transferido da conta 2 para conta 1");
        double valor = sc.nextDouble();
        contaBancaria2.transferir(contaBancaria1, valor);
        
        System.out.println("Saldo na Conta 1: " + contaBancaria1.getSaldo());
        System.out.println("Saldo na conta 2: " + contaBancaria2.getSaldo());
}
}
