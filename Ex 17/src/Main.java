import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the list
        System.out.print("Enter number of values: ");
        int input = scanner.nextInt(); // First input is the number of elements
        System.out.println("Enter values:");
        int[] list = new int[input];

        // Read the elements into the list
        for (int i = 0; i < input; i++) {
            list[i] = scanner.nextInt();
        }

        // Check if the list is sorted and display the result
        if (isSorted(list)) {
            System.out.println("The list is sorted in increasing order.");
        } else {
            System.out.println("The list is not sorted in increasing order.");
        }
    }

    // Method to check if the list is sorted in increasing order
    public static boolean isSorted(int[] list) {
        // Check if each element is more than the previous element
        for (int i = 1; i < list.length; i++) {
            if (list[i] < list[i - 1]) {
                return false; // Found an element less than the previous element
            }
        }
        return true; // All elements are in increasing order
    }
}