package game.Player;

import java.util.ArrayList;
import java.util.List;
import game.weapons.Weapon;

import javax.swing.*;

public class Player {
    //field
    private final List<Weapon> inventory;

    //Player constructor
    public Player() {
        this.inventory = new ArrayList<>();
    }

    //Add to inventory method
    public void addToInventory(Weapon weapon) {
        inventory.add(weapon);
    }

    //inventory list getter
    public List<Weapon> getInventory() {
        return inventory;
    }

    //Show inventory GUI method
    public void showInventoryGUI() {
        if (inventory.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Your inventory is empty");
            return;
        }

        StringBuilder inventoryMessage = new StringBuilder("Your inventory contains: \n");
        for (Weapon weapon : inventory) {
            inventoryMessage.append("- ").append(weapon.getName()).append("\n");
        }

        JOptionPane.showMessageDialog(null, inventoryMessage.toString());
        }

    //Show inventory below
    public void showInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Your inventory is empty.");
            return;
        }
        StringBuilder inventoryMsg = new StringBuilder("Your inventory contains: \n");
        for (Weapon weapon : inventory) {
            inventoryMsg.append("- ").append(weapon.getName()).append("\n");
        }
        System.out.println(inventoryMsg.toString() + "\n");
    }
}