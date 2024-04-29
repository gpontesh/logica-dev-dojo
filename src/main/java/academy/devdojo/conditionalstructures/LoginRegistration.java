package academy.devdojo.conditionalstructures;

import java.util.Scanner;

public class LoginRegistration {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String nameUser = input.next();

        if (nameUser.equals("") || nameUser.equalsIgnoreCase("admin") || nameUser.equalsIgnoreCase("administrador")){
            System.out.println("Usuário inválido");
        } else {
            System.out.println(nameUser + " cadastrado com sucesso");
        }
    }
}
