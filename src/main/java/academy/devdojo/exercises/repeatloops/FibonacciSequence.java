package academy.devdojo.exercises.repeatloops;

public class FibonacciSequence {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 1;
        int output;

        System.out.println(number1);
        System.out.println(number2);

        for (int i = 0; i <= 12; i++){
            output = number1 + number2;
            number1 = number2;
            number2 = output;
            System.out.println(output);
        }

    }
}
