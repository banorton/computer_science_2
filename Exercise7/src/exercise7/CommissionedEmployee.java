/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

import java.util.Scanner;

/**
 *
 * @author banor
 */
public class CommissionedEmployee extends SalariedEmployee {

    private double commissionRate;

    public CommissionedEmployee(String name, double annualSalary, double commissionRate) {
        super(name, annualSalary);
        if (commissionRate < 0) {
            this.commissionRate = 0;
        } else if (commissionRate >= 100) {
            this.commissionRate = 0;
        } else {
            this.commissionRate = commissionRate;
        }
    }

    public double getCommissionRate() {
        return this.commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getWeeklyPay() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sales amount: ");
        double commission = scan.nextInt();
        double weeklyPay = this.getAnnualSalary() + (commission * this.commissionRate);
        return weeklyPay;
    }

    public String toString() {
        return "id = " + this.getId() + ", name = " + this.getName() + ", annualSalary = $" + this.getAnnualSalary() + ", commissionRate = " + this.getCommissionRate();
    }
}
