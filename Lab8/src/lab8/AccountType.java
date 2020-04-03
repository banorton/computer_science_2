/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author banor
 */
public enum AccountType {

    /**
     *annual checking interest rate
     */
    CHECKING(0.001),

    /**
     *annual savings interest rate
     */
    SAVING(0.017),

    /**
     *annual CD interest rate
     */
    CD(0.02);

    private double interestRate;

    private AccountType(double intRate) {
        this.interestRate = intRate;
    }

    /**
     *returns a double value containing the interest rate
     * @return double interest rate
     */
    public double getRate() {
        return this.interestRate;
    }
}
