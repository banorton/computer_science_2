/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import java.util.ArrayList;

/**
 *
 * @author lcao2
 */
public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("test");
        arrList.add("testeven");
        arrList.add("testodd");
        mirrorStrings(arrList);
        System.out.println((arrList));
    }

    public static int findMaxLength(ArrayList<String> arrList) {
        int maxLength = 0;

        if (arrList.isEmpty()) {
            return 0;
        }

        for (String str : arrList) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }

        return maxLength;
    }

    public static String findLongestString(ArrayList<String> arrList) {
        String longestString = "";

        if (arrList.isEmpty()) {
            return "";
        }

        for (String str : arrList) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }

        return longestString;
    }

    public static void removeOddLength(ArrayList<String> arrList) {
        ArrayList<Integer> oddIndicies = new ArrayList<>();
        for (int i = 0; i < arrList.size(); i++) {
            if ((arrList.get(i)).length() % 2 == 1) {
                oddIndicies.add(i);
            }
        }
        for (int i : oddIndicies) {
            arrList.remove(i);
            for (int j = 0; j < oddIndicies.size(); j++) {
                oddIndicies.set(j, (oddIndicies.get(j) - 1));
            }
        }
    }

    public static void mirrorStrings(ArrayList<String> arrList) {
        for (int i = arrList.size()-1; i >= 0; i--) {
            arrList.add(arrList.get(i));
        }
    }

//    public static void removeOddLength(ArrayList<String> arrList) {
//        boolean hasOdd = true;
//        while (hasOdd) {
//            for (String str : arrList) {
//                if (str.length() % 2 == 1) {
//                    arrList.remove(str);
//                } else {
//                    hasOdd = false;
//                }
//            }
//        }
//    }
}
