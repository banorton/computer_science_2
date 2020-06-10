/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nortonbrandonfinalexam;
import java.util.ArrayList;
import java.lang.*;

/**
 *
 * @author brandon
 */
public class Library {
    private ArrayList<Item> collection = new ArrayList<>();

    public Library() {
    }

    public boolean addItem(Item item){
        collection.add(item);
        return true;
    }

    public boolean removeItem(int id){
        collection.remove(id-1001);
        return true;
    }

    public String checkoutItem(int id, String checkoutDate){
        String dueDate = collection.get(id-1001).checkout(checkoutDate);
        return dueDate;
    }

    public String returnItem(int id, String returnDate){
        String dueDate = collection.get(id-1001).getDueDate();
        int dueMonth = Integer.parseInt(dueDate.substring(0,2));
        int dueDay = Integer.parseInt(dueDate.substring(2,4));
        int dueYear = Integer.parseInt(dueDate.substring(4,8));

        int returnMonth = Integer.parseInt(returnDate.substring(0,2));
        int returnDay = Integer.parseInt(returnDate.substring(2,4));
        int returnYear = Integer.parseInt(returnDate.substring(4,8));
        
        int dueDays = dueYear * 365 + dueDay;
        int returnDays = returnYear * 365 + returnDay;
        int i = dueMonth;
        while (i>0){
            switch (i){
            case 1:
                dueDays += Item.JAN;
                break;
            case 2:
                dueDays += Item.FEB;
                break;
            case 3:
                dueDays += Item.MAR;
                break;
            case 4:
                dueDays += Item.APR;
                break;
            case 5:
                dueDays += Item.MAY;
                break;
            case 6:
                dueDays += Item.JUN;
                break;
            case 7:
                dueDays += Item.JUL;
                break;
            case 8:
                dueDays += Item.AUG;
                break;
            case 9:
                dueDays += Item.SEP;
                break;
            case 10:
                dueDays += Item.OCT;
                break;
            case 11:
                dueDays += Item.NOV;
                break;
            case 12:
                dueDays += Item.DEC;
                break;
            }
            i -= 1;
        }
        i = returnMonth;
        while (i>0){
            switch (i){
            case 1:
                returnDays += Item.JAN;
                break;
            case 2:
                returnDays += Item.FEB;
                break;
            case 3:
                returnDays += Item.MAR;
                break;
            case 4:
                returnDays += Item.APR;
                break;
            case 5:
                returnDays += Item.MAY;
                break;
            case 6:
                returnDays += Item.JUN;
                break;
            case 7:
                returnDays += Item.JUL;
                break;
            case 8:
                returnDays += Item.AUG;
                break;
            case 9:
                returnDays += Item.SEP;
                break;
            case 10:
                returnDays += Item.OCT;
                break;
            case 11:
                returnDays += Item.NOV;
                break;
            case 12:
                returnDays += Item.DEC;
                break;
            }
            i -= 1;
        }

        if (returnDays <= dueDays){
            return "Item returned.";
        } else if (returnDays > dueDays){
            int daysOver = returnDays - dueDays;
            double amount = (daysOver * Item.LATE_FEE);
            if (collection.get(id-1001) instanceof Book){
                amount += Book.OVERDUE;
                collection.get(id-1001).setAvailable(true);
                collection.get(id-1001).setDueDate(null);
                return "Book overdue. \nAmount Due: $" + amount;
            }
            if (collection.get(id-1001) instanceof Cd){
                amount += Cd.OVERDUE;
                collection.get(id-1001).setAvailable(true);
                collection.get(id-1001).setDueDate(null);
                return "CD overdue. \nAmount Due: $" + amount;
            }
            if (collection.get(id-1001) instanceof Dvd){
                amount += Dvd.OVERDUE;
                collection.get(id-1001).setAvailable(true);
                collection.get(id-1001).setDueDate(null);
                return "DVD overdue. \nAmount Due: $" + amount;
            }
        }
        return "Error";
    }

    public String searchItem(String phrase){
        ArrayList<String> matchTitles = new ArrayList<String>();
        ArrayList<Integer> matchIds = new ArrayList<Integer>();
        String matches = "";
        for (Item item : collection){
            if (item.getTitle().toLowerCase().contains(phrase.toLowerCase())){
                matchTitles.add(item.getTitle());
                matchIds.add(item.getId());
            }
        }
        for (int i = 0; i<=matchTitles.size()-1; i++){
            matches += "ID: " + matchIds.get(i) + ", Title: " + matchTitles.get(i) + "\n";
        }
        return matches;
    }

    public Item getItem(int id){
        return collection.get(id-1001);
    }
}