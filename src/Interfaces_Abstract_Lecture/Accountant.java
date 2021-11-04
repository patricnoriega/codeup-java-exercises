package Interfaces_Abstract_Lecture;

public class Accountant extends Employee {


    public Accountant(String name, String department){
super(name, department);
    }

    public String work(){
        return "TPS reports";
    }

    public String morningMeeting() {
        return "Morning meeting begins at 8am to 8:45";
    }

    public String lunchTime() {
        return "12:00 - 1:30";
    }

    public int dailyPay() {
        return 500;
    }
}


