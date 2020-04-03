/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author banor
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza p1 = new Pizza(10);
        System.out.println(p1);
        p1.addTopping(Topping.PEPPERONI);
        System.out.println(p1);
        p1.addTopping(Topping.MUSHROOMS);
        p1.addTopping(Topping.ONIONS);
        System.out.println(p1);
        System.out.println(p1.removeTopping(Topping.PEPPER));
        System.out.println(p1.removeTopping(Topping.MUSHROOMS));
        System.out.println(p1);
        p1.setSize(20);
        System.out.println(p1);
    }
    
}
