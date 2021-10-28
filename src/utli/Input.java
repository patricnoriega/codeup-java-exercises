package utli;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }


    String getString() {
        return scanner.next();
    }

    boolean yesNo() {
        return scanner.nextBoolean() ;
    }

    int getInt(int min, int max) {
        return scanner.nextInt();
    }

    int getInt() {
        return scanner.nextInt();
    }

    double getDouble(double min, double max) {
        return scanner.nextDouble() ;
    }

    double getDouble() {
        return scanner.nextDouble() ;
    }

    public static void main(String[] args) {
        System.out.print("Enter some characters\t ");
        Input input = new Input();
        String something = input.getString();
        System.out.printf("You typed in %s", something );

        System.out.print("Do you wish to continue? \t");
        Input input1 = new Input();
        boolean yesNoAnswer = Scanner.nextLine().toLowerCase().startsWith("y");
        Boolean continuing = input1.yesNo();
        System.out.printf("%s You typed in %s", continuing , yesNoAnswer );






    }
}
