package academy.devdojo.exercises.variables;

import java.util.Scanner;

public class PredecessorSuccessor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int predecessor;
        int sucessor;

        System.out.print("Digite um número: ");
        number = input.nextInt();

        predecessor = number - 1;
        sucessor = number + 1;

        System.out.println("Número: " + number);
        System.out.println("Antecessor: " + predecessor);
        System.out.println("Sucessor: " + sucessor);
    }
}