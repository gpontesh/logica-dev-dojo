package academy.devdojo.exercises;

import java.util.Scanner;

public class BasicArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Digite o 1º número: ");
        number1 = input.nextInt();
        System.out.print("Digite o 2º número: ");
        number2 = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1-number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1*number2));

        if (number2 != 0){
            System.out.println(number1 + " / " + number2 + " = " + (number1/ (float) number2));
        } else{
            System.out.println("Divisão por 0 é impossível.");
        }

    }
}
