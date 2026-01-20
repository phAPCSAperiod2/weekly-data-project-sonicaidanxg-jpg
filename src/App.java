import java.util.Scanner;

/**
 * Instructions:
 * - Complete the WeeklyData.java class first.
 * - Use this App class to collect user input and test your WeeklyData methods.
 * - Follow all TODOs carefully.
 * - Do NOT hard-code values — use loops and method calls.
 */
public class App {

    public static void main(String[] args) {

        // -------------------------------------------------------------
        // TODO 1: Create a Scanner for user input
        // -------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        // -------------------------------------------------------------
        // TODO 2: Give information about your program
        //         Ask the user about their goals (if applicable)
        // -------------------------------------------------------------
        System.out.println("Welcome to the Weekly Sleep Tracker!");
        System.out.print("What is your target number of sleep hours per night? ");
        double targetSleep = scanner.nextDouble();

        // -------------------------------------------------------------
        // TODO 3: Create an array to hold 7 days of data
        //         Use an appropriate data type (int or double)
        //         Name the array weekData
        // -------------------------------------------------------------
        double[] weekData = new double[7];


        // -------------------------------------------------------------
        // TODO 4: Use a for loop to collect data for each day of the week
        //         Prompt example:
        //         "Enter <data type> for day X: "
        //
        //         Include input validation:
        //         - Use a while loop to prevent negative values
        //         - Re-prompt if the value is invalid
        // -------------------------------------------------------------
        for (int i = 0; i < weekData.length; i++) {
            double input;
            do {
                System.out.print("Enter hours of sleep for day " + (i + 1) + ": ");
                input = scanner.nextDouble();
                if (input < 0) {
                    System.out.println("Invalid input. Please enter a non-negative value.");
                }
            } while (input < 0);
            weekData[i] = input;
        }

        // -------------------------------------------------------------
        // TODO 5: Create a WeeklyData object
        //         Pass the weekData array into the constructor
        // -------------------------------------------------------------
        WeeklyData sleepData = new WeeklyData(weekData);

        // -------------------------------------------------------------
        // TODO 6: Display the results of the analysis
        //         Call methods from WeeklyData to display:
        //         - Total
        //         - Average
        //         - Minimum
        //         - Maximum
        //
        //         Use clear labels and formatted output if needed
        // -------------------------------------------------------------
        System.out.printf("Total sleep hours: %.2f%n", sleepData.getTotal());
        System.out.printf("Average sleep hours: %.2f%n", sleepData.getAverage());
        System.out.printf("Minimum sleep hours: %.2f%n", sleepData.getMinimum());
        System.out.printf("Maximum sleep hours: %.2f%n", sleepData.getMaximum());

        // -------------------------------------------------------------
        // TODO 7: Display the full week of data
        //         Use the toString() method from WeeklyData
        // -------------------------------------------------------------
        System.out.println("Weekly Sleep Data: " + sleepData.toString());

        // -------------------------------------------------------------
        // TODO 8: Give the user insights about their week
        //         --> "You need to drink more water next week!"
        //         --> "You were very hydrated this week!"
        //         --> etc.
        // -------------------------------------------------------------
        if (sleepData.getAverage() < targetSleep) {
            System.out.println("You need to get more sleep next week!");
        } else {
            System.out.println("Great job meeting your sleep goals this week!");
        }

    }
}
