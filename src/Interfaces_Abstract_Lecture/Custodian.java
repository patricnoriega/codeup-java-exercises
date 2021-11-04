package Interfaces_Abstract_Lecture;

public class Custodian extends Employee {

    public  Custodian (String name, String department){
        super(name, department);
    }

    public String work(){
        return "Maintain the building - Restocking - Cleaning messes ";
    }

    public String morningMeeting() {
        return "Custodians get direct reports when maintenance is needed";
    }

    public String lunchTime() {
        return "12:00 - 1:00";
    }

    public int dailyPay() {
        return 180;
    }
}
