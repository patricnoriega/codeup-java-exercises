package Interfaces_Abstract_Lecture;

public class Company {

    public static void main(String[] args) {
        Accountant accountantBot = new Accountant("numberBot", "Accounting");
        Custodian custodianBot = new Custodian("cleanerBot", "Maintenance");

//        System.out.println(accountantBot.getName());
//        System.out.println(accountantBot.getDepartment());
//        System.out.println(accountantBot.work());
//
//        System.out.println(custodianBot.getName());
//        System.out.println(custodianBot.getDepartment());
//        System.out.println(custodianBot.work());

        System.out.println(accountantBot.getName() + " is reporting for business in the " + accountantBot.getDepartment() + " department");
        System.out.println(custodianBot.getName() + " is reporting for business in the " + custodianBot.getDepartment() + " department");

        System.out.println();

        System.out.println("Accounting morning: " + accountantBot.morningMeeting());
        System.out.println("Maintenance morning: " + custodianBot.morningMeeting());

        System.out.println();

        System.out.println("Accounting lunch time: " + accountantBot.lunchTime());
        System.out.println("Maintenance lunch time: " + custodianBot.lunchTime());

        System.out.println();

        System.out.println("Accounting's work: " + accountantBot.work());
        System.out.println("Maintenance's work " + custodianBot.work());

        System.out.println();

        System.out.println("Accounting's daily pay: $" + accountantBot.dailyPay());
        System.out.println("Maintenance's daily pay: $" +custodianBot.dailyPay());
    }
}
