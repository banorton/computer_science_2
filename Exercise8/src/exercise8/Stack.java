/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise8;

import java.util.ArrayList;
import java.lang.*;

/**
 *
 * @author lcao2
 */
public class Stack {

    private ArrayList<Integer> elements;

    /**
     * Creates an empty stack.
     */
    public Stack() {
        elements = new ArrayList<>();
    }

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param e the item to be pushed onto this stack.
     */
    public void push(Integer e) {
        elements.add(e);
    }

    /**
     * Removes and returns the item at the top of this stack.
     *
     * @return the item at the top of this stack.
     */
    public Integer pop() throws NullPointerException {
        int index = elements.size()-1;
        if (index < 0){
            throw new NullPointerException("Error: Stack is empty");
        }
        int item = elements.get(index);
        elements.remove(index);
        return item;
    }

    /**
     * Looks at the item at the top of this stack without removing it from the
     * stack.
     *
     * @return the item at the top of this stack.
     */
    public Integer peek() throws NullPointerException {
        int index = elements.size()-1;
        if (index < 0){
            throw new NullPointerException("Error: Stack is empty");
        }
        int item = elements.get(index);
        return item;
    }

    /**
     * Returns the number of items in this stack.
     *
     * @return the number of items in this stack.
     */
    public int size() {
        return elements.size();
    }

    /**
     * Returns a String representation of this stack.
     *
     * @return the String representation of this stack.
     */
    @Override
    public String toString() {
        String stackString = "";
        for (int i = 0; i < elements.size(); i++){
            stackString += " " + elements.get(i);
        }
        return stackString;
    }

}
