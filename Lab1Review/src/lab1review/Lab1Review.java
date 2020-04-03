package lab1review;

import java.util.Arrays;

public class Lab1Review {

    public static void main(String[] args) {
        int[] a = {12, 7, -1, 25, 3, 9};
        int[] b = {-4, -5, -3, -6};
        int[] c = {5, 5, 5, 5};
        int[] d = {42};
//        System.out.println(maxElement(a));
//        System.out.println(maxElement(b));
//        System.out.println(maxElement(c));
//        System.out.println(maxElement(d));
//        System.out.println(lastIndexOf(c, 5));
//        System.out.println(lastIndexOf(a, 5));
//        zeroNegativeElements(a);
//        zeroNegativeElements(b);
//        zeroNegativeElements(c);
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
//        System.out.println(Arrays.toString(c));
//        System.out.println(Arrays.toString(repeatAllElements(a)));
//        System.out.println(Arrays.toString(repeatAllElements(b)));
//        System.out.println(Arrays.toString(repeatAllElements(c)));
//        System.out.println(Arrays.toString(reverseArray(a)));
//        System.out.println(Arrays.toString(reverseArray(b)));
//        System.out.println(Arrays.toString(reverseArray(c)));
        System.out.println((equals(a, a)));
        System.out.println((equals(b, c)));
        System.out.println((equals(c, d)));
    }

    public static int maxElement(int[] nums) {
        int maxElement = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxElement) {
                maxElement = nums[i];
            }
        }
        return maxElement;
    }

    public static int lastIndexOf(int[] nums, int value) {
        int lastIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static void zeroNegativeElements(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }
        }
    }

    public static int[] repeatAllElements(int[] nums) {
        int[] numsDouble = new int[nums.length * 2];
        for (int a = 0, b = 0; b < nums.length; a = a + 2, b++) {
            numsDouble[a] = nums[b];
            numsDouble[a + 1] = nums[b];
        }
        return numsDouble;
    }

    public static int[] reverseArray(int[] nums) {
        int[] numsReverse = new int[nums.length];
        for (int a = 0, b = nums.length - 1; a < nums.length; a++, b--) {
            numsReverse[a] = nums[b];
        }
        return numsReverse;
    }

    public static boolean equals(int[] nums1, int[] nums2) {
        boolean numsEqual = true;
        if (nums1.length != nums2.length) {
            numsEqual = false;
            return numsEqual;
        } else {
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i] != nums2[i]) {
                    numsEqual = false;
                    return numsEqual;
                }
            }
            return numsEqual;
        }
    }
}
