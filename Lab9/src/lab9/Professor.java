/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.ArrayList;

/**
 *
 * @author banor
 */
public class Professor extends Person {

    private String department;
    private double salary;
    private ArrayList<Student> advisees = new ArrayList<>();

    /**
     * constructs the professor object which extends the person class
     * @param name name of the professor
     * @param id id of the professor
     * @param department department the professor is in
     * @param salary salary of the professor
     */
    public Professor(String name, int id, String department, double salary) {
        super(name, id);
        this.department = department;
        this.salary = salary;
    }

    /**
     * gets the department of a professor
     * @return department of professor
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * gets the salary of a professor
     * @return salary of professor
     */
    public double getSalary() {
        return this.salary;
    }

    /**
     * gets the advisees for a professor
     * @return advisees of professor
     */
    public ArrayList<Student> getAdvisees() {
        return this.advisees;
    }

    /**
     * sets the department for a professor
     * @param dept department of a professor
     */
    public void setDepartment(String dept) {
        this.department = dept;
    }

    /**
     * sets the salary for a professor
     * @param salary salary of a professor
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * adds an advisee to the advisees ArrayList for the professor
     * @param student student to be added to advisees
     */
    public void addAdvisee(Student student) {
        advisees.add(student);
    }

    /**
     * removes an advisee of the advisees ArrayList
     * @param name name of student to be removed
     * @return true if student could be found and false if not
     */
    public boolean removeAdvisee(String name) {
        boolean tf = false;
        for (Student tempAdvisee : advisees) {
            if (tempAdvisee.getName() == name) {
                tf = advisees.remove(tempAdvisee);
                return tf;
            }
        }
        return tf;
    }

    /**
     * displays information about professor
     */
    public void display() {
        super.display();
        System.out.println("Department = " + this.department);
        System.out.println("Salary = " + this.salary);
        System.out.println("Advisees: ");
        for (Student tempAdvisee : advisees) {
            System.out.println(tempAdvisee.getName());
        }
    }

}
