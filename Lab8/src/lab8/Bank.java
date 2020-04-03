/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.ArrayList;

/**
 *
 * @author banor
 */
public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();

    /**
     * used to create an account at the bank
     *
     * @param type type of account
     * @param name name of the owner of account
     * @param balance balance in the account
     * @return account number of the account that is opened
     */
    public int openAccount(String name, AccountType type, double balance) {
        Account acc = new Account(name, type, balance);
        accounts.add(acc);
        return acc.getAccountNum();
    }

    /**
     * used to close an account at the bank
     *
     * @param accountNum number of the account that needs to be closed
     * @return true if the account is closed and false if it is not
     */
    public boolean closeAccount(int accountNum) {
        for (Account acc : accounts) {
            if (acc.getAccountNum() == accountNum) {
                accounts.remove(acc.getAccountNum() - 1);
                return true;
            }
        }
        return false;
    }

    private Account getAccount(int accountNum) {
        for (Account acc : accounts) {
            if (acc.getAccountNum() == accountNum) {
                return acc;
            }
        }
        return null;
    }

    /**
     * used to deposit money into an account in the bank
     *
     * @param accountNum number of the bank account
     * @param amount amount that needs to be deposited into the account
     * @return returns true if the money is deposited and false if it is not
     */
    public boolean depositAccount(int accountNum, double amount) {
        for (Account acc : accounts) {
            if (acc.getAccountNum() == accountNum) {
                return acc.deposit(amount);
            }
        }
        return false;
    }

    /**
     * used to withdraw money from an account in the bank
     *
     * @param accountNum number of the account to be withdrawn from
     * @param amount amount to be withdrawn
     * @return true if withdrawn and false if not
     */
    public boolean withdrawAccount(int accountNum, double amount) {
        for (Account acc : accounts) {
            if (acc.getAccountNum() == accountNum) {
                return acc.withdraw(amount);
            }
        }
        return false;
    }

    /**
     * returns information about the account in a bank
     *
     * @param accountNum number of account of interest
     * @return string with info about account
     */
    public String toStringAccount(int accountNum) {
        for (Account acc : accounts) {
            if (acc.getAccountNum() == accountNum) {
                return acc.toString();
            }
        }
        return "";
    }

    /**
     * calls monthly processing on all accounts in bank
     */
    public void monthlyProcessing() {
        for (Account acc : accounts) {
            acc.monthlyProcessing();
        }
    }
}
