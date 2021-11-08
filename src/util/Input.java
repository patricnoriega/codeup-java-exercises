package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    public Input() {
       this.scanner = new Scanner(System.in);
    }


    public String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
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

    public int getInt() throws NumberFormatException {
        try {
            return Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: User did not enter an integer.");
            return getInt("Solve by: entering a WHOLE NUMBER.");
        }
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
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

    public double getDouble() throws NumberFormatException {
        try {
            return Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: User did not enter a required decimal number.");
            e.printStackTrace();
            return getDouble();
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }
}
