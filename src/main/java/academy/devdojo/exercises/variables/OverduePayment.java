package academy.devdojo.exercises.variables;

import java.util.Scanner;

public class OverduePayment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float value;
        int time;
        float tax;
        float provision;

        System.out.print("Digite o valor em aberto: R$ ");
        value = input.nextFloat();
        System.out.print("Digite o tempo de atraso: ");
        time = input.nextInt();
        System.out.print("Digite a taxa de juros: ");
        tax = input.nextFloat();

        provision = value + (value * (tax / 100) * time);

        System.out.printf("Valor da prestação em atraso: R$ %.2f", provision);
    }
}
