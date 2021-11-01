import java.util.Scanner;

public class MethodsExercises {


    public static void main(String[] args) {

        System.out.println(addition(5, 10));
        System.out.println(subtraction(999, 1));
        System.out.println(multiplication(10, 10));
        System.out.println(division(80, 4));
        getInteger(1, 10);
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

    public static void getInteger(int min, int max) {
        validate(min, max);

    }


//    Create a method that validates that user input is in a certain range
//    The method signature should look like this:
//    public static int getInteger(int min, int max);
//    and is used like this:
//            System.out.print("Enter a number between 1 and 10: ");
//    int userInput = getInteger(1, 10);
//    If the input is invalid, prompt the user again.

    //    String prompt = "Enter a number between 1 amd 10:\t";
    Scanner scanner = new Scanner(System.in);

//    System.out.println("Enter a min:\t");
//    int min = scanner.nextInt();
//    System.out.println("Enter a max \t")
    int max = scanner.nextInt();
    public static void validate(int num1, int num2) {
//        int value = Integer.parseInt(userInput);
        if (num1 > num2 || num2 < num1) {
            System.out.println("ERROR: Expected a number between " + num1 + " and " + num2);
        }
    }
}

