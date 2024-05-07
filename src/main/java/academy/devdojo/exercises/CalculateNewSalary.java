package academy.devdojo.exercises;

import java.util.Scanner;

public class CalculateNewSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float baseSalary;
        float adjustmentPercentage;
        float newSalary;

        System.out.print("Digite o salário base do funcionário: R$ ");
        baseSalary = input.nextFloat();
        System.out.print("Digite o percentual de ajuste: ");
        adjustmentPercentage = input.nextFloat();

        newSalary = baseSalary + (baseSalary * adjustmentPercentage) / 100;

        System.out.printf("Novo salário: R$ %.2f", newSalary);
    }
}
