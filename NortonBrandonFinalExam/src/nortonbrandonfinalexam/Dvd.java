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
public class Dvd extends Item{
    private String director;
    private int duration;
    public final static int DVD_MAX = 7;
    public final static double OVERDUE = 5.0;
    
    public Dvd(String title, String director, int duration) {
        super(title);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public String checkout(String checkoutDate) {
        String checkoutMonth = checkoutDate.substring(0,2);
        String checkoutDay = checkoutDate.substring(2,4);
        String checkoutYear = checkoutDate.substring(4,8);
        String dueMonth = checkoutMonth;
        String dueDay = Integer.toString(Integer.parseInt(checkoutDay) + Dvd.DVD_MAX);
        String dueYear = checkoutYear;
        if (Integer.parseInt(dueDay) > 31){
            dueMonth = Integer.toString(Integer.parseInt(dueMonth) + 1);
            dueDay = Integer.toString(Integer.parseInt(dueDay)-31);
            if (Integer.parseInt(dueMonth)>12){
                dueMonth = "01";
                dueYear = Integer.toString(Integer.parseInt(dueYear) + 1);
            }
        }
        if (dueMonth.length() == 1){
            dueMonth = "0" + dueMonth;
        }
        if (dueDay.length() == 1){
            dueDay = "0" + dueDay;
        }
        this.setDueDate(dueMonth + dueDay + dueYear);
        this.setAvailable(false);
        return this.getDueDate();
    }

    @Override
    public String toString() {
        String info = "Title: " + this.getTitle() + ", Director: " + this.director + ", Duration: " + this.duration  + ", Available: " + this.getAvailable();
        return info;
    }
}