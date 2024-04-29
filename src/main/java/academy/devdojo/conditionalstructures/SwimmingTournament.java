package academy.devdojo.conditionalstructures;

import java.util.Scanner;

public class SwimmingTournament {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do competidor: ");
        String name = input.next();
        System.out.print("Digite a idade do competidor: ");
        int age = input.nextInt();

        if (age < 0){
            System.out.println("Idade incorreta");
        } else if (age > 0 && age <= 10){
            System.out.println(name + " participará da categoria Infantil");
        } else if (age > 10 && age <= 15){
            System.out.println(name + " participará da categoria Juvenil");
        } else if (age > 15 && age <= 19) {
            System.out.println(name + " participará da categoria Pré Adulto");
        } else {
            System.out.println(name + " participará da categoria Adulto");
        }
    }
}
