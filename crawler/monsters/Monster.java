package crawler.monsters;

public abstract class Monster {
    // encasulated variables
    private int health;
    private int levelModifier;
    private int minDamage;
    private int maxDamage;
    private String name;
    private boolean fastAttack;



    // blank constructor
    public Monster() {
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

    // ----------------------
    // MUTATORS
    // ----------------------

    public void setHealth(int health){
        this.health = health;
    }

    // ----------------------
    // ACCESSORS
    // ----------------------
    public String status() {
        // Zombie (lvl 1) - 100 hp
        return name + " (lvl " + levelModifier + ") - " + health + " hp";
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    // boolean accessors should be named with "is" instead of "get"
    public boolean isFastAttack() {
        return fastAttack;
    }

    public int getLevelModifier() {
        return levelModifier;
    }

    public int getDamage() {
        int x = (int) (Math.random() * (maxDamage - minDamage) + minDamage);
        return x;
    }

    public boolean isDead() {
        return health <= 0;
    }
    

    // ----------------------
    // ABSTRACT METHODS
    // ----------------------
    // if you're going to be a Monster, you must have these methods
    public abstract void attack();
    public abstract void taunt();
}