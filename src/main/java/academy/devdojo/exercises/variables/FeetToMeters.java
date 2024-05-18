package academy.devdojo.exercises.variables;

import java.util.Scanner;

public class FeetToMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float feet;
        float meters;

        System.out.printf("Digite a quantidade de pés: ");
        feet = input.nextFloat();

        meters = (feet * 0.3048f);

        System.out.printf("%.4f m", meters);
    }
}
