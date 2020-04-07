/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 * defines the properties and functions of a bank account
 *
 * @author banor
 */
public class Account {

    private int accountNum;
    private String name;
    private double balance;
    private static int nextAccountNum = 1;

    /**
     * constructor for the account class
     *
     * @param name name of the account
     * @param balance balance in the account
     */
    public Account(String name, double balance) {
        if (balance < 0) {
            System.out.println("Balance can not be negative.");
        }
        this.name = name;
        this.balance = balance;
        this.accountNum = nextAccountNum;
        nextAccountNum++;
    }

    /**
     * Get the value of accountNum
     *
     * @return the value of accountNum
     */
    public int getAccountNum() {
        return this.accountNum;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getCustomerName() {
        return this.name;
    }

    /**
     * Get the value of balance
     *
     * @return the value of balance
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * Get the value of balance
     *
     * @return the value of balance
     */
    public void setBalance(double amount) {
        this.balance = amount;
    }

    /**
     * deposits money into an account
     *
     * @param amount amount to be deposited
     * @return true if deposit is successful and false if not
     */
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    /**
     * withdraws money from an account
     *
     * @param amount amount to be withdrawn
     * @return true if withdrawn and false if not
     */
    public boolean withdraw(double amount) {
        if ((amount > 0) && (amount <= this.balance)) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    /**
     * adds interest to account
     */
    public void monthlyProcessing() {
        double amount = this.getBalance() * this.getInterestRate() / 12;
//        System.out.println(this.getInterestRate());
//        System.out.println(this.getInterestRate()*this.getBalance());
//        System.out.println(this.getInterestRate()*this.getBalance()/12);
//        System.out.println(amount);
        this.balance += amount;
    }

    /**
     *
     * @return
     */
    public double getInterestRate() {
        return this.getInterestRate();
    }

    /**
     * returns string of info about account
     *
     * @return string of info
     */
    @Override
    public String toString() {
        String info = "[account number = " + this.accountNum + ", customer name = " + this.name + ", type of account = " + this.type + ", available balance = " + this.balance + "]";
        return info;
    }
}
