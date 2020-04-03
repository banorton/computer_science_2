package exercise2;

import java.util.Random;

public class Exercise2 {

    public static void main(String[] args) {
        flipCoin(20, 10);
        flipThreeHeads(20);
        flipThreeConsecutiveHeads(20);
    }

    public static String flipCoin(int seedNum, int numFlips) {
        System.out.print("Method: flipCoin,");
        System.out.println("    # of Flips: " + numFlips);
        int randNum;
        String flips = "";
        Random rand = new Random(seedNum);
        for (int i = 0; i < numFlips; i++) {
            randNum = rand.nextInt(2);
            if (randNum == 0) {
                flips = flips + "T";
            } else {
                flips = flips + "H";
            }
        }
        System.out.println(flips);
        System.out.println();
        System.out.println();
        return flips;
    }

    public static String flipThreeHeads(int seedNum) {
        System.out.print("Method: flipThreeHeads,");
        int randNum;
        String flips = "";
        int headCount = 0;
        int numFlips = 0;
        Random rand = new Random(seedNum);
        while (headCount < 3) {
            randNum = rand.nextInt(2);
            if (randNum == 0) {
                flips = flips + "T";
            }
            if (randNum == 1) {
                flips = flips + "H";
                headCount++;
            }
            numFlips++;
        }
        System.out.println("    # of Flips: " + numFlips);
        System.out.println(flips);
        System.out.println();
        System.out.println();
        return flips;
    }

    public static String flipThreeConsecutiveHeads(int seedNum) {
        System.out.print("Method: flipThreeConsecutiveHeads,");
        int randNum;
        String flips = "";
        int headCount = 0;
        int numFlips = 0;
        Random rand = new Random(seedNum);
        while (headCount < 3) {
            randNum = rand.nextInt(2);
            if (randNum == 0) {
                flips = flips + "T";
                headCount = 0;
            }
            if (randNum == 1) {
                flips = flips + "H";
                headCount++;
            }
            numFlips++;
        }
        System.out.println("    # of Flips: " + numFlips);
        System.out.println(flips);
        System.out.println();
        System.out.println();
        return flips;
    }
}
