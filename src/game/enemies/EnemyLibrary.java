package game.enemies;

import game.weapons.DamageType;

public class EnemyLibrary {

    public static final Enemy Goblin = new Enemy("Goblin", DamageType.SHARP, 10, EnemyLevel.ONE);
    public static final Enemy Skeleton = new Enemy("Skeleton", DamageType.BLUNT, 10, EnemyLevel.ONE);
    public static final Enemy Skeletor = new Enemy("Skeletor", DamageType.BLUNT, 50, EnemyLevel.THREE);
    public static final Enemy GoblinKing = new Enemy("Goblin King", DamageType.SHARP, 50, EnemyLevel.THREE);
}
