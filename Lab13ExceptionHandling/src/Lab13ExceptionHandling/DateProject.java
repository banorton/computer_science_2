/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateproject;

import java.util.*;

/**
 *
 * @author lcao2
 */
public class DateProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month,day,year;
        System.out.println("Enter an integer value for month: ");
        while(true){
            try{
                month = scanner.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println("Invalid input. You must enter an integer.");
                scanner.nextLine();
            }
        }
        System.out.println("Enter an integer value for day: ");
        while(true){
            try{
                day = scanner.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println("Invalid input. You must enter an integer.");
                scanner.nextLine();
            }
        }
        System.out.println("Enter an integer value for year: ");
        while(true){
            try{
                year = scanner.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println("Invalid input. You must enter an integer.");
                scanner.nextLine();
            }
        }
        System.out.println("before");
        try{
            System.out.println("try");
            Date date = new Date(month,day,year);            Date date = new Date(month,day,year);

            System.out.println(date);
        }catch(Exception e){
            System.out.println("catch");
            e.getMessage();
        }
    }
}
