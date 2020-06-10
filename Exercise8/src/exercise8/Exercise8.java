/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise8;
import java.util.*;
import java.lang.*;
/**
 *
 * @author lcao2
 */
public class Exercise8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack stack = new Stack();
        displayMenu(stack);
        
        
    }
    
    /**
     * Displays a menu of options.
     */
    public static void displayMenu(Stack stack) {
        System.out.println("Select one from the following options:");
        System.out.println("1 - push an element to the stack");
        System.out.println("2 - pop an element from the stack");
        System.out.println("3 - peek the top of the stack");
        System.out.println("4 - print the stack");
        System.out.println("0 - exit the system");

        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();

        switch(option){
        case 1:
            while (true){
                scan.nextLine();
                try {
                    System.out.println("Enter integer value:");
                    int pushInt = scan.nextInt();
                    stack.push(pushInt);
                    System.out.println();
                    displayMenu(stack);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Must be integer.");
                }
            }
            break;
        case 2:
            try {
                stack.pop();
                System.out.println();
                displayMenu(stack);
            } catch(NullPointerException e){
                System.out.println(e.getMessage());
                System.out.println();
                displayMenu(stack);
            }
            break;
        case 3:
            try {
                int topStack = stack.peek();
                System.out.println(topStack);
                System.out.println();
                displayMenu(stack);
            } catch(NullPointerException e){
                System.out.println(e.getMessage());
                System.out.println();
                displayMenu(stack);
            }
            break;
        case 4:
            System.out.println(stack.toString());
            System.out.println();
            displayMenu(stack);
            break;
        case 0:
            break;
        }
    }
    
}
