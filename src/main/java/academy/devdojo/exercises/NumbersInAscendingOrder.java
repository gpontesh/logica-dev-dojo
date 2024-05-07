package academy.devdojo.exercises;

import java.util.Scanner;

public class NumbersInAscendingOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int assistant;

        System.out.print("Digite o 1º número: ");
        firstNumber = input.nextInt();
        System.out.print("Digite o 1º número: ");
        secondNumber = input.nextInt();
        System.out.print("Digite o 1º número: ");
        thirdNumber = input.nextInt();

        if (firstNumber > secondNumber){
            assistant = secondNumber;
            secondNumber = firstNumber;
            firstNumber = assistant;
        } else if (firstNumber > thirdNumber){
            assistant = thirdNumber;
            thirdNumber = firstNumber;
            firstNumber = assistant;
        } else if (secondNumber > thirdNumber){
            assistant = thirdNumber;
            thirdNumber = secondNumber;
            secondNumber = assistant;
        }

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
    }
}
