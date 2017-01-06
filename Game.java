import java.util.Scanner;

/**
 * Created by tomas on 2017-01-06.
 */
public class Game {
    Scanner sc = new Scanner(System.in);
    Adventure adv = new Adventure();
    String action;

    public void run() {
        System.out.println("Select a name for your hero.");
        String pname = sc.nextLine();
        Player player = new Player(pname);

        while (true) {
            System.out.println("\nWhat would you lke to do? Hero info (i), adventure (a), rest (r) or shop (s).");
            action = sc.nextLine();

            switch (action.toUpperCase()) {
                case "I":
                    player.information();
                    break;
                case "A":
                    adv.go(player);
                    break;
                case "S":
                    System.out.println("Not yet implemented!\n");
                    break;
                case "R":
                    player.rest();
                    break;
            }
        }
    }
}
