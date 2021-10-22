public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

// Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 8;
        System.out.println(myFavoriteNumber + " is my favorite number");

// Create a String variable named myString and assign a string value to it, then print the variable out to the console
        String myString = "This is mystring talking";
        System.out.println(myString);

// Change your code to assign a character value to myString. What do you notice?
//        myString = 'c';

// Change your code to assign the value 3.14159 to myString. What happens?
//      String myString = 3.14159;
//      System.out.println(myString);

// Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens
//      long myNumber = ;
//      System.out.print(myNumber);

// Change your code to assign the value 3.14 to myNumber. What do you notice?
//      long myNumber = 3.14;
//      System.out.print(myNumber);

// Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//      long myNumber = 123L;
//      System.out.print(myNumber);

// Change your code to assign the value 123 to myNumber.
        long myNumber = 123;
        System.out.println(myNumber);

// Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        float myNumber = 3.14F;
//        System.out.print(myNumber);

//        double myNumber = 3.14;
//        System.out.print(myNumber);

// Copy and paste the following code blocks one at a time and execute them
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

// Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//       String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

// Rewrite the following expressions using the relevant shorthand assignment operators:
//        ----long hand:----
//        1) int x = 4;
//           x = x + 5;

//       2) int x = 3;
//          int y = 4;
//          y = y * x;

//       3) int x = 10;
//          int y = 2;
//          x = x / y;
//          y = y - x;

//        ----vs. short hand:----
//        int x = 4;
//         x += 5;
//        System.out.print(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.print(y);

        int x = 10;
        int y = 2;
         x /= y;
         y -= x;
         System.out.println(x);
         System.out.println(y);

//What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
//      int number = 21474836470;
        int number = Integer.MAX_VALUE;
        System.out.print(number);


    }







}

