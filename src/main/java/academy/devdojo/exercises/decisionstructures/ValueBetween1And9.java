package academy.devdojo.exercises.decisionstructures;

import java.util.Scanner;

public class ValueBetween1And9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Digite um valor: ");
        number = input.nextInt();

        if (number > 1 && number < 9){
            System.out.println("Dentro do valor");
        } else {
            System.out.println("Fora do valor permitido");
        }
    }
}
