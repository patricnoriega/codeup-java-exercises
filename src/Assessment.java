import java.util.Locale;

public class Assessment {
// Create an Assessment class with a public static method named half. It should accept a number and return the number divided by two.
    public static int half(int x){
    return x / 2;
    }
// Within your Assessment class create a public static method named shout. It should accept a string and return the same string in all upper case with 3 exclamation marks added to the end of it.
    public static String shout(String input){
        return input.toUpperCase() + "!!!";
    }


    public static void main(String[] args) {
        System.out.println(half(10));
        System.out.println(shout("hey"));
    }
}
