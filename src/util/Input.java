package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }


    public String getString() {
        return scanner.next();
    }

    public boolean yesNo() {
        String userInput = scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        System.out.printf("please enter a number between %n and %n", min, max);
        int userInput = scanner.nextInt();

        while (min > max || max < min){
            getInt();
        }

        return userInput;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    double getDouble(double min, double max) {
        return scanner.nextDouble() ;
    }

    public double getDouble() {
        return scanner.nextDouble() ;
    }

    public static void main(String[] args) {
        System.out.print("Enter some characters\t ");
        Input input = new Input();
        String someCharacters = input.getString();
        System.out.printf("You typed in %s", someCharacters);

        System.out.print(" Do you wish to continue? \t");
        Input input1 = new Input();
        Boolean continuing = input1.yesNo();
        System.out.printf("You typed in %s", continuing );

        System.out.print("Enter some number between 1-10 \t ");
        Input input2 = new Input();
        int someNum = input2.getInt(1,10);
        System.out.printf("User entered:/t %s",someNum);

        System.out.print("Enter some number between min-max \t ");
        Input input3 = new Input();
        Double anothaNum = input3.getDouble();
        System.out.printf("User entered:/t %s", anothaNum);








    }
}
