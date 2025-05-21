package game.enemies;

import game.weapons.Weapon;
import game.Player.Player;
import java.util.List;
import java.util.Random;

public class EnemyRoom {

    //field
    private final List<Enemy> enemyPool;
    private final Random random = new Random();

    //constructor
    public EnemyRoom() {
        this.enemyPool = List.of(EnemyLibrary.Goblin,
                EnemyLibrary.Skeleton,
                EnemyLibrary.GoblinKing,
                EnemyLibrary.Skeletor);
    }

    //getter
    public List<Enemy> getEnemyPool() {
        return enemyPool;
    }

    //New room method - Tristan's finest
    public Enemy newRoom() {
        int totalBulk = 0;
        for (Enemy enemy : enemyPool) {
            totalBulk += enemy.getEnemyLevel().getSpawnRate();
        }
        int roll = random.nextInt(totalBulk);
        int current = 0;

        for (Enemy enemy : enemyPool) {
            current += enemy.getEnemyLevel().getSpawnRate();
            if (roll < current) {
                return enemy;
            }
        }
        return null;
    }
    int killCount = 0;

    //Choose enemy method
    public Enemy enemyChooser() {
        if (killCount == 0) {
            System.out.println("You begin your journey into the cave. What might we encounter?");
        } else {
            System.out.println("You continue on through the cave...");
        }

        EnemyRoom enemyRoom = new EnemyRoom();
        Enemy foundEnemy = newRoom();
        return foundEnemy;
    }
}
