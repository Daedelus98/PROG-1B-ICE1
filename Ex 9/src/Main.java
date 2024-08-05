import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to hold 10 numbers
        double[] numbers = new double[10];

        //Prompt user entry
        System.out.println("Enter 10 numbers:");

        // Assign input to array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find the smallest element
        double minValue = min(numbers);

        // Display the smallest element
        System.out.println("The smallest element is: " + minValue);
    }

    // Method to find the smallest element in a double array
    public static double min(double[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            throw new IllegalArgumentException("Input must not be null or empty.");
        }

        double min = inputArray[0]; // Assume the first element is the smallest
        for (double value : inputArray) {
            if (value < min) {
                min = value; // Update min if a new smallest element is found
            }
        }
        return min;
    }
}