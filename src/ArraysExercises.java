//Array Basics
// Create a class inside of src named ArraysExercises. Create a main method for this class to do your work.
// What happens when you run the following code? Why is Arrays.toString necessary?
// int[] numbers = {1, 2, 3, 4, 5};
// System.out.println(numbers);
// Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
// Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.


import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] people = {"Kurt.C", "Billy.C", "Peep"};
        for (String person : people) {
            System.out.println(person);

            String[] addPerson = Arrays.copyOf(people, people.length + 1);
            System.out.println("people.length = " + people.length);
            System.out.println("addPerson.length = " + addPerson.length);

            addPerson[addPerson.length-1] = "Layne.S";
            for (String newPerson: addPerson){
                System.out.println(newPerson);
            }


        }
    }
}
