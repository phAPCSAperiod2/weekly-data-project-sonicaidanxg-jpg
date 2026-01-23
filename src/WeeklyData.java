/**
 * The WeeklyData class stores and analyzes a week’s worth of numeric data.
 * This could represent steps taken, hours of sleep, money spent, screen time,
 * or any other measurable daily value.
 * 
 * @author Aidan Manzanares
 * @version 1/23/26
 */

public class WeeklyData {

    // -------------------------------------------------------------
    // Instance Variables
    // -------------------------------------------------------------
    // TODO: Declare a private array to store the week’s data
    //       Choose an appropriate type (double[] or int[])
    //       Create other instance variables as necessary
    
    private double[] data;


    // -------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------
    /**
     * Constructs a WeeklyData object by taking in an array of values
     * and making a deep copy (element-by-element) into the internal array.
     *
     * @param input an array representing 7 days of data
     * @author Aidan Manzanares
     */
    public WeeklyData(double[] input) {
        
        this.data = new double[input.length];

        for (int i = 0; i < input.length; i++) {
        
            this.data[i] = input[i];
        }
        
        this.data = new double[input.length];
        
        for (int i = 0; i < input.length; i++) {
        
            this.data[i] = input[i];
        }
       
    }


    // -------------------------------------------------------------
    // getTotal
    // -------------------------------------------------------------
    /**
     * Calculates and returns the total of all values in the week.
     *
     * @return the sum of all values in the data array
     * @author Aidan Manzanares
     */
    public double getTotal() {
        
        double total = 0.0;
        
        for (double value : data) {
        
            total += value;
        }
        
        return total;
    }


    // -------------------------------------------------------------
    // getAverage
    // -------------------------------------------------------------
    /**
     * Calculates and returns the average value for the week.
     *
     * @return the average of the values in the array,
     *         or 0.0 if the array is empty
     * @author Aidan Manzanares
     */
    public double getAverage() {
        
        if (data.length == 0) {
        
            return 0.0;
        }
      
        return getTotal() / data.length;
    }


    // -------------------------------------------------------------
    // getMax
    // -------------------------------------------------------------
    /**
     * Finds and returns the highest value in the data array.
     *
     * @return the maximum value
     * @author Aidan Manzanares
     */
    public double getMaximum() {
        
        double max = data[0];
        
        for (double value : data) {
      
            if (value > max) {
      
                max = value;
            }
        }
      
        return max;
    }


    // -------------------------------------------------------------
    // getMin
    // -------------------------------------------------------------
    /**
     * Finds and returns the lowest value in the data array.
     *
     * @return the minimum value
     * @author Aidan Manzanares
     */
    public double getMinimum() {
        
        double min = data[0];
       
        for (double value : data) {
      
            if (value < min) {
      
                min = value;
            }
        }
        
        return min;
    }


    // -------------------------------------------------------------
    // toString
    // -------------------------------------------------------------
    /**
     * Returns a formatted, multi-line String showing each day’s data.
     *
     * Example:
     * Day 1: 4500
     * Day 2: 6200
     * Day 3: 5100
     *
     * @return a formatted String representing the week’s data
     * @author Aidan Manzanares
     */
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < data.length; i++) {
            
            sb.append("Day ").append(i + 1).append(": ").append(data[i]).append("\n");
        }
        
        return sb.toString();
    }
}
