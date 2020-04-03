/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author banor
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BurgerOrder order1 = new BurgerOrder(1, 1, 1);
        System.out.println("Order #" + order1.getOrderNum());
        System.out.println("numBurgers: " + order1.getNumBurgers());
        System.out.println("numFries: " + order1.getNumFries());
        System.out.println("numBeverages: " + order1.getNumBeverages());
        System.out.println("Complete: " + order1.isComplete());
        System.out.printf("Total: " + "%.2f", order1.calculateOrderTotal());
        System.out.println();
        System.out.println(order1);

        System.out.println();

        BurgerOrder order2 = new BurgerOrder(2, 2, 2);
        System.out.println("Order #" + order2.getOrderNum());
        System.out.println("numBurgers: " + order2.getNumBurgers());
        System.out.println("numFries: " + order2.getNumFries());
        System.out.println("numBeverages: " + order2.getNumBeverages());
        System.out.println("Complete: " + order2.isComplete());
        System.out.printf("Total: " + "%.2f", order2.calculateOrderTotal());
        System.out.println();
        System.out.println(order2);
    }

}
