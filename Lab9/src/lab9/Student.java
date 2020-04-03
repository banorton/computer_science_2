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
public class Student extends Person {

    private String major;
    private double gpa;
    private ArrayList<String> enrolledClasses = new ArrayList<>();

    /**
     * constructs the student object with extends the person class
     * @param name name of student
     * @param id id of student
     * @param major student's major
     * @param gpa student's gpa
     */
    public Student(String name, int id, String major, double gpa) {
        super(name, id);
        this.major = major;
        this.gpa = gpa;
    }

    /**
     * gets a student's major
     * @return student major
     */
    public String getMajor() {
        return this.major;
    }

    /**
     * gets a student's gpa
     * @return student's gpa
     */
    public double getGpa() {
        return this.gpa;
    }

    /**
     * gets the classes that a student is enrolled in
     * @return ArrayList with student's classes
     */
    public ArrayList<String> getEnrolledClasses() {
        ArrayList<String> classes = this.enrolledClasses;
        return classes;
    }

    /**
     * sets a student's major
     * @param major student's major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * sets a student's gpa
     * @param gpa student's gpa
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * adds a class to the ArrayList enrolledClasses for the student
     * @param name name of the class to be added
     */
    public void addClass(String name) {
        enrolledClasses.add(name);
    }

    /**
     * removes a class in the ArrayList enrolledClasses for the student
     * @param name name of class to be dropped
     * @return returns true if the class was removed and false if the class could not be found
     */
    public boolean dropClass(String name) {
        boolean tf = enrolledClasses.remove(name);
        return tf;
    }

    /**
     * displays information about the student and overrides the person display method
     */
    @Override
    public void display() {
        super.display();
        System.out.println("Major = " + this.major);
        System.out.println("GPA = " + this.gpa);
        System.out.println("Enrolled in the following classes : ");
        for (String tempClass : enrolledClasses) {
            System.out.println(tempClass);
        }
    }
}
