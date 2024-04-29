package academy.devdojo.conditionalstructures.ifelse;

import java.util.Scanner;

public class MilitaryEnlistment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o sexo [M/F]: ");
        String sex = input.next();
        System.out.print("Digite a idade: ");
        int age = input.nextInt();

        if (sex.equalsIgnoreCase("M") && age >= 18) {
            System.out.println("Alistamento obrigatório");
        } else if (sex.equalsIgnoreCase("F") && age >= 18) {
            System.out.print("Você deseja se alistar? [S/N] ");
            String response = input.next();
            if (response.equalsIgnoreCase("S")) {
                System.out.println("Alistamento concluído com sucesso");
            } else {
                System.out.println("Não alistada");
            }
        } else {
            System.out.println("Alistamento não permitido");
        }
    }
}
