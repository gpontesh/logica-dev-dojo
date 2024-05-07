package academy.devdojo.exercises;

import java.util.Scanner;

public class SchoolAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float firstNote;
        float secondNote;
        float thirdNote;
        float fourthNote;
        double gradeAverage;

        System.out.print("Digite a 1ª nota: ");
        firstNote = input.nextFloat();
        System.out.print("Digite a 2ª nota: ");
        secondNote = input.nextFloat();
        System.out.print("Digite a 3ª nota: ");
        thirdNote = input.nextFloat();
        System.out.print("Digite a 4ª nota: ");
        fourthNote = input.nextFloat();

        gradeAverage = (firstNote + secondNote + thirdNote + fourthNote) / 4;

        if (gradeAverage < 50) {
            System.out.printf("Média: %.2f \nALUNO REPROVADO", gradeAverage);
        } else if (gradeAverage == 50) {
            System.out.printf("Média: %.2f \nALUNO EM RECUPERAÇÃO", gradeAverage);
        } else {
            System.out.printf("Média: %.2f \nALUNO APROVADO", gradeAverage);
        }
    }
}
