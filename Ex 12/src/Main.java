import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Example using excluded numbers
        int excludedNumber1 = 5;
        int excludedNumber2 = 10;
        int randomNum = getRandom(excludedNumber1, excludedNumber2);
        System.out.println("Random number between 1 and 54 excluding " + excludedNumber1 + " and " + excludedNumber2 + ": " + randomNum);
    }

    public static int getRandom(int... numbers) {
        Random random = new Random();
        int randomNum;

        do {
            randomNum = random.nextInt(54) + 1;
        } while (contains(numbers, randomNum));

        return randomNum;
    }
    private static boolean contains(int[] numbers, int num) {
        for (int n : numbers) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }


}
