package academy.devdojo.exercises.decisionstructures;

import java.util.Scanner;

public class ElectricalCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;
        double volts;
        double amperes;
        double ohms;
        double watts;

        System.out.println("-----------------------------");
        System.out.println("|       C Á L C U L O S     |");
        System.out.println("|      E L É T R I C O S    |");
        System.out.println("-----------------------------");
        System.out.println("|           Opções          |");
        System.out.println("| 1 - Corrente elétrica     |");
        System.out.println("| 2 - Potência elétrica     |");
        System.out.println("| 3 - Resistência elétrica  |");
        System.out.println("| 4 - Tensão elétrica       |");
        System.out.println("-----------------------------");
        System.out.print("Digite a opção desejada: ");
        option = input.nextInt();
        System.out.println("-----------------------------");

        if (option == 1) {
            System.out.print("Digite a quantidade de Volts: ");
            volts = input.nextInt();
            System.out.print("Digite a quantidade de Ohms: ");
            ohms = input.nextInt();
            amperes = volts / ohms;
            System.out.println("-----------------------------");
            System.out.printf("Corrente elétrica: %.4f A \n", amperes);
            System.out.println("-----------------------------");
        } else if (option == 2) {
            System.out.print("Digite a quantidade de Volts: ");
            volts = input.nextInt();
            System.out.print("Digite a quantidade de Amperes: ");
            amperes = input.nextInt();
            watts = volts * amperes;
            System.out.println("-----------------------------");
            System.out.printf("Corrente elétrica: %.0f W \n", watts);
            System.out.println("-----------------------------");
        } else if (option == 3) {
            System.out.print("Digite a quantidade de Volts: ");
            volts = input.nextInt();
            System.out.print("Digite a quantidade de Amperes: ");
            amperes = input.nextInt();
            ohms = volts / amperes;
            System.out.println("-----------------------------");
            System.out.printf("Corrente elétrica: %.2f Ω \n", ohms);
            System.out.println("-----------------------------");
        } else if (option == 4) {
            System.out.print("Digite a quantidade de Ohms: ");
            ohms = input.nextInt();
            System.out.print("Digite a quantidade de Amperes: ");
            amperes = input.nextInt();
            volts = ohms * amperes;
            System.out.println("-----------------------------");
            System.out.printf("Corrente elétrica: %.0f V \n", volts);
            System.out.println("-----------------------------");
        } else {
            System.out.println("Opção inválida");
        }
    }
}