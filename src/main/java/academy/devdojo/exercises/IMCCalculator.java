package academy.devdojo.exercises;

import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float weight;
        float height;
        float imc;

        System.out.print("Digite o seu peso: ");
        weight = input.nextFloat();
        System.out.print("Digite sua altura: ");
        height = input.nextFloat();

        imc = (float) (weight / (Math.pow(height, 2)));
        System.out.printf("IMC: %.2f \n", imc);

        if (imc < 10) {
            System.out.println("Desnutrição Grau V");
        } else if (imc >= 10 && imc < 13) {
            System.out.println("Desnutrição Grau IV");
        } else if (imc >= 13 && imc < 16) {
            System.out.println("Desnutrição Grau III");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Desnutrição Grau II");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Desnutrição Grau I");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Pré Obesidade");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade Grau III");
        }
    }
}
