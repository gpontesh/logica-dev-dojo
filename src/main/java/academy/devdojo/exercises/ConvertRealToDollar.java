package academy.devdojo.exercises;

import java.util.Scanner;

public class ConvertRealToDollar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float price;
        float real;
        float convertedValue;

        System.out.print("Digite a cotação atual do Dólar -> ");
        price = input.nextFloat();
        System.out.print("Quantos reais deseja converter em Dólar? R$ ");
        real = input.nextFloat();

        convertedValue = real / price;

        System.out.printf("US$ %.2f", convertedValue);
    }
}
