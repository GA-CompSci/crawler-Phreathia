package monsters;

import main.Player;

public class Zombie extends Monster{
        // constructor with params
    public Zombie(int h, int l, int min, int max, String n) {
        // call the parent's constructor (aka super class)
        super(h, l, min, max, n);
    }

    // ATTACK
    public void attack() {
        System.out.println("Zombie attacks you with a bite!");
        // call the getDamage method from the parent class
        Player.takeDamage(getDamage());

    }

    // TAUNT

}
