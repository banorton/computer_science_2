/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author brandon
 */
public class Checking extends Account {

    private static double MIN_BALANCE = 25;
    public static final double ANNUAL_INTEREST_RATE = 0.001;

    /**
     *
     * @param name
     * @param balance
     */
    public Checking(String name, double balance) {
        super(name, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if ((amount > 0) && (amount <= this.getBalance()) && ((this.getBalance() - amount) >= 25)) {
            this.setBalance(this.getBalance() - amount);
            return true;
        }
        return false;
    }

    /**
     *
     * @return
     */
    @Override
    public double getInterestRate() {
        return ANNUAL_INTEREST_RATE;
    }

    @Override
    public String toString() {
        return "CheckingAccountNum = " + this.getAccountNum() + ", customerName = " + this.getCustomerName() + ", balance = $" + this.getBalance();
    }
}
