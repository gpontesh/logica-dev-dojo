package academy.devdojo.exercises.decisionstructures;

import java.util.Scanner;

public class MultiplicationGreatherThan30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int result;

        System.out.print("Digite um número: ");
        number = input.nextInt();

        result = number * 2;

        if (result >= 30){
            System.out.print(number + " x 2 = " + result);
        }
    }
}
