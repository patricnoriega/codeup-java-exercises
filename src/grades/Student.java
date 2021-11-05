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
        Student pat = new Student("Patric");
        pat.addGrade(85);
        pat.addGrade(54);
        pat.addGrade(92);
        System.out.println(pat.getGradeAverage());




    }
}
