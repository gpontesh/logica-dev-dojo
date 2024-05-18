package academy.devdojo.exercises.variables;

import java.util.Scanner;

public class ProjectileVelocityCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float speed;
        float distance;
        float time;

        System.out.print("Digite a distância: ");
        distance = input.nextFloat();
        System.out.print("Digite o tempo: ");
        time = input.nextFloat();

        speed = (distance * 1000) / (time * 60);

        System.out.printf("%.2f m/s", speed);
    }
}
