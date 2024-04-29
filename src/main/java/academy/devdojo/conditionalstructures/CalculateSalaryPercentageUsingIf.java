package academy.devdojo.conditionalstructures;

public class CalculateSalaryPercentageUsingIf {
    public static void main(String[] args) {
        float salary = 4700.5f;
        float result;
        if (salary <= 4500) {
            result = salary * 0.15f;
            System.out.println("15% de " + salary + " = " + result);
        } else {
            result = salary * 0.30f;
            System.out.println("30% de " + salary + " = " + result);
        }
    }
}
