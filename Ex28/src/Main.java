import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    // Array of words for the game
    private static final String[] WORDS = {
            "JALAPENOS", "HANG-GLIDER", "EXTRATERRESTRIAL", "LEVIATHAN", "NAUTILUS", "TANGERINE", "AQUAMARINE", "DRACONIAN"
    };

    private static final int MAX_MISSES = 10;//Maximum amount of misses before the game ends
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            // Pick word from the array randomly
            String word = WORDS[random.nextInt(WORDS.length)];
            char[] hiddenWord = new char[word.length()];
            Arrays.fill(hiddenWord, '*');

            int misses = 0;
            List<Character> guessedLetters = new ArrayList<>();
            boolean wordGuessed = false;

            //Game display
            System.out.println("Welcome to Hangman!");
            while (!wordGuessed && misses < MAX_MISSES) {
                System.out.println("Current word: " + new String(hiddenWord));
                System.out.println("Misses: " + misses + "/" + MAX_MISSES);
                System.out.println("Guess a letter: ");
                char guessedLetter = scanner.next().toUpperCase().charAt(0);

                if (guessedLetters.contains(guessedLetter)) {
                    System.out.println("You've already guessed that letter.");
                    continue;
                }

                guessedLetters.add(guessedLetter);

                if (word.indexOf(guessedLetter) >= 0) {
                    // Correct guess
                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) == guessedLetter) {
                            hiddenWord[i] = guessedLetter;
                        }
                    }
                } else {
                    // Incorrect guess
                    misses++;
                }

                // Check if word is fully guessed
                wordGuessed = new String(hiddenWord).equals(word);

                if (wordGuessed) {
                    System.out.println("Congratulations! You've guessed the word: " + word + "!");
                } else if (misses >= MAX_MISSES){//End game if misses = MAX
                    System.out.println("End of Game! Sorry you've used all your chances :(");
                    System.out.println("The word was: " + word + ". Better luck next time!");
                }
            }

            // Ask user if they want to play again
            System.out.println("\nDo you want to play again? (yes/no)");
            playAgain = scanner.next().trim().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}