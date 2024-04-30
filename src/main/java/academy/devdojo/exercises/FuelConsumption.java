package academy.devdojo.exercises;

import java.util.Scanner;

public class FuelConsumption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float travelTime;
        float automobileSpeed;
        float travelDistance;
        float fuelQuantity;

        System.out.print("Digite o tempo de viagem: ");
        travelTime = input.nextFloat();
        System.out.print("Digite a velocidade do automóvel: ");
        automobileSpeed = input.nextFloat();

        travelDistance = travelTime * automobileSpeed;
        fuelQuantity = travelDistance / 12;

        System.out.printf("Serão gastos %.2f litros de combustível", fuelQuantity);
    }
}
