import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int exitCondition = 1;

        while (exitCondition != 0){

            int menuSelection = 4;

            System.out.print("1. Display Weapons\n2. Display Weapon Stats\n0. Exit\nSelect an Option: ");

            Scanner selectionInput = new Scanner(System.in);
            menuSelection = selectionInput.nextInt();


            switch (menuSelection){
                case 1 -> Weapons.DisplayWeapons();


                case 2 -> {
                    System.out.print("Which weapon do you want stats for: ");
                    Scanner weaponInput = new Scanner(System.in);
                    String weapon = weaponInput.nextLine();
                    System.out.println("You selected the weapon: " + weapon);
                    Weapons.PrintDetailsSelection(weapon);

                }
                case 0 -> {
                    System.out.println("Exiting program...");
                    exitCondition = 0;
                }
                default -> {
                    System.out.println("Command not recognized");

                }


            }







        }


    }
}