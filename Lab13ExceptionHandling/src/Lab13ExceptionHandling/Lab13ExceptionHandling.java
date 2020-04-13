/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab13ExceptionHandling;

import java.io.*;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;

/**
 *
 * @author lcao2
 */
public class Lab13ExceptionHandling {

    public static void main(String[] args) {
        int[] arr = {0,10,20,30};
        int divisor = 10;
        for (int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]/divisor);
        }
    }
        
    public static void getMessage() {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a message");
        try{
            String line = keyboard.readLine();
            System.out.println("You entered: " + line);
        }catch(IOException e){
        System.out.println("There is an IOException");
        }
    }

    public static int getInteger() {
        int input = 0;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer");
        try{
            input = Integer.valueOf(keyboard.readLine());
        }catch(IOException e){
            System.out.println("There is an IOException");
        }
        return input;
    }

    
}
