package game.enemies;

public enum EnemyLevel {
    ONE(15),
    TWO(5),
    THREE(1);

    //field
    private final int spawnRate;

    //constructor
    EnemyLevel(int spawnRate) {
        this.spawnRate = spawnRate;
    }

    //getter
    public int getSpawnRate() {
        return spawnRate;
    }
}
