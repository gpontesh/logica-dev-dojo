package academy.devdojo.exercises;

import java.util.Scanner;

public class RectangularBoxVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float boxLength;
        float boxWidth;
        float boxHeight;
        double boxVolume;

        System.out.print("Digite o comprimento da caixa: ");
        boxLength = input.nextFloat();
        System.out.print("Digite a largura da caixa: ");
        boxWidth = input.nextFloat();
        System.out.print("Digite a altura da caixa: ");
        boxHeight = input.nextFloat();

        boxVolume = (boxLength * boxWidth * boxHeight) * 1000000;

        System.out.printf("A caixa tem %.2f cm³", boxVolume);
    }

}
