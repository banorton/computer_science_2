/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.util.ArrayList;

/**
 *
 * @author lcao2
 */
public class Lab10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Person p = new Person("Alice", 1000);
//
//        Person p1 = new Person("Brandon Norton", 800939558);
//        System.out.println(p1);
//
//        Student s = new Student("Michael", 154, "CS", 3.5);
//        System.out.println(s);
//        
//        Professor p2 = new Professor("Jane", 201, "History", 45000);
//        System.out.println(p2);

        ArrayList<Person> list = new ArrayList();
        Person p1 = new Person("Brandon", 800939558);
        Student s1 = new Student("Bob", 900, "CS", 3.5);
        Student s2 = new Student("Catherine", 901, "English", 3.2);
        Professor professor1 = new Professor("David", 300, "CS", 101000);
        Person p2 = new Person("Elle", 1001);
        Professor professor2 = new Professor("Frank", 400, "Math", 85000);
        Student s3 = new Student("Grace", 902, "English", 3.6);
        Student s4 = new Student("Hank", 903, "Engineering", 3.9);
        Student s5 = new Student("Lisa", 904, "Math", 2.8);
        Professor professor3 = new Professor("Mike", 500, "CS", 100000);
        Professor professor4 = new Professor("Nick", 600, "CS", 98000);

        list.add(p1);
        list.add(p2);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(professor1);
        list.add(professor2);
        list.add(professor3);
        list.add(professor4);

//        for (Person p : list) {
//            System.out.println(p);
//        }
//        for (Person p : list) {
//            if (matchId(p, 903)) {
//                System.out.println(p);
//            }
//        }
//        Person p = new Person("Bob", 900);
//        if (p instanceof Student) {
//            System.out.println(((Student) p).getGpa());
//        }
        System.out.println("Students eligible for scholarship:");
        for (Person p : list) {
            if (p instanceof Student) {
                if (((Student) p).getGpa() > 3.5) {
                    System.out.println("- " + p.getName());
                }
            }
        }
        System.out.println();
        System.out.println("Professors in the CS Department:");
        for (Person p : list) {
            if (p instanceof Professor) {
                if (((Professor) p).getDepartment() == "CS") {
                    System.out.println("- " + p.getName());
                }
            }
        }
        System.out.println();
    }

    public static boolean matchId(Person p, int id) {
        if (p.getId() == id) {
            return true;
        }
        return false;
    }

}
