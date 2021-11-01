import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.

//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)

//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)

//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)

//        He answers 'Whatever.' to anything else.

        String sentence;
        System.out.print("Talk to Bob.");


        sentence = scanner.nextLine();
        if (sentence.equals("")) {
            System.out.println("Fine. Be that way!");
        }
        else if (sentence.endsWith("?")) {
            System.out.println("Sure.");
        }
        else if (sentence.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        }
        else {
            System.out.println("whatever.");
        }
        }
    }
