package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> studenGrades;

    public Student(String studentName) {
        this.name = studentName;
        this.studenGrades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.studenGrades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int sum = 0;
        for (int i = 0; i < studenGrades.size() - 1; i++){
            sum += studenGrades.get(i);
        }
            return sum / studenGrades.size();
    }


    public static void main(String[] args) {
//        Student brandon = new Student("Brandon");
//        brandon.addGrade(88);
//        brandon.addGrade(89);
//        brandon.addGrade(92);
//        System.out.println(brandon.getGradeAverage());
//
//        Student jesse = new Student("Jesse");
//        jesse.addGrade(50);
//        jesse.addGrade(54);
//        jesse.addGrade(85);
//        System.out.println(jesse.getGradeAverage());
//
//        Student shawn = new Student("Shawn");
//        shawn.addGrade(78);
//        shawn.addGrade(74);
//        shawn.addGrade(70);
//        System.out.println(shawn.getGradeAverage());
//
//        Student pat = new Student("Patric");
//        pat.addGrade(85);
//        pat.addGrade(80);
//        pat.addGrade(92);
//        System.out.println(pat.getGradeAverage());



    }
}
