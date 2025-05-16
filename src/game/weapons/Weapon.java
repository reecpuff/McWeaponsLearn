package game.weapons;

//Weapon Class!
public abstract class Weapon {

    //fields
    private final String name;
    private final int dmg;
    private final WeaponRarity rarity;
    private final String tag;

    //constructors
    public Weapon(String name, int dmg, WeaponRarity rarity, String tag) {
        this.name = name;
        this.dmg = dmg;
        this.rarity = rarity;
        this.tag = tag;
    }
    public Weapon(String name, int dmg, WeaponRarity rarity) {
        this.name = name;
        this.dmg = dmg;
        this.rarity = rarity;
        this.tag = name;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getDmg() {
        return dmg;
    }
    public WeaponRarity getRarity() {
        return rarity;
    }
    public String getTag() {
        return tag;
    }

    //abstract method
    public abstract WeaponType getWeaponType();

    public DamageType getDamageType() {
        return getWeaponType().getDmgType();
    }
}