package academy.devdojo.exercises.repeatloops;

import java.util.Scanner;

public class LoginScreen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String loginName = "ADMINISTRADOR";
        String password = "adm123";
        String username = null;
        String userPassword = null;

        while (!loginName.equals(username.toUpperCase()) || !password.equals(userPassword)) {
            System.out.println("--------------------------");
            System.out.println("|        L O G I N       |");
            System.out.println("--------------------------");
            System.out.print("Username: ");
            username = input.nextLine();
            System.out.print("Password: ");
            userPassword = input.nextLine();

            if (username.toUpperCase().equals(loginName) && userPassword.equals(password)) {
                System.out.println("ACESSO CONCEDIDO");
            } else {
                System.out.println("ACESSO NEGADO");
            }
        }

       /* do {
            System.out.println("--------------------------");
            System.out.println("|        L O G I N       |");
            System.out.println("--------------------------");
            System.out.print("Username: ");
            username = input.nextLine();
            System.out.print("Password: ");
            userPassword = input.nextLine();

            if (username.toUpperCase().equals(loginName) && userPassword.equals(password)) {
                System.out.println("ACESSO CONCEDIDO");
            } else {
                System.out.println("ACESSO NEGADO");
            }
        } while (!loginName.equals(username.toUpperCase()) || !password.equals(userPassword)); */
    }
}
