package academy.devdojo.exercises;

import java.util.Scanner;

public class CanVolumeCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float circleRadiusCan;
        float canHeight;
        double canVolume;

        System.out.print("Qual o valor do raio da circunferência da lata (CM): ");
        circleRadiusCan = input.nextFloat();
        System.out.print("Qual a altura da lata (CM): ");
        canHeight = input.nextFloat();

        canVolume = (3.14 * (circleRadiusCan * circleRadiusCan)) * canHeight;

        System.out.printf("Volume: %.2f cm³", canVolume);
    }
}
