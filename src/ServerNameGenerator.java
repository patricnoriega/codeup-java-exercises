//Server Name Generator
//        We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.
//        Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//        Create a method that will return a random element from an array of strings.
//        Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
//        Example Output:
//        Here is your server name:
//        dedicated-photon


import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
    public static String randomString(String[]arr){

        Random randomAdj = new Random();
        int index = randomAdj.nextInt(arr.length);
        return (arr[index]);

}
    public static void main(String[] args) {


        String[] adj = new String[]{"nervous", "disgusting", "fair", "ugliest", "impressive", "nutty", "roomy", "shrill", "elderly", "superb"};
        String[] nouns = new String[]{"awareness", "feedback", "flight", "unit", "wedding", "night", "wealth", "inspector", "analysis", "permission"};

        System.out.print("Here is your server name:\n  " + randomString(adj) + "-" + randomString(nouns));


    }
}