public class Student {
    public String name;
    public String coHort;
    private double grade;
// Note: lets add a construcor: what is it?  A METHOD OBJECT CREATION
    public Student(String studentName){
//       this.name = studentName;
//        this.coHort = "unassigned";
        // calling second constructor inside constructor
        this(studentName, "Unassigned");
    }

    public Student(String studentName, String studentCohort){
        this.name = studentName;
        this.coHort = studentCohort;
    }
    public Student(String studentName, String studentCohort, double grade){
        this.name = studentName;
        this.coHort = studentCohort;
        this.grade = grade;
    }

    public static void main(String[] args) {
        //before constructors: [similar to JS?]
        Student mcStudent = new Student("ROnaLd");
        mcStudent.name = "ROnaLd";
        mcStudent.coHort = "Golden Arches";

        System.out.println(mcStudent.name + " is in the " + mcStudent.coHort + " coHort");

        //first constructor
        Student shanshan = new Student("Shanshan S.");

        System.out.println("Shanshan.name = " + shanshan.name + " Shanshan Cohort = " + shanshan.coHort);

        Student kenneth = new Student("Kenneth H. ", "Demios");

        System.out.println("Kenneth.name = " + kenneth.name + " Kenneth Cohort = " + kenneth.coHort);

        Student Mckenneth = new Student("McKenneth H. ", "Demios", 88);
        
        System.out.println("McKenneth.name = " + Mckenneth.name + " McKenneth Cohort = " + Mckenneth.coHort + "McKenneth Grade = " + Mckenneth.grade);
        
        
    }
}
