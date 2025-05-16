package game.weapons;
//game.weapons.

// Weapon Rarity Enum - decides drop-rate of an item from chests

public enum WeaponRarity {
    COMMON(15),
    RARE(5),
    EPIC(1);

    //field
    private final int dropRate;

    //constructor
    WeaponRarity(int dropRate) {
        this.dropRate = dropRate;
    }

    //getter
    public int getDropRate() {
        return  dropRate;
    }
}