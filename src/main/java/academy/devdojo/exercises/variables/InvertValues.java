package academy.devdojo.exercises.variables;

import java.util.Scanner;

public class InvertValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float number1 = 5.25f;
        float number2 = 25.65f;
        float auxiliaryNumber;

        auxiliaryNumber = number1;
        number1 = number2;
        number2 = auxiliaryNumber;

        System.out.print(number1 + " --- " + number2);
    }
}
