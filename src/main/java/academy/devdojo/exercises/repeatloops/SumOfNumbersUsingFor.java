package academy.devdojo.exercises.repeatloops;

public class SumOfNumbersUsingFor {
    public static void main(String[] args) {
        int totalSum = 0;
        for (int i = 1; i <= 500; i++){
            totalSum = totalSum + i;

        }
        System.out.println("A soma total dos números de 1 a 500 é: " + totalSum);
    }
}
