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
public class Person {

    private String name;
    private int id;

    /**
     * constructs the person class
     * @param name name of the person
     * @param id id of the person
     */
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /**
     * gets person's name
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * gets person's id number
     * @return id number
     */
    public int getId() {
        return this.id;
    }

    /**
     *displays the name and id of the person
     */
    public void display() {
        System.out.println("Name = " + this.name);
        System.out.println("ID = " + this.id);
    }
}
