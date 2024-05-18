package academy.devdojo.repeatloops.loopwhile;

import java.util.Scanner;

public class CalculateTaxDepositSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option = 0;

        while (option != 3) {
            System.out.println("---------------------------------------");
            System.out.println("|      M E N U  D E  O P Ç Õ E S      |");
            System.out.println("---------------------------------------");
            System.out.println("|         1 - Calcular Imposto        |");
            System.out.println("|         2 - Depositar Salário       |");
            System.out.println("|         3 - Sair                    |");
            System.out.println("---------------------------------------");
            System.out.print("Opção desejada: ");
            option = input.nextInt();
            System.out.println("---------------------------------------");
        }
        System.out.println("Programa Encerrado");
    }
}
