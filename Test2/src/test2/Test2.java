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
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee brandon = new Employee(1000, "Brandon", 1.00);
        int hours = 45;
        
        System.out.println("ID: " + brandon.getId());
        System.out.println("Name: " + brandon.getName());
        System.out.println("Hourly Rate: " + brandon.getHourlyRate());
        System.out.println("Pay: " + brandon.getPay(hours) + " for " + hours + " hours");
        System.out.println(brandon);
        System.out.println();
        
        brandon.setId(5000);
        brandon.setName("Norton");
        brandon.setHourlyRate(2.00);
        
        System.out.println("ID: " + brandon.getId());
        System.out.println("Name: " + brandon.getName());
        System.out.println("Hourly Rate: " + brandon.getHourlyRate());
        System.out.println("Pay: " + brandon.getPay(hours) + " for " + hours + " hours");
        System.out.println(brandon);
        System.out.println();
    }
    
}
