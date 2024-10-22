package crawler.monsters;

import crawler.Player;

public class Zombie extends Monster{
        // constructor with params
    public Zombie(int h, int l, int min, int max) {
        // call the parent's constructor (aka super class)
        super(h, l, min, max, "Zombie", false);
    }

    // ATTACK
    @Override // this is an annotation, it's not rquired but it's good practice
    public void attack() {
        System.out.println("Zombie attacks you with a bite!");
        // call the getDamage method from the parent class
        Player.takeDamage(getDamage());
    }

    // TAUNT
    @Override
    public void taunt() {
        System.out.println("👁️  The Zombie glares at you with hollow, decaying eyes...");
        System.out.println("     It opens its mouth slowly, and a chilling whisper escapes:\n");

        try {
            Thread.sleep(2000); // Adds a pause for effect
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("🕯️  \"I... can feel... your fear...\"\n");

        try {
            Thread.sleep(3000); // Another pause for suspense
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("👻  \"Soon... you... will... belong... to... usssss...\"\n");

        try {
            Thread.sleep(3500); // Long, drawn-out pause
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("💀  \"Your soul will fade... and you will never leave...\"\n");
        System.out.println("⚰️  ...\"the grave... awaits you...\" 💀💀💀\n");

        // Adding a creepy ASCII art to finish it off
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣤⡀⠀⠀⠀⣀⣀⣠⣤⣤⣀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⡿⠶⠶⢾⣿⡿⠿⠿⠿⢿⣿⣦⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡏⠀⣀⣤⣿⠉⠀⠀⠀⢠⣄⣀⠉⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⡿⠿⢿⣿⠀⠀⠀⣶⣶⠿⣿⡿⠃");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣄⠀⢸⣿⠀⠀⠀⠿⠿⠀⢠⣾⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⠿⠛⠉⠀⠀⠀⢀⣀⣶⠾⠃⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠿⠛⠁⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⠀⠀⠀⠀⠀⠀\n");

        System.out.println("⚰️  The ground beneath you feels colder... the grave is near...");
    }
}
