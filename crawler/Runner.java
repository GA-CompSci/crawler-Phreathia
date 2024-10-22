package crawler;
import java.util.Scanner;

import crawler.monsters.Monster;
import crawler.monsters.Zombie;

public class Runner {

    private static int level = 1;

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static void main(String[] args){
        // set up key variables
        boolean gameOver = false;
        Scanner input = new Scanner(System.in);

        // initial monster should be generated outside of the loop
        Monster m = generateMonster();
        
        // print a welcome message to the user
        System.out.println(RED + "**********************************************" + RESET);
        System.out.println(RED + "*                                            *" + RESET);
        System.out.println(RED + "*      " + YELLOW + "███╗   ███╗ ██████╗ ███╗   ██╗████████╗" + RESET + RED + "      *" + RESET);
        System.out.println(RED + "*      " + YELLOW + "████╗ ████║██╔═══██╗████╗  ██║╚══██╔══╝" + RESET + RED + "      *" + RESET);
        System.out.println(RED + "*      " + YELLOW + "██╔████╔██║██║   ██║██╔██╗ ██║   ██║   " + RESET + RED + "      *" + RESET);
        System.out.println(RED + "*      " + YELLOW + "██║╚██╔╝██║██║   ██║██║╚██╗██║   ██║   " + RESET + RED + "      *" + RESET);
        System.out.println(RED + "*      " + YELLOW + "██║ ╚═╝ ██║╚██████╔╝██║ ╚████║   ██║   " + RESET + RED + "      *" + RESET);
        System.out.println(RED + "*      " + YELLOW + "╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═══╝   ╚═╝   " + RESET + RED + "      *" + RESET);
        System.out.println(RED + "*                                            *" + RESET);
        System.out.println(RED + "**********************************************" + RESET);

        System.out.println(GREEN + "Welcome to MONT!" + RESET);
        System.out.println(CYAN + "Prepare to face the most terrifying creatures!" + RESET);
        System.out.println(PURPLE + "A" + RESET + WHITE + "r" + RESET + PURPLE + "e" + RESET + WHITE + " y" + RESET + PURPLE + "o" + RESET + WHITE + "u" + RESET + PURPLE + " r" + RESET + WHITE + "e" + RESET + PURPLE + "a" + RESET + WHITE + "d" + RESET + PURPLE + "y" + RESET + WHITE + "?" + RESET);

        // game loop
        while(!gameOver) {
            /** if (input.nextLine().equalsIgnoreCase("yes")) {
                printMenu(); // functional decomposition
            }
            if (input.nextLine().equalsIgnoreCase("no")) {
                System.out.println("Ok bye");
                gameOver = true;
            } */

            printMenu(); // functional decomposition
            String choice = input.nextLine();

            // if there isn't already a monster, generate one
            Monster m = generateMonster();

            // Does monster get an early attack?
            if(m.isFastAttack()) {
                m.attack();
                // did it already beat us?
                if(Player.health <= 0) {
                    m.taunt();
                    break;
                }
            }
            // QUIT
            if(choice.equalsIgnoreCase("q")) gameOver = true;
            
            // ATTACK
            else if(choice.equalsIgnoreCase("A")){
                // TODO: check if monster has been defeated
            }
            // HEAL
            else if(choice.equalsIgnoreCase("H")){
                // call the HEAL method from the player
                Player.heal(level);
                // TODO: monster throws us a taunt
            }
            // INVALID CHOICE
            else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        // goodbye message
        input.close(); // extra security thing

    }

    public static Monster generateMonster () {
        // types of monsters
        int minHit = level;
        int maxHit = 5 + level;
        int health = 10 + level;
        // list constructors of available monsters so we can randomly build just one
        Monster[] constructors = new Monster[] {
            new Zombie(health, level, minHit, maxHit);
        }
    }

    public static void printMenu() {
        // pause for 1 second
        pause(2000);
        try {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Error clearing console.");
        }
        // Dungeon-themed menu art
        System.out.println(PURPLE + "*************************************************" + RESET);
        System.out.println(RED + "*                LEVEL " + level + ":             *" + RESET);
        System.out.println(PURPLE + "*************************************************" + RESET);

        // Q is for quit
        System.out.println(RED + "   [Q] Quit the dungeon and flee like a coward!" + RESET);

        // A is for attack
        System.out.println(GREEN + "   [A] Attack! Charge at your enemies with fury!" + RESET);

        // H is for heal
        System.out.println(CYAN + "   [H] Heal. Restore your strength before battle!" + RESET);

        System.out.println(PURPLE + "*************************************************" + RESET);
    
        // Extra dungeon atmosphere
        System.out.println(YELLOW + "Your health is " + Player.health + ". You hear distant growls... Choose wisely\n" + RESET);
        System.out.print("\nSELECTION: ");
    }

    // Helper method to pause without forcing InterruptedException
    private static void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            // Handle the interruption silently
            Thread.currentThread().interrupt(); // Reset the interrupt flag in case it's needed elsewhere
        }
    }

}
