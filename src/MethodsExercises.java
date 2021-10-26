import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(addition(5,10));
        System.out.println(subtraction(999,1));
        System.out.println(multiplication(10,10));
        System.out.println(division(80,4));

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
}
