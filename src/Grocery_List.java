import util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class Grocery_List {
    public static void main(String[] args) {
        ArrayList<String> grocery = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        String userInput = scanner.next();

        System.out.println("Welcome!");
        System.out.println("Would you like to create a new Grocery list?  ");

        System.out.println("add a new list item: \t" + grocery.add(userInput));
    }
}
