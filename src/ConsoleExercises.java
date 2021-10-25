import java.util.Scanner;

    public class ConsoleExercises {
        public static void main(String[] args){

//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f.", pi);

//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method
        Scanner scanner = new Scanner(System.in);
//
        System.out.print("Enter a Integer: ");
        int userInput = scanner.nextInt();

        System.out.println("You entered: \"" + userInput + "\" ");

//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline

        System.out.print("Enter three words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();

        System.out.println(firstWord + "\n" +  secondWord + "\n" + thirdWord);

//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//
        System.out.print("Enter a sentence: ");
        scanner.nextLine();
        String userSentence = scanner.nextLine();
        System.out.println(userSentence);

//        Prompt the user to enter values of length and width of a classroom at Codeup.
//        Use the nextLine method to get user input and parse the resulting string to a numeric type.
//        -Assume that the rooms are perfect rectangles.
//        -Assume that the user will enter valid numeric data for length and width.
            System.out.print("Enter length of your room to find the Perimeter: ");
            double perimeterLength = scanner.nextDouble();

            System.out.print("Enter width of your room to find the Perimeter: ");
            double perimeterWidth = scanner.nextDouble();

            double  perimeter = 2*(perimeterLength+perimeterWidth);

            System.out.println("perimeter of the room is: " + perimeter);


            System.out.print("Enter the length of the room to find the Area: ");
            double areaLength = scanner.nextDouble();

            System.out.print("Enter the width of the room to find the Area: ");
            double areaWidth = scanner.nextDouble();

            //Area = length*width;
            double area = areaLength*areaWidth;
            System.out.println("Area of the room is:" + area);















        }
}
