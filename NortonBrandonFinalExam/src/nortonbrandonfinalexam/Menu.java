/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nortonbrandonfinalexam;
import java.lang.*;
import java.util.*;

/**
 *
 * @author brandon
 */
public class Menu {
    private Library library = new Library();

    public Menu(){
    }

    public void displayMenu() {
        Scanner scan = new Scanner(System.in);
        boolean tf = true;
        while(tf){
        tf = false;
        System.out.println("1 - Add a new book");
        System.out.println("2 - Add a new CD");
        System.out.println("3 - Add a new DVD");
        System.out.println("4 - Display an item");
        System.out.println("5 - Check out an item");
        System.out.println("6 - Return an item");
        System.out.println("7 - Search for items with a keyword");
        System.out.println("8 - Remove an item");
        System.out.println("9 - Quit the program");
        try {
            int choice = scan.nextInt();
            switch(choice){
                case 1:
                    case1(library);
                    break;
                case 2:
                    case2(library);
                    break;
                case 3:
                    case3(library);
                    break;
                case 4:
                    case4(library);
                    break;
                case 5:
                    case5(library);
                    break;
                case 6:
                    case6(library);
                    break;
                case 7:
                    case7(library);
                    break;
                case 8:
                    case8(library);
                    break;
                case 9:
                    case9(library);
                    break;
                default:
                    System.out.println();
                    System.out.println("Please choose a number between 1 and 9.");
                    this.displayMenu();
            }
        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Error: Please enter an integer between 1 and 9.");
            scan.nextLine();
            System.out.println();
            tf = true;
        } 
        }
    }

    public void case1(Library library) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the book title:");
        String title = scan.nextLine();
        System.out.println("Enter the book author:");
        String author = scan.nextLine();
        int numPages = 0;
        while (true){
            try{
                System.out.println("Enter the number of pages:");
                numPages = scan.nextInt();
                break;
            } catch (InputMismatchException e){
                System.out.println();
                System.out.println("Error: Must input an integer.");
                scan.nextLine();
            }
        }
        Book book = new Book(title,author,numPages);
        boolean added = library.addItem(book);
        if (added){
            System.out.println();
            System.out.println("The book has been added to the library.");
            System.out.println();
            this.displayMenu();
        } else {
            System.out.println();
            System.out.println("Error: Book not added to library.");
            System.out.println();
            this.displayMenu();
        }
    }

    public void case2(Library library) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the CD title:");
        String title = scan.nextLine();
        System.out.println("Enter the CD artist:");
        String artist = scan.nextLine();
        int numTracks = 0;
        while (true){
            try{
                System.out.println("Enter the number of tracks:");
                numTracks = scan.nextInt();
                break;
            } catch (InputMismatchException e){
                System.out.println();
                System.out.println("Error: Must input an integer.");
                scan.nextLine();
            }
        }
        Cd cd = new Cd(title,artist,numTracks);
        boolean added = library.addItem(cd);
        if (added){
            System.out.println();
            System.out.println("The CD has been added to the library.");
            System.out.println();
            this.displayMenu();
        } else {
            System.out.println();
            System.out.println("Error: CD not added to library.");
            System.out.println();
            this.displayMenu();
        }
    }

    public void case3(Library library) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the DVD title:");
        String title = scan.nextLine();
        System.out.println("Enter the DVD director:");
        String director = scan.nextLine();
        int duration = 0;
        while (true){
            try{
                System.out.println("Enter the duration in minutes:");
                duration = scan.nextInt();
                break;
            } catch (InputMismatchException e){
                System.out.println();
                System.out.println("Error: Must input an integer.");
                scan.nextLine();
            }
        }
        Dvd dvd = new Dvd(title,director,duration);
        boolean added = library.addItem(dvd);
        if (added){
            System.out.println();
            System.out.println("The DVD has been added to the library.");
            System.out.println();
            this.displayMenu();
        } else {
            System.out.println();
            System.out.println("Error: DVD not added to library.");
            System.out.println();
            this.displayMenu();
        }
    }

    public void case4(Library library) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        int itemId = 0;
        while(true){
            try{
                System.out.println("Enter the item ID number:");
                itemId = scan.nextInt();
                System.out.println();
                System.out.println(library.getItem(itemId));
                break;
            } catch(InputMismatchException e){
                System.out.println();
                System.out.println("Error: Invalid ID.");
                scan.nextLine();
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Error: ID does not exist.");
            }
        }
        System.out.println();
        this.displayMenu();
    }

    public void case5(Library library) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        int itemId = 0;
        String dueDate = null;
        String checkoutDate = null;
        System.out.println("Enter the item ID number:");
        itemId = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter current date(mmddyyyy):");
        checkoutDate = scan.nextLine();
        dueDate = library.checkoutItem(itemId, checkoutDate);
        System.out.println();
        System.out.println("Item has been checked out.");
        System.out.println("Due Date: " + dueDate);
        System.out.println();
        this.displayMenu();
    }

    public void case6(Library library) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the item ID number:");
        int itemId = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter current date(mmddyyyy):");
        String returnDate = scan.nextLine();
        String dueDate = library.getItem(itemId).getDueDate();
        System.out.println();
        System.out.println(library.returnItem(itemId, returnDate));
        System.out.println();
        this.displayMenu();
    }

    public void case7(Library library) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a word or phrase:");
        String phrase = scan.nextLine();
        System.out.println();
        System.out.println("Matches:");
        System.out.println(library.searchItem(phrase));
        this.displayMenu();
    }

    public void case8(Library library) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the item ID:");
        int itemId = scan.nextInt();
        boolean removed = library.removeItem(itemId);
        if (removed){
            System.out.println();
            System.out.println("The item has been removed from the library.");
            System.out.println();
            this.displayMenu();
        } else {
            System.out.println();
            System.out.println("Error: Item not removed library.");
            System.out.println();
            this.displayMenu();
        }
    }

    public void case9(Library library) {
        System.out.println();
        return;
    }
}