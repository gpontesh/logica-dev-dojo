package academy.devdojo.exercises;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float degreesFahrenheit;
        float degreesCelsius;

        System.out.print("Digite quantos graus Fahrenheit gostaria de covnerter para Celsius: ");
        degreesFahrenheit = input.nextFloat();

        degreesCelsius = (degreesFahrenheit - 32) * (5 / 9f);

        System.out.println(degreesFahrenheit + "ºF são " + degreesCelsius +"ºC");
    }
}
