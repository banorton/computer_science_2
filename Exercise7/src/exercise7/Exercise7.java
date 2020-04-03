/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author banor
 */
public class Exercise7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Test constructors with valid arguments");
        System.out.println("***************************************************************************************");
        Employee e1 = new SalariedEmployee("Alice", 70000);
        Employee e2 = new HourlyEmployee("Bernard", 25);
        Employee e3 = new CommissionedEmployee("Charlie", 30000, 0.02);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println();
        System.out.println("Test constructors with invalid arguments");
        System.out.println("***************************************************************************************");
        Employee e4 = new CommissionedEmployee("Billy", 30000, -2); //commissioned employee w/ invalid commission rate sets rate to 0
        Employee e5 = new CommissionedEmployee("John", 30000, 100);//commissioned employee w/ invalid commission rate sets rate to 0
        Employee e6 = new HourlyEmployee("Bob", -10); //hourly employee w/ invalid hourly rate sets rate to 0
        Employee e7 = new SalariedEmployee("Not Bob", -1); //salary employee w/ invalid salary sets rate to 0
        System.out.println("Commission rate should be 0: " + e4);
        System.out.println("Commission rate should be 0: " + e5);
        System.out.println("Hourly rate should be 0: " + e6);
        System.out.println("Annual salary should be 0: " + e7);
        System.out.println();
        System.out.println("Testing inheritance relationship");
        System.out.println("***************************************************************************************");
        System.out.println("SalariedEmployee is an Employee: " + (e1 instanceof Employee));
        System.out.println("SalariedEmployee is an HourlyEmployee: " + (e1 instanceof HourlyEmployee));
        System.out.println("SalariedEmployee is a CommissionedEmployee: " + (e1 instanceof CommissionedEmployee));
        System.out.println("HourlyEmployee is an Employee: " + (e2 instanceof Employee));
        System.out.println("HourlyEmployee is a SalariedEmployee: " + (e2 instanceof SalariedEmployee));
        System.out.println("HourlyEmployee is a CommissionedEmployee: " + (e2 instanceof CommissionedEmployee));
        System.out.println("CommissionedEmployee is an Employee: " + (e3 instanceof Employee));
        System.out.println("CommissionedEmployee is a SalariedEmployee: " + (e3 instanceof SalariedEmployee));
        System.out.println("CommissionedEmployee is an HourlyEmployee: " + (e3 instanceof HourlyEmployee));
        System.out.println();
        System.out.println("Testing SalariedEmployee");
        System.out.println("***************************************************************************************");
        ((SalariedEmployee) e1).setAnnualSalary(0);
        System.out.println("Setting annual salary to invalid value (<=0) does not update annual salary: " + "\u001B[34m" + ((SalariedEmployee) e1).getAnnualSalary() + "\u001B[0m");
        ((SalariedEmployee) e1).setAnnualSalary(100000);
        System.out.println("Setting annual salary to valid rate updates annual salary: " + "\u001B[34m" + ((SalariedEmployee) e1).getAnnualSalary() + "\u001B[0m");
        System.out.println("Weekly salary is $" + String.format("%.2f", e1.getWeeklyPay())); //weekly pay for salary employee
        System.out.println();
        System.out.println("Testing HourlyEmployee");
        System.out.println("***************************************************************************************");
        ((HourlyEmployee) e2).setHourlyRate(0);
        System.out.println("Setting hourly rate to invalid value (<=0) does not update hourly rate: " + "\u001B[34m" + ((HourlyEmployee) e2).getHourlyRate() + "\u001B[0m");
        ((HourlyEmployee) e2).setHourlyRate(10);
        System.out.println("Setting hourly rate to valid rate (>0) updates hourly rate: " + "\u001B[34m" + ((HourlyEmployee) e2).getHourlyRate() + "\u001B[0m");
        System.out.println("Test if user enters a negative value for hours.");
        System.out.println("Weekly salary is $ " + "\u001B[34m" + String.format("%.2f", e2.getWeeklyPay()) + "\u001B[0m");
        System.out.println("Test if user enters hours that is >=0 and <=40.");
        System.out.println("Weekly salary is $ " + "\u001B[34m" + String.format("%.2f", e2.getWeeklyPay()) + "\u001B[0m");
        System.out.println("Test if user enters hours that is >40.");
        System.out.println("Weekly salary is $ " + "\u001B[34m" + String.format("%.2f", e2.getWeeklyPay()) + "\u001B[0m");
        System.out.println();
        System.out.println("Testing Commissioned Employee");
        System.out.println("***************************************************************************************");
        ((CommissionedEmployee) e3).setCommissionRate(-1); //setting commission rate to invalid value (<0) does not update commission rate
        System.out.println("Setting commission rate to invalid number (<0) does not update commission rate: " + "\u001B[34m" + ((CommissionedEmployee) e3).getCommissionRate() + "\u001B[0m");
        ((CommissionedEmployee) e3).setCommissionRate(0.03); //setting commission rate to invalid value (>1)does not update commission rate
        System.out.println("Setting commission rate to valid value (>=0 and <=1) updates commission rate: " + "\u001B[34m" + ((CommissionedEmployee) e3).getCommissionRate() + "\u001B[0m");
        ((CommissionedEmployee) e3).setCommissionRate(10); //setting commission rate to invalid value (>1)does not update commission rate
        System.out.println("Setting commission rate to invalid value (>1) does not update commission rate: " + "\u001B[34m" + ((CommissionedEmployee) e3).getCommissionRate() + "\u001B[0m");
        System.out.println("Test if user enters a negative sales amount.");
        System.out.println("Weekly salary is $" + String.format("%.2f", e3.getWeeklyPay()));
        System.out.println("Test if user enters a positive sales amount.");
        System.out.println("Weekly salary is $" + String.format("%.2f", e3.getWeeklyPay()));
    }

}
