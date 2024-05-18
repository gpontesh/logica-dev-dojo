package academy.devdojo.exercises.variables;

import java.util.Scanner;

public class ConvertDollarToReal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float price;
        float dollar;
        float convertedValue;

        System.out.print("Digite a cotação atual do Real -> ");
        price = input.nextFloat();
        System.out.print("Quantos dolares deseja converter em Reais? US$ ");
        dollar = input.nextFloat();

        convertedValue = dollar * price;

        System.out.printf("R$ %.2f", convertedValue);
    }
}
