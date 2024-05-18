package academy.devdojo.exercises.variables;

import java.util.Scanner;

public class CircleAreaCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double circleArea;

        System.out.print("Digite o raio do círculo: ");
        double circleRadius = input.nextDouble();

        circleArea = 3.141592654 * (circleRadius * circleRadius);

        System.out.println("A área do círculo é: " + circleArea);
    }
}
