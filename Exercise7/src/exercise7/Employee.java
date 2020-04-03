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
public class Employee {

    private int id;
    private String name;
    private static int nextId = 1000;

    public Employee(String name) {
        this.name = name;
        this.id = nextId;
        nextId = nextId + 1;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getWeeklyPay() {
        double weeklyPay = 0;
        return weeklyPay;
    }

    public String toString() {
        String info = "";
        return info;
    }
}
