package academy.devdojo.exercises.variables;

import java.util.Scanner;

public class PowerOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Digite o número para saber as potências: ");
        number = input.nextInt();

        System.out.println(number + " ^ 2 = " + Math.pow(number, 2));
        System.out.println(number + " ^ 3 = " + Math.pow(number, 3));
        System.out.println(number + " ^ 10 = " + Math.pow(number, 10));
    }
}
