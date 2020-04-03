package lab4;

/**
 * Defines the student object and its fields, constructors, and getters/setters.
 * @author Brandon Norton
 * @version 1.0
 */
public class Student {

    private String firstName;
    private String studentId;
    private char gender;
    private int age;
    private boolean liveOnCampus;
    private double balance;

    /**
     *Default constructor for student that initializes the student balance at
     *0.0.
     */
    public Student() {
        balance = 0.0;
    }

    /**
     *
     * @param fName, the student's first name
     * @param ID, the student's id number as a String
     * @param studentGender, the student's gender as a char
     * @param studentAge, the student's age
     * @param isLiveOnCampus, boolean value for whether the student lives on
     *  campus or not
     */
    public Student(String fName, String ID, char studentGender, int studentAge, boolean isLiveOnCampus) {
        firstName = fName;
        studentId = ID;
        gender = studentGender;
        age = studentAge;
        liveOnCampus = isLiveOnCampus;
        balance = 0.0;

    }

    /**
     *  gets the student's first name
     * @return returns the student's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *  gets the student's id number
     * @return returns the student's id number
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     *  gets the student's gender
     * @return returns the student's gender
     */
    public char getGender() {
        return gender;
    }

    /**
     *  gets the student's age
     * @return returns the student's age
     */
    public int getAge() {
        return age;
    }

    /**
     *  gets whether student lives on campus
     * @return returns whether the student lives on campus or not
     */
    public boolean getLiveOnCampus() {
        return liveOnCampus;
    }

    /**
     *  gets the balance of the student's 49er account
     * @return returns the balance in the student's 49er account
     */
    public double getBalance() {
        return balance;
    }

    /**
     *  sets the student's first name
     * @param fName sets the student's first name
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }

    /**
     *  sets the student's id number
     * @param ID set the student's ID number
     */
    public void setStudentId(String ID) {
        studentId = ID;
    }

    /**
     *  sets the student's gender
     * @param studentGender sets the student's gender
     */
    public void setGender(char studentGender) {
        gender = studentGender;
    }

    /**
     *  sets the student's age
     * @param studentAge sets the student's age
     */
    public void setAge(int studentAge) {
        age = studentAge;
    }

    /**
     *  sets either true or false for whether the student lives on campus
     * @param isLiveOnCampus sets either true or false for if the student lives 
     *  on campus
     */
    public void setLiveOnCampus(boolean isLiveOnCampus) {
        liveOnCampus = isLiveOnCampus;
    }

    /**
     *  transfers money to the student's 49er account and if the param amount is
     *  negative, it returns an error
     * @param amount the amount of money to be transferred to the student's 49er
     *  balance
     */
    public void transferToCard(double amount) {
        if (amount >= 0) {
            balance = balance + amount;
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("The transfer amount must be greater than 0");
        }
    }

    /**
     *  withdraws money from the student's 49er account and if the param amount 
     *  is greater the amount in the student's account, it prints an error
     *  statement
     * @param amount the amount of money to be withdrawn from the student's 49er
     *  balance
     */
    public void payFromCard(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Sorry, your balance is too low!");
        }
    }
}
