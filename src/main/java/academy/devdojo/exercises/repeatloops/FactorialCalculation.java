package academy.devdojo.exercises.repeatloops;

import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int result;

        System.out.print("Digite um número: ");
        number = input.nextInt();

        result = number;
        System.out.print(number + "! = ");
        for (int i = number - 1; i > 0; i--) {
            result = result * (number - 1);
            number = i;
        }
        System.out.print(result);
    }
}
