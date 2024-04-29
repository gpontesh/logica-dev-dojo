package academy.devdojo.conditionalstructures;

public class NumberOddOrEven {
    public static void main(String[] args){
        int number = 201;

        if (number % 2 == 0){
            System.out.println("O número " + number + " é PAR");
        } else {
            System.out.println("O número " + number + " é ÍMPAR");
        }
    }
}
