import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user entry
        System.out.print("Enter the number of values in the series: ");
        int inputSize = scanner.nextInt();

        // Create an array to hold the input values
        int[] inputValues = new int[inputSize];

        // Prompt user to enter the values
        System.out.println("Enter " + inputSize + " integers:");
        for (int i = 0; i < inputSize; i++) {
            inputValues[i] = scanner.nextInt();
        }

        // Check for four consecutive numbers with the same value
        boolean result = isConsecutiveFour(inputValues);

        // Display result
        if (result) {
            System.out.println("The series contains four consecutive numbers with the same value.");
        } else {
            System.out.println("The series does not contain four consecutive numbers with the same value.");
        }
    }

    public static boolean isConsecutiveFour(int[] values) {
        // Loop through the array and check for consecutive numbers
        for (int i = 0; i < values.length - 3; i++) {
            if (values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3]) {
                return true; // Found four consecutive numbers with the same value
            }
        }
        return false; // No four consecutive numbers found
    }
}

