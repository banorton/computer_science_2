/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author lcao2
 */
public class Employee {

    private int id;
    private String name;
    private double hourlyRate;
    private final int MAX_HOURS = 40;

    public Employee(int id, String name, double hourlyRate) {
        if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        }
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

    public void setId(int newId) {
        if (newId >= 0) {
            this.id = newId;
        }
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setHourlyRate(double newHourlyRate) {
        if (newHourlyRate >= 0) {
            this.hourlyRate = newHourlyRate;
        }
    }

    public double getPay(int hours) {
        double overtimeHourlyRate = 1.5 * hourlyRate;
        double pay = 0;
        if (hours < 0) {
            return 0.0;
        } else if (hours <= MAX_HOURS) {
            pay = hours * this.hourlyRate;
            return pay;
        } else if (hours > MAX_HOURS) {
            pay = (MAX_HOURS * hourlyRate) + ((hours - MAX_HOURS) * overtimeHourlyRate);
            return pay;
        }
        return pay;
    }

    @Override
    public String toString() {
        String info = "[ID: " + this.id + ", " + "Name: " + this.name + ", " + "Hourly Rate: $" + this.hourlyRate + "]";
        return info;
    }
}
