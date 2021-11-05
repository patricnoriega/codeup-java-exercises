package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();


        System.out.println(students);
        Student brandon = new Student("Brandon");
        brandon.addGrade(88);
        brandon.addGrade(89);
        brandon.addGrade(92);
        System.out.println(brandon.getGradeAverage());

        Student jesse = new Student("Jesse");
        jesse.addGrade(50);
        jesse.addGrade(54);
        jesse.addGrade(85);
        System.out.println(jesse.getGradeAverage());

        Student shawn = new Student("Shawn");
        shawn.addGrade(78);
        shawn.addGrade(74);
        shawn.addGrade(70);
        System.out.println(shawn.getGradeAverage());

        Student pat = new Student("Patric");
        pat.addGrade(85);
        pat.addGrade(80);
        pat.addGrade(92);
        System.out.println(pat.getGradeAverage());

        students.put("pinheadlarry", brandon);
        students.put("jessejames710", jesse);
        students.put("daGoat", shawn);
        students.put("theRealNoriega", pat);

        System.out.println(students);


    }
}
