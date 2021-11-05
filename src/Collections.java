import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {
//        Old way:
//        String[]nameOfVar = {"Thing1", "Thing2", "Thing3"};
//        System.out.println(nameOfVar[3]);

        ArrayList<String> students = new ArrayList<>();

        students.add("mcPatty");
        students.add("mcKenneth");

        System.out.println("students.size() = " + students.size());
        System.out.println(students);

        System.out.println();

        ArrayList<Integer>myFavoriteNums = new ArrayList<>();

        myFavoriteNums.add(8);
        myFavoriteNums.add(13);
        myFavoriteNums.add(0,7);
        myFavoriteNums.add(3,42);
        myFavoriteNums.add(myFavoriteNums.size(),24);
        myFavoriteNums.add(myFavoriteNums.size(),48);
        myFavoriteNums.add(2,24);

        System.out.println("myfavoriteNums = " + myFavoriteNums.size());
        System.out.println(myFavoriteNums);
        System.out.println("myFavoriteNums.indexOf(222) = " + myFavoriteNums.indexOf(222));
        System.out.println("myFavoriteNums.get(2) = " + myFavoriteNums.get(2));

        System.out.println();

        System.out.println("myFavoriteNums.contains(42) = " + myFavoriteNums.contains(42));
        System.out.println("myFavoriteNums.contains(421) = " + myFavoriteNums.contains(421));

        System.out.println();

        System.out.println(myFavoriteNums);
        System.out.println("myFavoriteNums.lastIndexOf() = " + myFavoriteNums.lastIndexOf(24));
        System.out.println("myFavoriteNums.isEmpty() = "+ myFavoriteNums.isEmpty());

        System.out.println();

        System.out.println("myFavoriteNum.remove(24) = ");
        myFavoriteNums.remove((Integer) 24);
        System.out.println(myFavoriteNums);

        System.out.println("----removing all 24's myFavoriteNums.remove(index 4)---- ");
        myFavoriteNums.remove(4);
        System.out.println(myFavoriteNums);

        System.out.println();

        System.out.println("-------Hash Maps-------\n");

        HashMap<String, String> usernames = new HashMap<>();
        usernames.put("Kenneth ", "ken2Cool");
        usernames.put("Shanshan ", "daGoat");
        usernames.put("Cody ", "codyDaDuck");

        System.out.println("usernames.get(Shanshan) = " + usernames.get("Shanshan "));
        System.out.println("usernames.get(Alex) = " + usernames.get("Alex"));
        System.out.println("usernames.getOrDefault(Alex) = "+ usernames.getOrDefault("Alex", "noUserFound"));

        System.out.println();

        System.out.println("usernames.containsKey(Shanshan) = " + usernames.containsKey("Shanshan"));
        System.out.println("usernames.containsValue(Shanshan) = " + usernames.containsValue("daGoat"));
        System.out.println("usernames.containsValue(Shanshan) = " + usernames.containsValue("aGoat"));

        System.out.println();
        System.out.println(usernames);

        usernames.putIfAbsent("Shanshan ", "Shanshan210");
        usernames.putIfAbsent("Alex ", "daManAlex");

        System.out.println(usernames);

        System.out.println();
        System.out.println(usernames);

        usernames.remove("Alex ");
        System.out.println(usernames);

        usernames.replace("Shanshan ", "Shanshan210");
        System.out.println(usernames);

        usernames.clear();
        System.out.println("usernames = " + usernames);
        System.out.println("usernames.isEmpty() = " + usernames.isEmpty());
    }
}
