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
public class Cd extends Account {

    private int term;
    private int termLeft;
    public static final double ANNUAL_INTEREST_RATE = 0.02;

    /**
     *
     * @param term
     * @param name
     * @param balance
     */
    public Cd(int term, String name, double balance) {
        super(name, balance);
        this.term = term;
        this.termLeft = term;
    }

    @Override
    public boolean deposit(double amount) {
        if ((amount > 0) && (this.termLeft == 0) && ((this.getBalance() - amount) >= 25)) {
            this.setBalance(this.getBalance() + amount);
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw(double amount) {
        if ((amount > 0) && (this.termLeft == 0) && (amount <= this.getBalance()) && ((this.getBalance() - amount) >= 25)) {
            this.setBalance(this.getBalance() - amount);
            return true;
        }
        return false;
    }

    /**
     * adds interest to account
     */
    @Override
    public void monthlyProcessing() {
        double amount = this.getBalance() * Cd.ANNUAL_INTEREST_RATE / 12;
//        System.out.println(amount);
        this.setBalance(this.getBalance() + amount);
//        System.out.println(tf);
//        System.out.println(this.getBalance());
        if (this.termLeft > 0) {
            this.termLeft -= 1;
        } else {
            this.termLeft = 0;
        }
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
        return "CdAccountNum = " + this.getAccountNum() + ", customerName = " + this.getCustomerName() + ", balance = $" + this.getBalance() + ", term = " + this.term + ", termLeft = " + this.termLeft;
    }
}
