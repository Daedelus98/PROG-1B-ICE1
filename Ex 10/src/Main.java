import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to hold 10 numbers
        int[] numbers = new int[10];

        //Prompt user entry
        System.out.println("Enter 10 numbers:");

        // Assign input to array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find the index of the smallest element
        int index = indexOfSmallestElement(numbers);

        // Display the index of the smallest element
        System.out.println("The index of the smallest element is: " + index);
    }

    // Method to find the index of the smallest element in an int array
    public static int indexOfSmallestElement(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            throw new IllegalArgumentException("Input must not be null or empty.");
        }

        int smallestIndex = 0; // Assume the first element is the smallest initially
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < inputArray[smallestIndex]) {
                smallestIndex = i; // Update the index if a new smallest element is found
            }
        }
        return smallestIndex;
    }
}
