package monsters;

public abstract class Monster {
    // encapsulated variables
    private int health;
    private int levelModifier;
    private int minDamage;
    private int maxDamage;
    private String name;

    // blank constructor
    public Monster() {
        this.health = 100;
        levelModifier = 1;
        minDamage = 1;
        maxDamage = 10;
        name = "Monster";
    }

    // constructor with params
    public Monster(int h, int l, int min, int max, String n) {
        health = h;
        this.levelModifier = l;
        this.minDamage = 1;
        this.maxDamage = 10;
        this.name = n;
    }

    // health modifier
    public void setHealth(int health){
        this.health = health;
    }

    // accessors
    public int getHealth() {
        return health;
    }

    public int getLevelModifier() {
        return levelModifier;
    }

    public int getDamage() {
        return (int) (Math.random() * (maxDamage - minDamage) + minDamage);
    }

    public boolean isDead() {
        return health <= 0;
    }

    // abstract promises
    // if you're going to be a Monster, you must have these methods
    public abstract void attack();
    public abstract void taunt();
}