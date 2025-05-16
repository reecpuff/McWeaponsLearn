package game.weapons;

//game.weapons.Sword 'subclass'
public class Sword extends Weapon {
    public Sword(String name, int dmg, WeaponRarity rarity, String tag) {
        super(name, dmg, rarity, tag);
    }
    public Sword(String name, int dmg, WeaponRarity rarity) {
        super(name, dmg, rarity);
    }

    @Override
    public WeaponType getWeaponType() {
        return WeaponType.SWORD;
    }
    @Override
    public DamageType getDamageType() {
        return DamageType.SHARP;
    }
}