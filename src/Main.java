import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String weapon;
        int exitCondition = 1;

        while (exitCondition != 0){
            System.out.print("Select a weapon, 0 to exit: ");
            Scanner weaponInput = new Scanner(System.in);
            weapon = weaponInput.nextLine();

            System.out.println(weapon);

            if (Objects.equals(weapon, "0")){
                exitCondition = 0;
            } else {
                //execute selection command
            }


        }


    }
}