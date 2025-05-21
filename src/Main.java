
import game.Player.Player;
import game.enemies.Enemy;
import game.enemies.EnemyLevel;
import game.enemies.EnemyLibrary;
import game.enemies.EnemyRoom;
import game.weapons.Weapon;
import game.chests.ChestRoom;
import javax.swing.*;
import java.util.List;

public class Main {

    public static void gameOver(String message) {
        JOptionPane.showMessageDialog(null, message);
        System.out.println(message);
        System.exit(0);
    }

    public static boolean fight(Player player, Enemy enemy) {

        //field
        Weapon weapon1 = player.getInventory().get(0);
        Weapon weapon2 = player.getInventory().get(1);

        String[] options = {weapon1.getName(), weapon2.getName()};

        int choice = JOptionPane.showOptionDialog(null,
                "You encounter " + (enemy.getEnemyLevel().equals(EnemyLevel.THREE) ? "The " : "a ") +
                        enemy.getName() + "!\nWhich weapon will you use?", "Choose your weapon",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        Weapon chosenWeapon = (choice == 0) ? weapon1 : weapon2;

        if (chosenWeapon.getDamageType() == enemy.getWeakness()) {
            enemy.takeDamage(chosenWeapon.getDmg());
            if (chosenWeapon.getDmg() >= enemy.getHp()) {
                JOptionPane.showMessageDialog(null,
                        "You successfully strike down " +
                                (enemy.getEnemyLevel().equals(EnemyLevel.THREE) ? "The " : "a ") +
                        enemy.getName() + " with your " + chosenWeapon.getName() + "!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Your attack was not strong enough to defeat the" + enemy.getName() + "...");
                gameOver("");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Your weapon was ineffective against the " + enemy.getName() + "...");
            gameOver("");
            return false;
        }
    }

    public static void main(String[] args) {

        //constructor
        ChestRoom chestRoom = new ChestRoom();
        Player player = new Player();
        EnemyRoom enemyRoom = new EnemyRoom();

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

        //Battle Loop begins
        while (true) {
            Enemy enemy = enemyRoom.newRoom();

            int choice = JOptionPane.showConfirmDialog(null,
                    "You encounter " + (enemy.getEnemyLevel().equals(EnemyLevel.THREE) ? "The " : "a ") +
                            enemy.getName() + "! Will you fight?",
                    "Enemy Encounter",
                    JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.NO_OPTION) {
                gameOver("You fled the cave - Game Over");
            }
            boolean survived = fight(player, enemy);

            if (!survived) {
                gameOver("You were defeated by the " + enemy.getName() + ". Game over...");
            }
            if (enemy.getEnemyLevel() == EnemyLevel.THREE) {
                gameOver("You defeated The " + enemy.getName() + " and found his secret rune! Victory!");
            }
            JOptionPane.showMessageDialog(null,
                    "You move deeper into the cave...");
        }
    }
}