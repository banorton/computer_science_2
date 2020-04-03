/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author banor
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Student bob = new Student();
//        Student john = new Student("John", "800123456", 'm', 20, true);
//        
//        System.out.println(bob.getFirstName());
//        System.out.println(bob.getStudentId());
//        System.out.println(bob.getGender());
//        System.out.println(bob.getAge());
//        System.out.println(bob.getLiveOnCampus());
//        System.out.println();
//        System.out.println(john.getFirstName());
//        System.out.println(john.getStudentId());
//        System.out.println(john.getGender());
//        System.out.println(john.getAge());
//        System.out.println(john.getLiveOnCampus());

        Student mary = new Student("Joan", "800234567", 'f', 19, false);

//        System.out.println("Object mary first name is " + mary.getFirstName());
//        mary.setFirstName("Sue");
//        System.out.println("Object mary first name is " + mary.getFirstName());
//
//        System.out.println("Object mary student ID is " + mary.getStudentId());
//        mary.setStudentId("000000000");
//        System.out.println("Object mary student ID is " + mary.getStudentId());
//
//        System.out.println("Object mary gender is " + mary.getGender());
//        mary.setGender('M');
//        System.out.println("Object mary gender is " + mary.getGender());
//
//        System.out.println("Object mary age is " + mary.getAge());
//        mary.setAge(400);
//        System.out.println("Object mary age is " + mary.getAge());
//
//        System.out.println("Object mary lives on campus is " + mary.getLiveOnCampus());
//        mary.setLiveOnCampus(true);
//        System.out.println("Object mary lives on campus is " + mary.getLiveOnCampus());

        mary.transferToCard(-100.00);
        mary.transferToCard(100.00);
        mary.payFromCard(1000.00);
        mary.payFromCard(50.00);
        
    }

}
