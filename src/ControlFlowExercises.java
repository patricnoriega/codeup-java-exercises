import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        While:
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//        5 6 7 8 9 10 11 12 13 14 15
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i);
//            i++;
//        }
//        System.out.println();
//        Do While
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int x = 0;
//        do {
//
//            System.out.println(x);
//            x+= 2;
//        } while (x <= 100);
//        Alter your loop to count backwards by 5's from 100 to -10.
//        int x = 100;
//        do {
//            System.out.println(x);
//            x-=5;
//        }while (x >= -10);

//        Refactor the previous two exercises to use a for loop instead.
//        for (int x = 100; x >= -10; x -= 5) {
//            System.out.println(x);
//        }
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        long x = 2;
//        do {
//            System.out.println(x);
//            x*=x;
//        }while (x < 1000000);

//        Refactor the previous two exercises to use a for loop instead.
//        for (long x = 2; x <= 1000000; x *= x) {
//            System.out.println(x);
//        }

//        Fizzbuzz:
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }



    }
}

