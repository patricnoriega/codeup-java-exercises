public class Person {
    //instance variables------LECTURE-------
//    public String firstName;
//    public String lastname;
//    public int age;
      private String name;

      //instance method -----LECTURE-------
//    public String joinChat(){
//        return lastname + ", " + firstName + " has joined the chat";
//    }
//    //static property representing world population
//    public static long worldPop = 7_900_000_000L;

      public String getName(String name){
//TODO: return the person's name
          return name;
      }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;

      }

    public void sayHello(String name){
//TODO: print a message to the console using the person's name
        System.out.println("Hey what's up" + name);
      }

    public static void main (String[] args){
//        Person person = new Person();
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

//        ------------LECTURE-------------
//        Person pat = new Person();
//        pat.firstName = "Patric";
//        pat.lastname = "Noriega";
//
//        System.out.println("Pat = " + pat);
//        System.out.printf("%s %s is my name! \n", pat.firstName , pat.lastname);
//
//        System.out.println(pat.joinChat());
//
//        System.out.println("worldPop = " + worldPop);
//
//        Person douglas = new Person();
//        douglas.firstName = "Douglas";
//        douglas.lastname = "Hirsch";
//
//        Person.worldPop += 1;
//
//        System.out.println("worldPop with douglas " + worldPop);

        // can we talk to person.firstName??
//        System.out.println(Person.firstName); //NOTE: no going forward till we fix this
    }
}
