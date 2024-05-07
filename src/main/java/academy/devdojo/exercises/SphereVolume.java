package academy.devdojo.exercises;

import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float raySphere;
        double volumeSphere;

        System.out.print("Digite o raio da esfera: ");
        raySphere = input.nextFloat();

        volumeSphere = ((4/3f) * 3.141592654) * (Math.pow(raySphere, 3));

        System.out.printf("Volume da esfera: %.2f m³", volumeSphere);
    }
}
