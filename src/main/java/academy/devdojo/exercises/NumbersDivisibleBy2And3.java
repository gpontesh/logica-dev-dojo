package academy.devdojo.exercises;

import java.util.Scanner;

public class NumbersDivisibleBy2And3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;
        int fifthNumber;

        System.out.print("Digite o 1º número: ");
        firstNumber = input.nextInt();
        System.out.print("Digite o 2º número: ");
        secondNumber = input.nextInt();
        System.out.print("Digite o 3º número: ");
        thirdNumber = input.nextInt();
        System.out.print("Digite o 4º número: ");
        fourthNumber = input.nextInt();
        System.out.print("Digite o 5º número: ");
        fifthNumber = input.nextInt();

        System.out.println("Números divisíveis por 2 ou 3: ");

        if ((firstNumber % 2 == 0) || (firstNumber % 3 == 0)) {
            System.out.print(firstNumber + " - ");
        }
        if ((secondNumber % 2 == 0) || (secondNumber % 3 == 0)) {
            System.out.print(secondNumber + " - ");
        }
        if ((thirdNumber % 2 == 0) || (thirdNumber % 3 == 0)) {
            System.out.print(thirdNumber + " - ");
        }
        if ((fourthNumber % 2 == 0) || (fourthNumber % 3 == 0)) {
            System.out.print(fourthNumber + " - ");
        }
        if ((fifthNumber % 2 == 0) || (fifthNumber % 3 == 0)) {
            System.out.print(fifthNumber);
        }
    }
}