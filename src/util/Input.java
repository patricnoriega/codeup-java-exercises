package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }


    public static String getString() {
        return scanner.nextLine();
    }


    public boolean yesNo() {
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        System.out.printf("please enter a number between %n and %n", min, max);
        int userInput = scanner.nextInt();

        while (min > max || max < min) {
            getInt();
        }

        return userInput;
    }

    public int getInt() {
        try {
            String s = getString();
            return Integer.valueOf(s);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: Please enter a integer");
            return getInt();
        }

    }

    public double getDouble(double min, double max) {
        double decimal = getDouble();
        while (decimal < min || decimal > max) {
            System.out.printf("Please enter an decimal between %f and %f.\n", min, max);
            decimal = getDouble();
        }
        return decimal;
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        return getDouble(min, max);
    }

    public double getDouble() {
        try {
            String s = getString();
            return Double.valueOf(s);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: Please enter a decimal");
            return getDouble();
        }

        }
    }
