import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store five integers
        System.out.println("Enter amount of values to be considered(5):");
        int[] numbers = new int[scanner.nextInt()];

        // Read five integers from the user
        System.out.println("Enter integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate GCD of entered numbers
        int result = gcd(numbers);

        // Display the result
        System.out.println("The GCD of the entered numbers is: " + result);

    }
    // Method to compute the GCD of two numbers using Euclidean algorithm
    private static int gcdOfTwo(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to compute the GCD of multiple numbers
    public static int gcd(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required");
        }

        // Start with the first number
        int result = numbers[0];

        // Apply the GCD function iteratively to all numbers
        for (int i = 1; i < numbers.length; i++) {
            result = gcdOfTwo(result, numbers[i]);
        }

        return result;
    }
}