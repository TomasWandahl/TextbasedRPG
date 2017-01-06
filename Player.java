/**
 * Created by tomas on 2017-01-06.
 */
public class Player extends Creature {
    Inventory inv = new Inventory(20);
    int experience;
    int level;
    int maxHealth;

    public Player(String name) {
        this.name = name;
        this.health = 10;
        this.attack = 10;
        this.luck = 10;
        this.speech = 10;
        this.speed = 10;
        experience = 0;
        level = 1;
        maxHealth = 10;
    }
    public void information(){
        System.out.println("\nHero name: " + this.name + "\nHero level: " + this.level + "\nHero health: " + this.health);
        System.out.print(this.experience + "/" + (this.level*10) + " experience");
        showInventory();
    }

    public void addToInventory(String item) {
        inv.addToInventory(item);
    }

    public void showInventory() {
        inv.showInventory();
    }

    public void fight() {
        this.health -= 1;
        if (this.health == 0) {
            System.out.println(this.name + " has died.\n");
        }
    }

    public void rest() {
        System.out.println(this.name + " lies down in the sun and rests for a bit. He feels how his energy slowly regenerates.\n");
        this.health = maxHealth;
    }

    public void experience() {
        experience += 2;
        if (experience == (this.level * 10)) {
            System.out.println(this.name + " has leveled up!");
            level += 1;
            experience = 0;
            maxHealth += 5;
            this.health = maxHealth;
        }
    }
}
