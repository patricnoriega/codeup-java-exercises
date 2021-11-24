package Textgame;
import java.util.Random;
import java.util.Scanner;

public class Barfly {
    public static void main(String[] args) {
//        System objects
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//        Game Variables
        String[] badGuys = {"Old man Joe", "Bartender Eddie", "Crazy-Kaye","Jack The Window Washer"};
        int maxBadGuyHealth = 75;
        int badGuyAttackDamage = 25;

//        Player Variables
        int health = 100;
        int attackDamage = 25;
        int healthPotion = 2;
        int healthPotionHealAmt = 30;
        int healthPotionDropChance = 25; //percentage

        boolean gameRunning = true;

        System.out.println("Welcome to Barfly");

        //Game:
        while (gameRunning){
            System.out.println("---------------------------------");

            int badGuyHealth = random.nextInt(maxBadGuyHealth);
            String badGuy = badGuys[random.nextInt(badGuys.length)];
            System.out.println("\t " + badGuy + "is starting to post up! \n");

            while (badGuyHealth > 0){
                System.out.println("\t Your HP: " + health);
                System.out.println("\t" + badGuy +"'s HP: " + badGuyHealth);
                System.out.println("\n\tWhat will you do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink potion");
                System.out.println("\t3. RUN!");

                String input = scanner.nextLine();
                if (input.equals("1")){

                }
                else if (input.equals("2")){

                }
                else if (input.equals("3")){

                }
                else {

                }
            }

        }




    }

}
