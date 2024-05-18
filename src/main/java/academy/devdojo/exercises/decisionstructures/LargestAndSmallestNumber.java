package academy.devdojo.exercises.decisionstructures;

import java.util.Scanner;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;
        int fifthNumber;
        int counter = 0;
        int assistant;
        int largestNumber;
        int smallestNumber;

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

        while (counter <= 8) {
            if (firstNumber > secondNumber) {
                assistant = secondNumber;
                secondNumber = firstNumber;
                firstNumber = assistant;
            } else if (firstNumber > thirdNumber) {
                assistant = thirdNumber;
                thirdNumber = firstNumber;
                firstNumber = assistant;
            } else if (firstNumber > fourthNumber) {
                assistant = fourthNumber;
                fourthNumber = firstNumber;
                firstNumber = assistant;
            } else if (firstNumber > fifthNumber) {
                assistant = fifthNumber;
                fifthNumber = firstNumber;
                firstNumber = assistant;
            } else if (secondNumber > thirdNumber) {
                assistant = thirdNumber;
                thirdNumber = secondNumber;
                secondNumber = assistant;
            } else if (secondNumber > fourthNumber) {
                assistant = fourthNumber;
                fourthNumber = secondNumber;
                secondNumber = assistant;
            } else if (secondNumber > fifthNumber) {
                assistant = fifthNumber;
                fifthNumber = secondNumber;
                secondNumber = assistant;
            } else if (thirdNumber > fourthNumber) {
                assistant = fourthNumber;
                fourthNumber = thirdNumber;
                thirdNumber = assistant;
            } else if (thirdNumber > fifthNumber) {
                assistant = fifthNumber;
                fifthNumber = thirdNumber;
                thirdNumber = assistant;
            } else if (fourthNumber > fifthNumber) {
                assistant = fifthNumber;
                fifthNumber = fourthNumber;
                fourthNumber = assistant;
            }
            counter++;
        }

        smallestNumber = firstNumber;
        largestNumber = fifthNumber;

        System.out.println("Menor: " + smallestNumber);
        System.out.println("Maior: " + largestNumber);
    }
}