package academy.devdojo.exercises.variables;

import java.util.Scanner;

public class NetSalaryCalculation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float hoursWorked;
        float hourlyRate;
        float basicSalary;
        float percentageDiscounts;
        float totalDiscounts;
        float netSalary;

        System.out.print("Digite a quantidade de Horas Trabalhadas: ");
        hoursWorked = input.nextFloat();
        System.out.print("Digite o valor da Hora de Trabalho: ");
        hourlyRate = input.nextFloat();

        basicSalary = hoursWorked * hourlyRate;

        System.out.print("Digite o percentual de descontos: ");
        percentageDiscounts = input.nextFloat();

        totalDiscounts = (percentageDiscounts / 100) * basicSalary;

        netSalary = basicSalary - totalDiscounts;

        System.out.println("---------------------------------");
        System.out.println("Salário base -> R$ " + basicSalary);
        System.out.println("Total de descontos -> R$ " + totalDiscounts);
        System.out.println("Salário líquido -> R$ " + netSalary);
        System.out.println("---------------------------------");
    }
}
