package game.weapons;

//game.weapons.Weapon type enum
public enum WeaponType {

    SWORD(DamageType.SHARP),
    HAMMER(DamageType.BLUNT);

    //fields
    private final DamageType dmgType;

    //constructor
    WeaponType(DamageType dmgType) {
        this.dmgType = dmgType;
    }

    //getter
    public DamageType getDmgType() {
        return dmgType;
    }
}