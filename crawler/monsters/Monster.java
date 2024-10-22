package crawler.monsters;

public abstract class Monster {
    // encapsulated variables
    private int health;
    private int levelModifier;
    private int minDamage;
    private int maxDamage;
    private String name;
    private boolean fastAttack;

    // blank constructor
    public Monster() {
        // encapsulated variables
        this.health = 100;
        levelModifier = 1;
        minDamage = 1;
        maxDamage = 10;
        name = "Monster";
        fastAttack = false;
    }

    // constructor with params
    public Monster(int health, int levelModifier, int minDamage, int maxDamage, String n, boolean fastAttack) {
        this.health = health;
        this.levelModifier = levelModifier;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.name = n;
        this.fastAttack = fastAttack;
    }

    // health modifier
    public void setHealth(int health){
        this.health = health;
    }

    // accessors
    public int getHealth() {
        return health;
    }

    public boolean isFastAttack() {
        return fastAttack;
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