package academy.devdojo.exercises.repeatloops;

import java.util.Scanner;

public class PellEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int counter = 1;
        int result;
        int wholePart = 0;

        System.out.print("Digite um número: ");
        number = input.nextInt();
        System.out.print("√" + number);

        do {
            result = number - counter;
            counter += 2;
            number = result;
            wholePart += 1;
        } while (result > 2);
        System.out.print(" = " + wholePart);
    }
}
