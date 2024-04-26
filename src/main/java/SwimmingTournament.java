public class SwimmingTournament {
    public static void main(String[] args) {
        String name = "Gustavo";
        int age = 25;

        if (age < 0){
            System.out.println("Idade incorreta");
        } else if (age > 0 && age <= 10){
            System.out.println(name + " participará da categoria Infantil");
        } else if (age > 10 && age <= 15){
            System.out.println(name + " participará da categoria Juvenil");
        } else if (age > 15 && age <= 19) {
            System.out.println(name + " participará da categoria Pré Adulto");
        } else {
            System.out.println(name + " participará da categoria Adulto");
        }
    }
}
