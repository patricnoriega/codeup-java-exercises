
//    Game Development 101:

//    Welcome to the world of game development!
//    You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//    The specs for the game are:
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number.
//    All user inputs are validated.
//    If user's guess is less than the number, it outputs "HIGHER".
//    If user's guess is more than the number, it outputs "LOWER".
//    If a user guesses the number, the game should declare "GOOD GUESS!"



import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play High or low ");
        int number = (int) Math.floor(Math.random() * 100);
        int userInput;

        System.out.println("Ready to guess the number?");

        do {
            System.out.println("Guess a number between 1 - 100");
            userInput = scanner.nextInt();

            if (userInput < number){
                System.out.println("HIGHER!");
            } else if (userInput > number){
                System.out.println("LOWER");
            } else{
                System.out.println("Good guess :/");
            }

        }while (userInput != number);

    }
}
