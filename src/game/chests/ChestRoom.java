package game.chests;

import game.weapons.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChestRoom {

    //fields - we need a field for the random function, and for each chest
    private final Random random;
    private final List<Weapon> swordLoot;
    private final List<Weapon> hammerLoot;


    //constructors
    public ChestRoom() {
        this.random = new Random();

        this.swordLoot = List.of(WeaponLibrary.STRAIGHT_SWORD,
                WeaponLibrary.CURVED_SWORD,
                WeaponLibrary.CLAYMORE,
                WeaponLibrary.MAGIC_SWORD,
                WeaponLibrary.SWORD_OF_LIGHT,
                WeaponLibrary.SWORD_OF_DARKNESS
        );
        this.hammerLoot = List.of(WeaponLibrary.WOODEN_CLUB);
    }

    //Sword chest method
    public Weapon openSwordChest() {
        Chest swordChest = new Chest(swordLoot);
        Weapon foundWeapon = swordChest.openChest(swordLoot);
        System.out.println("Upon opening the sword chest, you find " +
                (foundWeapon.getRarity().equals(WeaponRarity.EPIC) ? "The " : "a ") + foundWeapon.getName() +
                "! \n");
        return foundWeapon;
    }
    //Hammer chest method
    public Weapon openHammerChest() {
        Chest hammerChest = new Chest(hammerLoot);
        Weapon foundWeaponH = hammerChest.openChest(hammerLoot);
        System.out.println("Upon opening the hammer chest, you find " +
                (foundWeaponH.getRarity().equals(WeaponRarity.EPIC) ? "The " : "a ") + foundWeaponH.getName() +
                "! \n");
        return foundWeaponH;
    }
}