import java.util.Scanner;

/**
 * Created by tomas on 2017-01-06.
 */
public class Adventure {
    public void go(Player p){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nYou find yourself in dark woods, surrounded by wolves. What do you do? Attack (a) or flee (f).");
        String action = sc.nextLine();

        switch(action.toUpperCase()){
            case "A":
                System.out.println("\nYou swing your bare hands against the wolves. Killing them, one by one. You walk away with blood on " +
                        "your hands, and a broad grim on your face.");
                System.out.println("\nOne wolf pelt added to your inventory. " + p.name + " has gained 2 experience.");
                p.fight();
                p.experience();
                p.addToInventory("Wolf pelt");
                break;
            case "F":
                System.out.println("You are pathetic...\n");
                break;
        }
    }
}
