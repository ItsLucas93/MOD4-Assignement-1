/**
 * The class Liquids is an indicator of the boiling/freezing point for 3 substances :
 *      |---------------| Freezing | Boiling |
 *      | Ethyl Alcohol |     -173 |     172 |
 *      | Oxygen        |     -362 |    -306 |
 *      | Water         |       32 |     212 |
 *      |---------------|----------|---------|
 *      *Temperature in Fahrenheit/°F
 * The program save a temperature and give the state (Freezing/Boiling) of each substances (isEthylFreezing, isOxygenFreezing, …)
 *
 * @author SOLAN Tao & KOCOGLU Lucas
 * @version N/A
 * @since 2023-08-30
 */

package FreezingBoilingPoint;

public class Liquids {
    private double ftemp = 0; // Save the temperature

    /**
     * Constructor of Liquids with 0 parameters
     * ftemp is initialized (by default) to 0.
     */
    public Liquids() {
    }

    /**
     * Constructor of Liquids with 1 parameters
     * ftemp is initialized by the given parameters
     * @param ftemp set the temperature of the instance
     */
    public Liquids(double ftemp) {
        this.ftemp = ftemp;
    }

    /**
     * Setter of the private variable ftemp
     * @param ftemp set the temperature of the instance
     */
    public void setFahrenheit(double ftemp) {
        this.ftemp = ftemp;
    }

    /**
     * Getter of the private variable ftemp
     * @return (int) give the temperature of the instance
     */
    public double getFahrenheit() {
        return this.ftemp;
    }

    /**
     * Function isEthylFreezing
     * Indicate if the Ethyl Alcohol is Freezing
     * @return (boolean) statement isEthylFreezing
     */
    public boolean isEthylFreezing() {
        return this.ftemp < -172;
    }

    /**
     * Function isOxygenFreezing
     * Indicate if the Oxygen is Freezing
     * @return (boolean) statement isOxygenFreezing
     */
    public boolean isOxygenFreezing() {
        return this.ftemp < -361;
    }

    /**
     * Function isWaterFreezing
     * Indicate if the Water is Freezing
     * @return (boolean) statement isWaterFreezing
     */
    public boolean isWaterFreezing() {
        return this.ftemp < 33;
    }

    /**
     * Function isEthylBoiling
     * Indicate if the Ethyl Alcohol is Boiling
     * @return (boolean) statement isEthylBoiling
     */
    public boolean isEthylBoiling() {
        return this.ftemp > 171;
    }

    /**
     * Function isOxygenBoiling
     * Indicate if the Oxygen is Boiling
     * @return (boolean) statement isOxygenBoiling
     */
    public boolean isOxygenBoiling() {
        return this.ftemp > -305;
    }

    /**
     * Function isWaterBoiling
     * Indicate if the Water is Boiling
     * @return (boolean) statement isWaterBoiling
     */
    public boolean isWaterBoiling() {
        return this.ftemp > 211;
    }

    /**
     * Function toString
     * Return the state of all substances
     * ----------------------------------------------------------
     * The following liquids will boil or freeze at {ftemp} Fahrenheit.
     * >	Ethyl Alcohol : 	Freezing/Boiling/None
     * >	Oxygen : 			Freezing/Boiling/None
     * >	Water : 			Freezing/Boiling/None
     * ----------------------------------------------------------
     * @return String to be printed
     */
    @Override
    public String toString() {
        // Header of the text
        String value = "----------------------------------------------------------\n" +
                "The following liquids will boil or freeze at " + this.ftemp + " Fahrenheit.";

        // Ethyl Alcohol status
        value += "\n>\tEthyl Alcohol : ";
        if (isEthylFreezing()) {
            value += "\tFreezing";
        } else if (isEthylBoiling()) {
            value += "\tBoiling";
        } else {
            value += "\tNone";
        }

        // Oxygen status
        value += "\n>\tOxygen : ";
        if (isOxygenFreezing()) {
            value += "\t\t\tFreezing";
        } else if (isOxygenBoiling()) {
            value += "\t\t\tBoiling";
        } else {
            value += "\t\t\tNone";
        }

        // Water status
        value += "\n>\tWater : ";
        if (isWaterFreezing()) {
            value += "\t\t\tFreezing";
        } else if (isWaterBoiling()) {
            value += "\t\t\tBoiling";
        } else {
            value += "\t\t\tNone";
        }
        value += "\n----------------------------------------------------------";
        return value;
    }
}
