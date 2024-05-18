package academy.devdojo.repeatloops.loopwhile;

import java.util.Scanner;

public class OddUpToInputNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;

        System.out.print("Digite até qual número gostaria de contar os ímpares: ");
        number = input.nextInt();

        while (counter <= number){
            System.out.println(counter);
            counter += 2;
        }

    }
}
