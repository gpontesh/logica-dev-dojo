public class CalculateSalaryPercentage {
    public static void main(String[] args){
        float salary = 2541.36f;
        float percentage = 10;
        float percentageOfSalary = salary * (percentage/100);

        System.out.println(percentage + "% de " + salary + " é: R$ " + percentageOfSalary);
    }
}
