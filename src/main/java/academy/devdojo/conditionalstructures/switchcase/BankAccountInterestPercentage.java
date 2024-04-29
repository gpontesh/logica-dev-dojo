package academy.devdojo.conditionalstructures.switchcase;

import java.util.Scanner;

public class BankAccountInterestPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println(" 1 - Conta Poupança");
        System.out.println(" 2 - Conta Corrente");
        System.out.println(" 3 - Conta Investimento");
        System.out.println("-------------------------------");
        System.out.print("Digite o tipo de conta bancária: ");
        int accountType = input.nextInt();

        switch (accountType) {
            case 1:
                System.out.println("0.05% de juros");
                break;
            case 2:
                System.out.println("0.02% de juros");
                break;
            case 3:
                System.out.println("0.10% de juros");
                break;
            default:
                System.out.println("Conta inválida");
        }
    }
}
