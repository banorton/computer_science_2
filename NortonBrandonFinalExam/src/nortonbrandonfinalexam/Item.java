/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nortonbrandonfinalexam;

/**
 *
 * @author brandon
 */
public abstract class Item {
    private int id;
    private static int nextId = 1001;
    private String title;
    private String dueDate = null;
    private boolean available = true;
    public final static double LATE_FEE = 0.50;

    public final static int JAN = 31, MAR = 31, MAY = 31, JUL = 31, AUG = 31, OCT = 31, DEC = 31;
    public final static int APR = 30, JUN = 30, SEP = 30, NOV = 30;
    public final static int FEB = 28;

    public Item(String title) {
    this.id = nextId;
    this.title = title;
    nextId += 1;
    }

    public int getId(){
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }

    public String getDueDate(){
        return this.dueDate;
    }

    public boolean getAvailable(){
        return this.available;
    }

    public boolean setTitle(String newTitle){
        this.title = newTitle;
        return true;
    }

    public boolean setDueDate(String dueDate){
        this.dueDate = dueDate;
        return true;
    }

    public boolean setAvailable(boolean tf){
        this.available = tf;
        return true;
    }
  
    public String checkout(String checkoutDate) {
        this.setAvailable(false);
        return this.dueDate;
    }
}