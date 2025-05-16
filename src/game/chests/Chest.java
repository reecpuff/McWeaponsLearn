package game.chests;
//imports for utilities like arraylists
import game.weapons.*;
import java.util.List;
import java.util.Random;

public class Chest {

    //fields
    private final List<Weapon> lootPool;//
    private final Random random = new Random();

    //constructor
    public Chest(List<Weapon> lootPool) {
        this.lootPool = lootPool;
    }

    //Chest opening method
    public Weapon openChest(List<Weapon> lootPool) {
        //this section basically just finds out how many weapons there are
        int totalWeight = 0; //we are creating a variable "total weight"
        for (Weapon weapon : lootPool) { //goes through every weapon...
            totalWeight += weapon.getRarity().getDropRate(); //...adds drop rate of each weapon to the total weight variable
        }

        //this section creates the roll and current variables for the next loop
        int roll = random.nextInt(totalWeight); //generates number between 0 and total weight -1(roll is a variable)
        int current = 0; //creates new variable "current" for use when spinning multiple times through pool

        //
        for (Weapon weapon : lootPool) { //loops through the loot pool(same as second line)
            current += weapon.getRarity().getDropRate(); //adds drop rate value of first weapon(second on second loop, etc.) to current
            if (roll < current) { //
                return weapon;
            }
        }

        return null; // Should never hit this if weights are set properly
    }
}