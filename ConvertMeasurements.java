public class ConvertMeasurements {

    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot; // conversion factor from feet to meters
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter; // conversion factor from meters to feet
    }

    public static void main(String[] args) {
        // Display the table heading
        System.out.println("Feet     Meters     |     Meters     Feet");
        System.out.println("-------------------------------------------------");

        // Display the table body
        for (int i = 1, j = 20; i <= 10; i++, j += 5) {
            System.out.printf("%4d     %7.3f     |     %4d     %7.3f\n", i, footToMeter(i), j, meterToFoot(j));
        }
    }
}
