public class Weapons {

    public static void PrintDetailsSelection(String weapon){
        switch (weapon){
            case "Soda" -> System.out.println("Bad!");
            default -> System.out.println("Weapon not recognized");
        }
    }

}
