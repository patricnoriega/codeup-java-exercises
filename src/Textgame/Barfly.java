package Textgame;

import java.util.Random;
import java.util.Scanner;

public class Barfly {
    public static void main(String[] args) {
//        System objects
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//        Game Variables
        String[] badGuys = {"Old man Joe", "Bartender Eddie", "Crazy-Kaye", "Jack The Window Washer"};
        int maxBadGuyHealth = 75;
        int badGuyAttackDamage = 25;

//        Player Variables
        int health = 100;
        int attackDamage = 25;
        int healthPotion = 2;
        int healthPotionHealAmt = 30;
        int healthPotionDropChance = 50; //percentage

        boolean gameRunning = true;

        System.out.println("Welcome to Barfly");

        Game:
        while (gameRunning) {
            System.out.println("-------------------------------------------------------------------------------------------------");

            int badGuyHealth = random.nextInt(maxBadGuyHealth);
            String badGuy = badGuys[random.nextInt(badGuys.length)];
            System.out.println("\t " + badGuy + " is starting to post up! \n");

            while (badGuyHealth > 0) {
                System.out.println("\t Your HP: " + health);
                System.out.println("\t" + badGuy + "'s HP: " + badGuyHealth);
                System.out.println("\n\tWhat will you do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink potion");
                System.out.println("\t3. RUN!");

                String input = scanner.nextLine();
                if (input.equals("1")) {
                    int damageDealt = random.nextInt(attackDamage);
                    int damageTaken = random.nextInt(badGuyAttackDamage);

                    badGuyHealth -= damageDealt;
                    health -= damageTaken;

                    System.out.println("\t> Good strike! " + badGuy + " took " + damageDealt + " damage.");
                    System.out.println("\t> ah man look at that eye- you received " + damageTaken + " damage for wanting to fight Chinaski!");

                    if (health <= 0) {
                        System.out.println("\t You got beat up tonight, go sleep it off pal...");
                        break;
                    }

                } else if (input.equals("2")) {
                    if (healthPotion > 0) {
                        health += healthPotionHealAmt;
                        healthPotion--;
                        System.out.println("\t> Slide me my drink... " + healthPotionHealAmt
                                + "\n\t> You now have " + health + " HP:"
                                + "\n\t> You have " + healthPotion + " drinks left.\n");
                    } else {
                        System.out.println("\t> uh oh you have no more drinks left! Defeat a bad guy for a chance to steal his drink!");
                    }

                } else if (input.equals("3")) {
                    System.out.println("\tYou ran away from " + badGuy + "!");
                    continue Game;
                } else {
                    System.out.println("\tInvalid Command");
                }
            }


            if (health < 1) {
                System.out.println("You stay lying on asphalt of covered in blood while everyone is hollering as they walk back inside, you slowly start to get up to walk home for the night...");
            }
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("Good fighting Chinaski " + badGuy + " is not getting up after that one");
            System.out.println("You have " + health + " HP left.");
            if (random.nextInt(100) < healthPotionDropChance) {
                healthPotion++;
                System.out.println("The " + badGuy + " dropped a drink. ");
                System.out.println("You now have " + healthPotion + " drink(s) ready for you");
            }
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("What would you like to do now?");
            System.out.println("1. Continue to try and enjoy the night");
            System.out.println("2. Leave Barfly");

            String input = scanner.nextLine();

            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("Invalid command");
                input = scanner.nextLine();
            }

            if (input.equals("1")) {
                System.out.println("You continue to sit, enjoying your night");
            }
            else if (input.equals("2")) {
                System.out.println("You stand up and walk out without paying your tab and walk into the night");
                break;
            }

        }

        System.out.println("##############################################################################################");
        System.out.println("Credits Roll.");
        System.out.println("Thanks For Playing");
        System.out.println("##############################################################################################");

    }

}
