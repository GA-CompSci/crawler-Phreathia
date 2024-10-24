package crawler;

public class Player {
    // static variables
    public static int health = 100;

    public static void takeDamage(int damage) {
        // subtract the method from the player's health
        health -= damage;

        // print the damage and the player's new health
        System.out.println("You took " + damage + " points of damage.");
    }

    // heal method
    public static void heal(int currentLevel) {
        // calculate a random heal value 5 - 10
        int heal = (int)(Math.random() * 6) + 5;

        // subtract the currentLevel from heal calculation
        heal -= (int)(currentLevel * .5);

        // add the heal value to the player's health if the heal is positive
        if(heal > 0) health += heal;
        else heal = 0;

        // print the heal value and the player's new health
        System.out.println("You healed for " + heal + " points.");
    }
}