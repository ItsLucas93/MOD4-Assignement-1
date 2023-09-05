/**
 * This class Coin is used to generate a toss.
 * It determines the result of a toss, between heads and tails.
 *
 * @author SOLAN Tao & KOCOGLU Lucas
 * @version N/A
 * @since 2023-08-30
 */

package CoinTossSimulator;

import java.util.Random;

public class Coin {
    private String sideUp; // String that will save the side up of the coin.
    Random rand = new Random(); // Instance of Random. Will be used for choosing between heads and tails.

    /**
     * Constructor of the class Coin
     * Will launch the function toss to define the side up of the coin
     */
    public Coin() {
        this.toss();
    }

    /**
     * Function toss
     * Will choose randomly between :
     *     - 1 (heads)
     *     - 0 (tails)
     * and save the associated state to the sideUp variable.
     */
    public void toss() {
        if (rand.nextInt(2) == 1) { // Random between [0, 1]
            this.sideUp = "heads"; // if 1, the coin is heads up
        } else {
            this.sideUp = "tails"; // if 0, the coin is tails up
        }
    }

    /**
     * Function getSideUp
     * Getter of the private variable sideUp
     * @return the side of the coin which is up right now
     */
    public String getSideUp() {
        return this.sideUp;
    }

    /**
     * Function play
     * Main function of the class Coin
     * Will do a series of tossing determinate by the player
     * Each round, it will show the player the face of the coin that is up
     * Each round, the face of the coin that is up will be save in hCount(headsCount)/tCount(tailsCount)
     * At the end of the series, it will display the number of heads/tails
     * @param round Number of round the coin will be tossed.
     */
    public void play(int round) {
        // Count the number of heads/tails in the series
        int hCount = 0, tCount = 0;

        for (int i = 0; i < round; i++) {
            // Tossing the coin
            this.toss();

            // Save the state of the coin
            if (this.getSideUp().equalsIgnoreCase("heads")) {
                hCount++;
            } else {
                tCount++;
            }

            // Print the side up of the coin for the round
            System.out.println(this.getSideUp());
        }
        // Print the result of the series
        System.out.println("There was " + hCount + " heads and " + tCount + " tails.");
    }
}
