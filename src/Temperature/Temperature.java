/**
 * The class is a temperature conversion between Fahrenheit (°F) / Kelvin (°K) / Celsius (°C)
 * A temperature variable is saved
 * Class has Getter & Setter
 * and will return the converted temperature with getCelsius, getKelvin
 *
 * @author SOLAN Tao & KOCOGLU Lucas
 * @version N/A
 * @since 2023-08-30
 */

package Temperature;

public class Temperature {
    private double ftemp = 0; // Temperature of the instance

    /**
     * Constructor of Temperature with 0 parameters
     * ftemp is initialized (by default) to 0.
     */
    public Temperature() {
    }

    /**
     * Constructor of Temperature with 1 parameters
     * ftemp is initialized by the given parameters
     * @param ftemp set the temperature of the instance
     */
    public Temperature(double ftemp) {
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
     * Function getCelsius
     * Convert the temperature saved in the instance (°F) into Celsius degree (°C)
     * with the following operationn :
     *      (5.0/9.0) * (T - 32);
     * @return (double) temperature in Celsius
     */
    public double getCelsius() {
        return (5.0/9.0) * (this.ftemp - 32);
    }

    /**
     * Function getCelsius
     * Convert the temperature saved in the instance (°F) into Kelvin degree (°K)
     * with the following operationn :
     *      (5.0/9.0) * (T - 32) + 273;
     * The function first grab the temperature from the function getCelsius before converting it in Kelvin
     * @return (double) temperature in Kelvin
     */
    public double getKelvin() {
        return this.getCelsius() + 273;
    }

    /**
     * Function toString
     * Return converted temperatures
     * -----------------------------
     * {ftemp} °F equals to :
     * >	{getCelsius()}°C (Celsius)
     * >	{getKelvin()}°K (Kelvin)
     * -----------------------------
     * @return String ready to be printed
     */
    @Override
    public String toString() {
        return "-----------------------------"
                + "\n" + this.getFahrenheit() + " °F equals to : "
                + "\n>\t" + this.getCelsius() + "°C (Celsius)"
                + "\n>\t" + this.getKelvin() + "°K (Kelvin)"
                + "\n-----------------------------";
    }
}
