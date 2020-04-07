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
public class Savings extends Account {

    private int numWithdrawals;
    private static final int MAX_WITHDRAWALS = 4;
    public static final double ANNUAL_INTEREST_RATE = 0.017;

    /**
     *
     * @param name
     * @param balance
     */
    public Savings(String name, double balance) {
        super(name, balance);
    }

    public boolean withdraw(double amount) {
        if ((amount > this.getBalance()) || (numWithdrawals == 4)) {
            return false;
        }
        if (amount > 0) {
            this.setBalance(this.getBalance() - amount);
            numWithdrawals += 1;
            return true;
        }
        return false;
    }

    /**
     * adds interest to account
     */
    @Override
    public void monthlyProcessing() {
        double amount = this.getBalance() * this.getInterestRate() / 12;
        this.deposit(amount);
        this.numWithdrawals = 0;
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
        return "SavingsAccountNum = " + this.getAccountNum() + ", customerName = " + this.getCustomerName() + ", balance = $" + this.getBalance() + ", numWidthdrawls = " + this.numWithdrawals;
//        return "SavingsAccountNum = " + this.getAccountNum() + ", customerName = " + this.getCustomerName() + ", balance = $" + this.getBalance();
//        return "test";
    }
}
