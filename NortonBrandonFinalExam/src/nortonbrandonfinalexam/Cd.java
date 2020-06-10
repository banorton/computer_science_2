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
public class Cd extends Item{
    private String artist;
    private int numTracks;
    public final static int CD_MAX = 14;
    public final static double OVERDUE = 2.0;
    
    public Cd(String title, String artist, int numTracks) {
        super(title);
        this.artist = artist;
        this.numTracks = numTracks;
    }

    @Override
    public String checkout(String checkoutDate) {
        String checkoutMonth = checkoutDate.substring(0,2);
        String checkoutDay = checkoutDate.substring(2,4);
        String checkoutYear = checkoutDate.substring(4,8);
        String dueMonth = checkoutMonth;
        String dueDay = Integer.toString(Integer.parseInt(checkoutDay) + Cd.CD_MAX);
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
        this.setDueDate(dueMonth + dueDay + dueYear);
        this.setAvailable(false);
        return this.getDueDate();
    }

    @Override
    public String toString() {
        String info = "Title: " + this.getTitle() + ", Artist: " + this.artist + ", Tracks: " + this.numTracks  + ", Available: " + this.getAvailable();
        return info;
    }

}