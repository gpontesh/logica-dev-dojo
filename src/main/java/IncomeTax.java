public class IncomeTax {
    public static void main(String[] args) {
        double salary = 5000;
        double incomeTaxAmount;

        if (salary < 0) {
            System.out.println("Não existe salário negativo, impossível calcular a taxa");
        } else if (salary <= 1903.98) {
            System.out.println("Você está isento do imposto de renda");
        } else if (salary > 1903.98 && salary <= 2826.65) {
            System.out.println("Você pagará 7.5% de taxa");
            incomeTaxAmount = salary * 0.075;
            System.out.println("Total do imposto: " + incomeTaxAmount);
        } else if (salary > 2826.65 && salary <= 3751.05) {
            System.out.println("Você pagará 15% de taxa");
            incomeTaxAmount = salary * 0.15;
            System.out.println("Total do imposto: " + incomeTaxAmount);
        } else if (salary > 3751.05 && salary <= 4664.68) {
            System.out.println("Você pagará 22.5% de taxa");
            incomeTaxAmount = salary * 0.225;
            System.out.println("Total do imposto: " + incomeTaxAmount);
        } else {
            System.out.println("Você pagará 27.5% de taxa");
            incomeTaxAmount = salary * 0.275;
            System.out.println("Total do imposto: " + incomeTaxAmount);
        }
    }
}
