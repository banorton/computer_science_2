/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author banor
 */
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 900, "CS", 3.5);
        Student s2 = new Student("Catherine", 901, "CS", 3.2);
        Student s3 = new Student("Dylan", 902, "CS", 3.0);
        
        Professor p1 = new Professor("Brandon Norton", 800939558, "CS", 80000);
        p1.addAdvisee(s3);
        p1.addAdvisee(s2);
        p1.addAdvisee(s1);
        
        p1.display();
        
        if (p1.removeAdvisee("John")){
            System.out.println("The advisee has been removed");
        } else {
            System.out.println("The advisee cannot be found in the list");
        }
        
        if (p1.removeAdvisee("Bob")){
            System.out.println("The advisee has been removed");
        } else {
            System.out.println("The advisee cannot be found in the list");
        }
    }

}
