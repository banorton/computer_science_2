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
public class Book extends Item{
    private String author;
    private int numPages;
    public final static int BOOK_MAX = 21;
    public final static double OVERDUE = 0;

    public Book(String title, String author, int numPages){
        super(title);
        this.author = author;
        this.numPages = numPages;
    }

    @Override
    public String checkout(String checkoutDate) {
        String checkoutMonth = checkoutDate.substring(0,2);
        String checkoutDay = checkoutDate.substring(2,4);
        String checkoutYear = checkoutDate.substring(4,8);
        String dueMonth = checkoutMonth;
        String dueDay = Integer.toString(Integer.parseInt(checkoutDay) + Book.BOOK_MAX);
        String dueYear = checkoutYear;
        int monthMax = 0;
        switch (Integer.parseInt(checkoutMonth)){
            case 1:
                monthMax = Item.JAN;
                break;
            case 2:
                monthMax = Item.FEB;
                break;
            case 3:
                monthMax = Item.MAR;
                break;
            case 4:
                monthMax = Item.APR;
                break;
            case 5:
                monthMax = Item.MAY;
                break;
            case 6:
                monthMax = Item.JUN;
                break;
            case 7:
                monthMax = Item.JUL;
                break;
            case 8:
                monthMax = Item.AUG;
                break;
            case 9:
                monthMax = Item.SEP;
                break;
            case 10:
                monthMax = Item.OCT;
                break;
            case 11:
                monthMax = Item.NOV;
                break;
            case 12:
                monthMax = Item.DEC;
                break;
        }
        if (Integer.parseInt(dueDay) > monthMax){
            dueMonth = Integer.toString(Integer.parseInt(dueMonth) + 1);
            dueDay = Integer.toString(Integer.parseInt(dueDay)-monthMax);
            if (Integer.parseInt(dueMonth)>12){
                dueMonth = "01";
                dueYear = Integer.toString(Integer.parseInt(dueYear) + 1);
            }
        }
        if (dueMonth.length() == 1){
            dueMonth = "0" + dueMonth;
        }
        this.setDueDate(dueMonth + dueDay + dueYear);
        this.setAvailable(false);
        return this.getDueDate();
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        String info = "ID: " + this.getId() + ", Title: " + this.getTitle() + ", Author: " + this.author + ", Pages: " + this.numPages + ", Available: " + this.getAvailable();
        return info;
    }

}