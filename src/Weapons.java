import java.util.Scanner;

public class Weapons {

    public static void DisplayWeapons(){
        System.out.print("Type danger level of weapon: ");
        Scanner dangerLevel = new Scanner(System.in);
        String level = dangerLevel.nextLine();

        switch (level){
            case "Zayin", "zayin" -> System.out.println("Penitence, Soda, Wingbeat");

            case "Teth", "teth" -> System.out.println("In Development");

            case "He", "he" -> System.out.println("In Development");

            case "Waw", "waw" -> System.out.println("In Development");

            case "Aleph", "aleph" -> System.out.println("In Development");

            default -> {
                System.out.println("Input not recognized");
                DisplayWeapons();
            }
        }

    }

    public static void PrintDetailsSelection(String weapon){
        switch (weapon){

        }
    }

    public static void PrintDetails(String weapon) {

    }
}



