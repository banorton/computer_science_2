package lab5;

/**
 * This class defines the BurgerOrderClass that allows you to store and edit
 * order information.
 *
 * @author Brandon Norton
 * @version 1.0
 */
public class BurgerOrder {

    private int orderNum;
    private int numBurgers;
    private int numFries;
    private int numBeverages;
    private boolean complete;
    private static int nextOrderNum = 1;

    /**
     * The final price for a burger
     */
    public static final double BURGER_PRICE = 3.99;

    /**
     * The final price for fries
     */
    public static final double FRIES_PRICE = 1.99;

    /**
     * The final price for beverages
     */
    public static final double BEVERAGES_PRICE = 1.29;

    /**
     * Constructor for an order that takes the number of burgers, fries, and
     * beverages
     *
     * @param numBurgers number of burgers ordered
     * @param numFries number of fries ordered
     * @param numBeverages number of beverages ordered
     */
    public BurgerOrder(int numBurgers, int numFries, int numBeverages) {
        if (numBurgers < 0 || numFries < 0 || numBeverages < 0) {
            System.out.println("Numbers of orders must be 0 or greater.");
            return;
        }
        this.orderNum = nextOrderNum;

        this.numBurgers = numBurgers;

        this.numFries = numFries;

        this.numBeverages = numBeverages;

        this.complete = false;
        nextOrderNum++;
    }

    /**
     * Returns the order number
     *
     * @return the order number
     */
    public int getOrderNum() {
        return orderNum;
    }

    /**
     * Returns the number of burgers ordered
     *
     * @return the number of burgers ordered
     */
    public int getNumBurgers() {
        return numBurgers;
    }

    /**
     * Returns the number of fries ordered
     *
     * @return the number of fries ordered
     */
    public int getNumFries() {
        return numFries;
    }

    /**
     * Returns the number of beverages ordered
     *
     * @return the number of beverages ordered
     */
    public int getNumBeverages() {
        return numBeverages;
    }

    /**
     * Returns whether the order is complete or not
     *
     * @return whether the order is complete or not
     */
    public boolean isComplete() {
        return complete;
    }

    /**
     * Returns the number of the next order
     *
     * @return the number of the next order
     */
    public int getNextOrderNum() {
        return nextOrderNum;
    }

    /**
     * Sets the number of burgers ordered
     *
     * @param numBurgers stores the number of burgers ordered
     */
    public void setNumBurgers(int numBurgers) {
        if (numBurgers < 0) {
            System.out.println("Numbers of orders must be 0 or greater.");
            return;
        }
        this.numBurgers = numBurgers;
    }

    /**
     * Sets the number of fries ordered
     *
     * @param numFries stores the number of fires ordered
     */
    public void setNumFries(int numFries) {
        if (numFries < 0) {
            System.out.println("Numbers of orders must be 0 or greater.");
            return;
        }
        this.numFries = numFries;
    }

    /**
     * Sets the number of beverages ordered
     *
     * @param numBeverages stores the number of beverages ordered
     */
    public void setNumBeverages(int numBeverages) {
        if (numBeverages < 0) {
            System.out.println("Numbers of orders must be 0 or greater.");
            return;
        }
        this.numBeverages = numBeverages;
    }

    /**
     * Sets whether the order is complete or not.
     *
     * @param complete stores the state of the order
     */
    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    /**
     * Calculates the total of the entire order using the prices and number of
     * orders for the burgers, fries, and beverages
     *
     * @return the value of the total of the order
     */
    public double calculateOrderTotal() {
        double burgerTotal = (this.numBurgers * BURGER_PRICE);
        double friesTotal = (this.numFries * FRIES_PRICE);
        double beveragesTotal = (this.numBeverages * BEVERAGES_PRICE);
        double total = burgerTotal + friesTotal + beveragesTotal;
        return total;
    }

    /**
     * Define the format for printing the object as a string by displaying
     * information about the order
     *
     * @return information about the order in a String
     */
    @Override
    public String toString() {
        String info = "orderNum = " + this.orderNum + " numberBurgers = " + this.numBurgers + " numFries = " + this.numFries + " numBeverages = " + this.numBeverages + " complete = " + this.complete + " orderTotal = " + this.calculateOrderTotal();
        return info;
    }
}
