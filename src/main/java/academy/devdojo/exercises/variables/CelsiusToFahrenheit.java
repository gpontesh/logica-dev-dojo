package academy.devdojo.exercises.variables;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float degreesCelsius;
        float degreesFahrenheit;

        System.out.print("Digite quantos graus Celsius gostaria de converter para Fahrenheit: ");
        degreesCelsius = input.nextFloat();

        degreesFahrenheit = (degreesCelsius * (9 / 5f)) + 32;

        System.out.println(degreesCelsius + "ºC são " + degreesFahrenheit + "ºF");
    }
}
