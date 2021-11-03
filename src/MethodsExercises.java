import java.util.Scanner;

public class MethodsExercises {


    public static void main(String[] args) {

//        System.out.println(addition(5, 10));
//        System.out.println(subtraction(999, 1));
//        System.out.println(multiplication(10, 10));
//        System.out.println(division(80, 4));
//        getInteger(1, 10);
        factorial();
        dice();
    }


    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int getInteger(int min, int max) {
        validate(min, max);

        return min;
    }


//    Create a method that validates that user input is in a certain range
//    The method signature should look like this:
//    public static int getInteger(int min, int max);
//    and is used like this:
//            System.out.print("Enter a number between 1 and 10: ");
//    int userInput = getInteger(1, 10);
//    If the input is invalid, prompt the user again.

    public static int validate(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;

        }
        System.out.println("ERROR: Expected a number between " + min + " and " + max);
        return validate(min, max);
    }
//    Calculate the factorial of a number.

    //    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!). Ex:
//            1! = 1               = 1
//            2! = 1 x 2           = 2
//            3! = 1 x 2 x 3       = 6
//            4! = 1 x 2 x 3 x 4   = 24
//
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        String toContinue;
        long factorial = 1;
        String center = "1";

        do {
            userInput = validate(1, 10);
            for (int i = 1; i <= userInput; i++) {
                if (i > 1) {
                    center += "x" + i;
                }
                factorial *= i;
                System.out.printf("%2d! = %-45s = %d%n", i, center, factorial);
            }
            System.out.println("Do you want to continue? (y/n)");
            toContinue = scanner.nextLine();

        } while (toContinue.equalsIgnoreCase("y"));
    }
//    Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//    "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//    Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.

    public static void dice() {
        Scanner scanner = new Scanner(System.in);
        String answer;
        System.out.println("How many sides on the dice:");
        int sides = scanner.nextInt();
        System.out.println("Do you want to roll? (y/n)");
        String userChoice = scanner.next();
        if (userChoice.equalsIgnoreCase("y")) {

            do {

                int dice = (int) Math.floor(Math.random() * sides);
                int dice2 = (int) Math.floor(Math.random() * sides);
                System.out.println(dice);
                System.out.println(dice2);

                System.out.println("want to play again? (y/n)");
                answer = scanner.next();
            } while (answer.equalsIgnoreCase("y"));
        }
    }


}







