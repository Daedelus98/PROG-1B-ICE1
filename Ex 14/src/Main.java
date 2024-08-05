import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store ten integers
        int[] list = new int[10];

        // Read ten integers from the user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        // Eliminate duplicates
        int[] uniqueArray = eliminateDuplicates(list);

        // Display the result
        System.out.println("Array after eliminating duplicates:");
        for (int value : uniqueArray) {
            System.out.print(value + " ");
        }
    }
    
    // Method to eliminate duplicates from the array
    public static int[] eliminateDuplicates(int[] list) {
        // First, sort the array
        Arrays.sort(list);

        // Create a temporary array to hold unique values
        int[] tempArray = new int[list.length];
        int uniqueCount = 0;

        // Iterate through the sorted array and collect unique values
        for (int i = 0; i < list.length; i++) {
            // If it's the first element or different from the previous element, add to tempArray
            if (i == 0 || list[i] != list[i - 1]) {
                tempArray[uniqueCount++] = list[i];
            }
        }

        // Copy the unique values to a new array with the exact size
        int[] uniqueArray = new int[uniqueCount];
        System.arraycopy(tempArray, 0, uniqueArray, 0, uniqueCount);

        return uniqueArray;
    }
}