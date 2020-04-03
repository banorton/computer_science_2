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
public class HourlyEmployee extends Employee {

    private double hourlyRate;
    private int MAX_HOURS = 40;

    public HourlyEmployee(String name, double hourlyRate) {
        super(name);
        if (hourlyRate < 0) {
            this.hourlyRate = 0;
        } else {
            this.hourlyRate = hourlyRate;
        }
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getWeeklyPay() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of hours worked: ");
        double weeklyPay = 0;
        double hours = scan.nextInt();
        if (hours < 0) {
            return 0;
        }
        if (hours > MAX_HOURS) {
            weeklyPay = (MAX_HOURS * this.hourlyRate) + ((hours - MAX_HOURS) * (this.hourlyRate * 1.5));
            return weeklyPay;
        }
        if (hours <= MAX_HOURS) {
            weeklyPay = hours * this.hourlyRate;
            return weeklyPay;
        }
        return weeklyPay;
    }

    public String toString() {
        return "id = " + this.getId() + ", name = " + this.getName() + ", hourlyRate = $" + this.hourlyRate;
    }
}
