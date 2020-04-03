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
public class SalariedEmployee extends Employee {

    private double annualSalary;
    private int WEEKS_PER_YEAR = 52;

    public SalariedEmployee(String name, double annualSalary) {
        super(name);
        if (annualSalary < 0) {
            this.annualSalary = 0;
        } else {
            this.annualSalary = annualSalary;
        }
    }

    public double getAnnualSalary() {
        return this.annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        if (annualSalary <= 0) {
        } else {
            this.annualSalary = annualSalary;
        }
    }

    public double getWeeklyPay() {
        double weeklyPay = this.annualSalary / WEEKS_PER_YEAR;
        return weeklyPay;
    }

    public String toString() {
        return "id = " + this.getId() + ", name = " + this.getName() + ", annualSalary = $" + this.annualSalary;
    }
}
