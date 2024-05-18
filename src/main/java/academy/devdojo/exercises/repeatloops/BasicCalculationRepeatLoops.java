package academy.devdojo.exercises.repeatloops;

import java.util.Scanner;

public class BasicCalculationRepeatLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;
        int firstNumber = 0;
        int secondNumber = 0;
        double result;

        do {
            System.out.println("-----------------------------------");
            System.out.println("|        O P E R A Ç Õ E S        |");
            System.out.println("|          B Á S I C A S          |");
            System.out.println("-----------------------------------");
            System.out.println("|              OPÇÕES             |");
            System.out.println("|        1 - Adição               |");
            System.out.println("|        2 - Subtração            |");
            System.out.println("|        3 - Multiplicação        |");
            System.out.println("|        4 - Divisão              |");
            System.out.println("|        0 - Sair                 |");
            System.out.println("-----------------------------------");
            System.out.print("| Opção desejada: ");
            option = input.nextInt();

            if (option < 0 || option > 4) {
                System.out.println("Opção inválida");
            } else if (option == 0) {
                break;
            }
            else {
                System.out.print("Digite o 1º valor: ");
                firstNumber = input.nextInt();
                System.out.print("Digite o 2º valor: ");
                secondNumber = input.nextInt();
            }

            if (option == 1) {
                result = firstNumber + secondNumber;
                System.out.printf("%d + %d = %.0f \n", firstNumber, secondNumber, result);
            } else if (option == 2) {
                result = firstNumber - secondNumber;
                System.out.printf("%d - %d = %.0f \n", firstNumber, secondNumber, result);
            } else if (option == 3) {
                result = firstNumber * secondNumber;
                System.out.printf("%d x %d = %.0f \n", firstNumber, secondNumber, result);
            } else if (option == 4) {
                if (secondNumber > 0) {
                    result = (double) firstNumber / secondNumber;
                    System.out.printf("%d / %d = %.2f \n", firstNumber, secondNumber, result);
                } else {
                    System.out.println("Divisão por 0 é impossível");
                }
            }
        } while (true);
        System.out.println("Programa encerrado.");
    }
}
