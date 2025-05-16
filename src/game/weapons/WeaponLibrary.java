package game.weapons;

public class WeaponLibrary {

    //Swords
    public static final Sword STRAIGHT_SWORD = new Sword("Straight Sword", 10, WeaponRarity.COMMON);
    public static final Sword CURVED_SWORD = new Sword("Curved Sword", 12, WeaponRarity.COMMON);
    public static final Sword CLAYMORE = new Sword("Claymore", 20, WeaponRarity.RARE);
    public static final Sword MAGIC_SWORD = new Sword("Magic Sword", 25, WeaponRarity.RARE);
    public static final Sword SWORD_OF_LIGHT = new Sword("Sword of Light", 50, WeaponRarity.EPIC);
    public static final Sword SWORD_OF_DARKNESS = new Sword("Sword of Darkness", 50, WeaponRarity.EPIC);

    //Hammers
    public static final Hammer WOODEN_CLUB = new Hammer("Wooden Club", 10, WeaponRarity.COMMON);

}
