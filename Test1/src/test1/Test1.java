/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author banor
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] intArray = {3,5,11,4,8};
//        int[] intArray = {3};
        System.out.println(minDiff(intArray));
    }

    public static int minDiff(int[] intArray) {
        if (intArray.length < 2) {
            return 0;
        }
        int minDiff = intArray[1] - intArray[0];
        for (int i = 0; i < intArray.length - 1; i++) {
            int diff = intArray[i + 1] - intArray[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }

}
