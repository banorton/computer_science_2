/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateproject;

/**
 * A class representing a date.
 * @author lcao2
 */
public class Date {
    /**
     * The month of the Date
     */
    private int month;
    /**
     * The day of the Date
     */
    private int day;
    /**
     * The year of the Date
     */
    private int year; 

    /**
     * Constructs a new Date whose month and day are 1, and year is 1900.
     */
    public Date() {
        month = 1;
        day = 1;
        year = 1900;
    }

    /**
     * Constructs a new Date whose month, day and year are specified by the arguments of the same name.
     *
     * @param month value of month
     * @param day value of day
     * @param year value of year
     */
    public Date(int month, int day, int year) throws Exception{
        if(month<1||month>12){
            throw new Exception("Invalid month: out of range");
        }
        if(day<1||day>31){
            throw new Exception("Invalid day: out of range");
        }
        if(year<1752||year>2020){
            throw new Exception("Invalid day: out of range");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    /**
     * Get the value of month
     *
     * @return returns the value stored in month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Get the value of day
     *
     * @return returns the value stored in day
     */
    public int getDay() {
        return day;
    }

    /**
     * Get the value of year
     *
     * @return returns the value stored in year
     */
    public int getYear() {
        return year;
    }

    /**
     * Set the value of month
     *
     * @param month new value of month
     */
    public void setMonth(int month){
            this.month = month;
    }

    /**
     * Set the value of day
     *
     * @param day new value of day
     */
    public void setDay(int day){
        this.day = day;
    }

    /**
     * Set the value of year
     *
     * @param year new value of year
     */
    public void setYear(int year){
        this.year = year;
    }

    
    /**
     * Returns a String representing this Date and its values.
     *
     * @return a String containing the date in month-day-year format
     */
    public String toString() {
        return (month + "-" + day + "-" + year);
    }
}
