import java.util.Scanner;

public class Weapons {

    public static void DisplayWeapons(){
        Scanner dangerLevel = new Scanner(System.in);
        String level = dangerLevel.nextLine();

        switch (level){
            case "Zayin", "zayin" -> System.out.println("Penitence\nSoda\nWingbeat");

            case "Teth", "teth" -> System.out.println("");

            case "He", "he" -> System.out.println("");

            case "Waw", "waw" -> System.out.println("");

            case "Aleph", "aleph" -> System.out.println("");
        }

    }

    public static void PrintDetailsSelection(String weapon){
        switch (weapon){

        }
    }

    public static void PrintDetails(String weapon) {

    }
}



