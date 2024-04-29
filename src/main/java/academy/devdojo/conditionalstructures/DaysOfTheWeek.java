package academy.devdojo.conditionalstructures;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = input.nextInt();

        if (number == 1) {
            System.out.println("Segunda-feira");
        } else if (number == 2) {
            System.out.println("Terça-feira");
        } else if (number == 3) {
            System.out.println("Quarta-feira");
        } else if (number == 4) {
            System.out.println("Quinta-feira");
        } else if (number == 5) {
            System.out.println("Sexta-feira");
        } else if (number == 6) {
            System.out.println("Sábado");
        } else if (number == 7) {
            System.out.println("Domingo");
        } else{
            System.out.println("Dia inválido");
        }
    }
}
