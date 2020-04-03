/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;

/**
 *
 * @author Brandon Norton
 */
public class Pizza {

    private int size;
    private ArrayList<Topping> toppings;
    private final double COST_12_INCH = 9.25;
    private final double COST_14_INCH = 10.95;
    private final double COST_16_INCH = 12.95;
    private final double COST_18_INCH = 14.95;

    public static void main(String[] args) {
    }

    /**
     * defines the constructor for the pizza class that takes an int, s, for the size;
     *
     * @param s int for the size of the pizza
     */
    public Pizza(int s) {
        toppings = new ArrayList<Topping>();
        if ((s == 12) || (s == 14) || (s == 16) || (s == 18)) {
            size = s;
        } else {
            System.out.println("ERROR: Size must be 12, 14, 16, or 18.");
            size = 12;
        }
    }

    /**
     * returns the size(int) of the pizza
     *
     * @return size(int) of pizza
     */
    public int getSize() {
        return this.size;
    }

    /**
     *method allows the size of the pizza to be changed by passing in an int, size.
     * @param size int for the size of the pizza
     */
    public void setSize(int size) {
        if ((size == 12) || (size == 14) || (size == 16) || (size == 18)) {
            this.size = size;
        } else {
            System.out.println("ERROR: Size must be 12, 14, 16, or 18.");
        }
    }

    /**
     *allows toppings to be added to the pizza by passing in Topping t
     * @param t Topping type, the topping that is to be added to the pizza
     */
    public void addTopping(Topping t) {
        toppings.add(t);
    }

    /**
     *allows a specific topping, t(Topping), to be completely removed from the pizza and returns true if it was on the pizza and false if it was not
     * @param t A Topping type, the topping that should be removed
     * @return boolean, true if the topping was on the pizza and false if it was not
     */
    public boolean removeTopping(Topping t) {
        boolean tf = false;
        for (int i = 0; i < toppings.size(); i++) {
            if (t == toppings.get(i)) {
                toppings.remove(i);
                tf = true;
            }
        }
        return tf;
    }

    /**
     *retrieves the total price of the pizza as a double by adding the price of the base pizza and all the toppings.
     * @return double value with the total price of the pizza
     */
    public double getPrice() {
        double totalPrice;

        switch (this.size) {
            case 12:
                totalPrice = COST_12_INCH;
                break;
            case 14:
                totalPrice = COST_14_INCH;
                break;
            case 16:
                totalPrice = COST_16_INCH;
                break;
            case 18:
                totalPrice = COST_18_INCH;
                break;
            default:
                totalPrice = COST_12_INCH;
                break;
        }

        for (Topping topping : toppings) {
            totalPrice = totalPrice + topping.getPrice();
        }
        return totalPrice;
    }

    /**
     *defines the info such as size, toppings, and price, that will displayed if the object is printed
     * @return a String with the info for the pizza
     */
    @Override
    public String toString() {
        String info = "size = " + this.size + ", toppings: ";
        for (Topping topping : toppings) {
            info = info + topping + ", ";
        }
        info = info + "price: $" + this.getPrice();
        return info;
    }
}
