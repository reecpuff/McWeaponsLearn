package game.weapons;

//game.weapons.Hammer 'subclass'
public class Hammer extends Weapon {
    public Hammer(String name, int dmg, WeaponRarity rarity, String tag) {
        super(name, dmg, rarity, tag);
    }
    public Hammer(String name, int dmg, WeaponRarity rarity) {
        super(name, dmg, rarity);
    }

    @Override
    public WeaponType getWeaponType() {
        return WeaponType.HAMMER;
    }
    @Override
    public DamageType getDamageType() {
        return DamageType.BLUNT;
    }
}