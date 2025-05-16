package game.chests;

import game.weapons.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChestRoom {

    private final List<Weapon> swordLoot;
    private final List<Weapon> hammerLoot;
    private final Random random;

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
}
