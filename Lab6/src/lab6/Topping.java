/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Brandon Norton
 */
public enum Topping {

    /**
     * Topping type with a double for the cost
     */
    PEPPERONI(1.50),

    /**
     * Topping type with a double for the cost
     */
    CHICKEN(1.95),

    /**
     * Topping type with a double for the cost
     */
    MEATBALL(1.80),

    /**
     * Topping type with a double for the cost
     */
    PEPPER(1.00),

    /**
     * Topping type with a double for the cost
     */
    MUSHROOMS(1.50),

    /**
     * Topping type with a double for the cost
     */
    ONIONS(1.00);

    private final double price;

    private Topping(double price) {
        this.price = price;
    }

    /**
     *returns the price of a topping
     * @return a double value for the price of a topping
     */
    public double getPrice() {
        return price;
    }
}
