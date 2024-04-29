package academy.devdojo.variables;

public class PercentageCalculationWithReusableVariable {
    public static void main(String[] args){
        float salary = 5000;
        double result;

        result = salary * 0.3;
        System.out.println("30% de " + salary + " = " + result);

        result = salary * 0.15;
        System.out.println("15% de " + salary + " = " + result);

        result = salary * 0.05;
        System.out.println("5% de " + salary + " = " + result);
    }
}
