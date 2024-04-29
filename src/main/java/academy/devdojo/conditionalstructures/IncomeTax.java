package academy.devdojo.conditionalstructures;

public class IncomeTax {
    public static void main(String[] args) {
        double salary = 10850;

        if (salary < 0) {
            System.out.println("Não existe salário negativo, impossível calcular a taxa");
        } else if (salary <= 1903.98) {
            System.out.println("Você está isento do imposto de renda");
        } else if (salary > 1903.98 && salary <= 2826.65) {
            System.out.println("Você pagará 7.5% de taxa");
            System.out.println("Total do imposto: " + salary * 0.075);
        } else if (salary > 2826.65 && salary <= 3751.05) {
            System.out.println("Você pagará 15% de taxa");
            System.out.println("Total do imposto: " + salary * 0.15);
        } else if (salary > 3751.05 && salary <= 4664.68) {
            System.out.println("Você pagará 22.5% de taxa");
            System.out.println("Total do imposto: " + salary * 0.225);
        } else {
            System.out.println("Você pagará 27.5% de taxa");
            System.out.println("Total do imposto: " + salary * 0.275);
        }
    }
}
