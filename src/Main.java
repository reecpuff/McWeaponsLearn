
import game.Player.Player;
import game.weapons.Weapon;
import game.chests.ChestRoom;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //constructor
        ChestRoom chestRoom = new ChestRoom();
        Player player = new Player();

        //Welcome Text
        System.out.println("\nYou find yourself in a dark room with 2 chests. \n");

        //Sword chest pop-up method
        int swordChoice = JOptionPane.showConfirmDialog(
                null,
                "Open the Sword Chest?",
                "Open Chest",
                JOptionPane.YES_NO_OPTION
        );

        if (swordChoice == JOptionPane.YES_OPTION) {
            Weapon swordReward = chestRoom.openSwordChest();
            player.addToInventory(swordReward);
            JOptionPane.showMessageDialog(null,
                    "You obtained: " + swordReward.getName());
        }

        //Hammer chest pop-up
        int hammerChoice = JOptionPane.showConfirmDialog(
                null,
                "Open the Hammer Chest?",
                "Open Chest",
                JOptionPane.YES_NO_OPTION
        );

        if (hammerChoice == JOptionPane.YES_OPTION) {
            Weapon hammerReward = chestRoom.openHammerChest();
            player.addToInventory(hammerReward);
            JOptionPane.showMessageDialog(null,
                    "You obtained: " + hammerReward.getName());
        }

        //Show contents of inventory
        player.showInventoryGUI();

        //Text for inventory
        player.showInventory();
    }
}