/**
 * The program is a temperature conversion between Fahrenheit (°F) / Kelvin (°K) / Celsius (°C)
 * The program will ask a temperature in Fahrenheit
 * and will return the following converted temperature
 *
 * @author SOLAN Tao & KOCOGLU Lucas
 * @version N/A
 * @since 2023-08-30
 */

package Temperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in); // Scanner for the user input

        System.out.println("Give temperature (in Fahrenheit / °F) : "); // Ask the user a temperature
        Temperature temp = new Temperature(myScan.nextDouble()); // Create an instance of Temperature with the given temperature

        System.out.println(temp); // Print the converted temperatures
    }
}
