/**
 * This program is a Coin Toss Simulator.
 * The program create a instance from class Coin, and ask to the user the number of toss.
 * Each toss is displayed to the user.
 * At the end, the program will also show the number of head/tails.
 *
 * @author SOLAN Tao & KOCOGLU Lucas
 * @version N/A
 * @since 2023-08-30
 */
package CoinTossSimulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coin coin = new Coin(); // Creation of instance coin
        Scanner myScan = new Scanner(System.in); // Scanner for the user input

        System.out.println("Give number of toss : ");
        coin.play(myScan.nextInt()); // coin.play() will take in argument the number of times the user want to toss
    }
}
