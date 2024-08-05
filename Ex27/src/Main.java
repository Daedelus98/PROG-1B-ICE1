import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Method to sort the characters of the string
    public static String sort(String s) {
        // Convert the string to a character array
        char[] charArray = s.toCharArray();

        // Sort character array
        Arrays.sort(charArray);

        // Convert sorted character array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        // Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.println("Enter a string to be sorted: ");
        String input = scanner.next();

        // Get sorted string
        String sortedString = sort(input);

        // Display sorted string
        System.out.println("Sorted string: " + sortedString);
    }
}