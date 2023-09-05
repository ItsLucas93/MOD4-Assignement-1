/**
 * The program is an indicator of the boiling/freezing point for 3 substances :
 *      |---------------| Freezing | Boiling |
 *      | Ethyl Alcohol |     -173 |     172 |
 *      | Oxygen        |     -362 |    -306 |
 *      | Water         |       32 |     212 |
 *      |---------------|----------|---------|
 *      *Temperature in Fahrenheit/°F
 * The program create an instance of Liguids, and ask the temperature to the user
 * Following the temperature given by the user, the program will display the state of theses 3 substances (Freezing/Boiling)
 *
 * @author SOLAN Tao & KOCOGLU Lucas
 * @version N/A
 * @since 2023-08-30
 */

package FreezingBoilingPoint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Liquids temp = new Liquids(); // Creation of instance Liquids
        Scanner myScan = new Scanner(System.in); // Scanner for the user input

        System.out.println("Give temperature (in Fahrenheit / °F) : "); // Ask the user a temperature
        temp.setFahrenheit(myScan.nextDouble()); // Set the temperature into the instance

        System.out.println(temp); // Print the states of theses 3 substances
    }
}
