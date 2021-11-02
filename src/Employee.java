public class Employee extends Person {

    public Employee(String employeename) {
        super(employeename);
    }
    public int getAge(){
        return this.age;
    }

    public void sayHello(){
        System.out.println("Welcome to MegaCorp - how may I help you my name is " + this.getName());
    }
    public void doWork(){
        System.out.println("work.. work.. work..");
    }

    public static void main(String[] args) {

        Person unemployedPat = new Person("Patty");
        System.out.println("unemployedPat.name = " + unemployedPat.getName());

        Employee pat = new Employee("Pat");
        pat.sayHello();
        System.out.println("pat.name = " + pat.getName());

        pat.doWork();

    }
}

