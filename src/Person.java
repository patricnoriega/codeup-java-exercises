public class Person {
    //instance variables
    public String firstName;
    public String lastname;
    public int age;

    //instance method
    public String joinChat(){
        return lastname + ", " + firstName + " has joined the chat";
    }
    //static property representing world population
    public static long worldPop = 7_900_000_000L;

    public static void main (String[]args){
        Person pat = new Person();
        pat.firstName = "Patric";
        pat.lastname = "Noriega";

        System.out.println("Pat = " + pat);
        System.out.printf("%s %s is my name! \n", pat.firstName , pat.lastname);

        System.out.println(pat.joinChat());

        System.out.println("worldPop = " + worldPop);

        Person douglas = new Person();
        douglas.firstName = "Douglas";
        douglas.lastname = "Hirsch";

        Person.worldPop += 1;

        System.out.println("worldPop with douglas " + worldPop);

        // can we talk to person.firstName??
//        System.out.println(Person.firstName); //NOTE: no going forward till we fix this
    }
}
