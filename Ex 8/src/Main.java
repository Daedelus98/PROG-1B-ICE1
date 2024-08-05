import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Array to hold 10 doubles
        double[] numbers = new double[10];

        // Prompt user to enter 10 doubles
        System.out.print("Enter 10 double values: \n");

        // Assign input to array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Invoke method to calculate average
        double averageValue = average(numbers);

        // Display the average value
        System.out.println("The average is: " + averageValue);
    }

    // Method to calculate the average of an integer array
    public static int average(int[] integerArray) {
        int sum = 0;
        for (int num : integerArray) {
            sum += num; // Sum all elements
        }
        return (integerArray.length == 0) ? 0 : sum / integerArray.length; // Return average
    }

    // Method to calculate the average of a double array
    public static double average(double[] doubleArray) {
        double sum = 0.0;
        for (double num : doubleArray) {
            sum += num; // Sum all elements
        }
        return (doubleArray.length == 0) ? 0.0 : sum / doubleArray.length; // Return average
    }
}