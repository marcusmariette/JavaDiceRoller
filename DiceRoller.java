// Dice Roller Java Source Code
// SWE20001 - Tuesday 2:30 Lab - Team 04

import java.util.Random;
import java.util.Scanner;

// Dice Roller Class
public class DiceRoller {
    // A 3x3 Matrix of integers allows us to represent each of 9 sided dice face.
    int[][][] faceConfig = {
        { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } },
        { { 0, 0, 1 }, { 0, 0, 0 }, { 1, 0, 0 } },
        { { 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } },
        { { 1, 0, 1 }, { 0, 0, 0 }, { 1, 0, 1 } },
        { { 1, 0, 1 }, { 0, 1, 0 }, { 1, 0, 1 } },
        { { 1, 0, 1 }, { 1, 0, 1 }, { 1, 0, 1 } },
        { { 1, 0, 1 }, { 1, 1, 1 }, { 1, 0, 1 } },
        { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } },
        { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } }
    };

    // Main Function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DiceRoller dealerDice = new DiceRoller();
        DiceRoller playerDice = new DiceRoller();
        // Welcome Player
        System.out.println("Welcome to the Casino!");
        // Until user specifies they want to exit the program
        while (true) {
            // Dealer Rolls
            System.out.println("Dealer Rolling the Dice...");
            int dealerScore = dealerDice.roll();
            dealerDice.draw(dealerScore);
            System.out.println("Dealer's Dice Value: " + dealerScore);

            // Implement User choice of Higher or Lower
            // MC

            // Player Rolls
            System.out.println("Dealer Rolling the Dice...");
            int playerScore = playerDice.roll();
            dealerDice.draw(dealerScore);
            System.out.println("Dealer's Dice Value: " + playerScore);

            // Implement User Choice checked against dice values
            // AT

            // Output Text
            // AT
            if (player wins) {
                System.out.println("You Win!");
            } else if (player loses) {
                System.out.println("You Lose!");
            }
            
            // Roll Again Options
            System.out.println("Press [Enter] to Play Again.");
            System.out.println("Otherwise, Type 'No' to Exit: ");

            // Checks for user "No" input.
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("n") ||
                    input.equalsIgnoreCase("no")) {
                System.out.println("Exiting Program.");
                scanner.close();
                return;
            }
        }
    }

    // Draw the dice face using ASCII values and referring the our 3x3 matrix
    private void draw(int value) {
        int[][] displayVal = faceConfig[value - 1];
        System.out.println("-------");

        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                if (displayVal[i][j] == 1) {
                    System.out.print("o");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" |");
        }
        System.out.println("-------");

    }

    // Roll the dice in Java
    private int roll() {
        Random r = new Random();
        return r.nextInt(9) + 1;
    }
}
