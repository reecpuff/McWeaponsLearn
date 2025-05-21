package game.enemies;

import game.weapons.DamageType;

public class Enemy {
    //field
    private final DamageType weakness;
    private final String name;
    private int hp;
    private final EnemyLevel enemyLevel;

    //Constructor
    public Enemy(String name, DamageType weakness, int hp, EnemyLevel enemyLevel) {
        this.name = name;
        this.weakness = weakness;
        this.hp = hp;
        this.enemyLevel = enemyLevel;
    }

    //Getters
    public String getName() {
        return name;
    }
    public DamageType getWeakness() {
        return weakness;
    }
    public int getHp() {
        return hp;
    }
    public EnemyLevel getEnemyLevel() {
        return enemyLevel;
    }

    //damage method
    public void takeDamage(int amount) {
        hp -= amount;
        if (hp < 0) hp = 0;

        System.out.print(name + " took " + amount + " damage!\n\n");
    }
}
