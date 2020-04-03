
import java.util.Random;
import java.util.Scanner;

public class lab3lottery {

    public static void main(String[] args) {
        displayRules();

        int[] winNums = generateWinningNumbers();
        for (int i = 0; i < 5; i++) {
            System.out.print(winNums[i] + " ");
        }
        System.out.println();
        System.out.println();
        
        int[] playerNums = getPlayerPicks();
        System.out.println();
        
        System.out.print("Player Numbers: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(playerNums[i] + " ");
        }
        System.out.println();

        System.out.print("Winning Numbers: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(winNums[i] + " ");
        }
        System.out.println();

        int matching = matchNumbers(winNums, playerNums);
        System.out.println("Number of matching digits:" + matching);
        System.out.println();
        
        calculatePrize(matching);
        calculatePrize(winNums,playerNums);
    }

    public static void displayRules() {
        System.out.println("Welcome to the Fantasy Five Lottery.");
        System.out.println("Each player picks 5 numbers between 0-35.");
        System.out.println("Drawings are held Monday through Saturday at 5:00 pm.");
        System.out.println("Best of luck in your game!");
    }

    public static int[] generateWinningNumbers() {
        Random rand = new Random();
        int[] winningNums = {rand.nextInt(36), rand.nextInt(36), rand.nextInt(36), rand.nextInt(36), rand.nextInt(36)};
        return winningNums;
    }

    public static int[] getPlayerPicks() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 numbers from 0-35.");
        int[] playerNums = new int[5];
        for (int i = 0; i < 5; i++) {
            int enteredNum = scan.nextInt();
            if (enteredNum > 35 || enteredNum < 0) {
                System.out.println("Entered numbers must be in the range 0-35");
                i = i - 1;
            } else {
                playerNums[i] = enteredNum;
            }
        }
        return playerNums;
    }

    public static int matchNumbers(int[] winNum, int[] playNum) {
        int numSame = 0;
        for (int i = 0; i < 5; i++) {
            if (winNum[i] == playNum[i]) {
                numSame++;
            }
        }
        return numSame;
    }
    
    public static void calculatePrize(int numMatch) {
       String prize = null;
       switch (numMatch) {
           case 0: prize = "You Lost."; break;
           case 1: prize = "You Lost."; break;
           case 2: prize = "Congratulations! You won $10!"; break;
           case 3: prize = "Congratulations! You won $50!"; break;
           case 4: prize = "Congratulations! You won $250!"; break;
           case 5: prize = "Congratulations! Jackpot!"; break;
       }
        System.out.println(prize);
    }
    
    public static void calculatePrize(int[] nums1, int[] nums2) {
       String prize = null;
       int numMatch = matchNumbers(nums1, nums2);
       switch (numMatch) {
           case 0: prize = "You Lost."; break;
           case 1: prize = "You Lost."; break;
           case 2: prize = "Congratulations! You won $10!"; break;
           case 3: prize = "Congratulations! You won $50!"; break;
           case 4: prize = "Congratulations! You won $250!"; break;
           case 5: prize = "Congratulations! Jackpot!"; break;
       }
        System.out.println(prize);
    }

}
