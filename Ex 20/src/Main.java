import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize deck and suit tracking
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        List<String> deck = createDeck(suits);

        // List to keep track of picked cards
        List<String> pickedCards = new ArrayList<>();
        boolean[] suitsCollected = new boolean[4];
        int picks = 0;

        Random random = new Random();

        // Repeat until all suits are collected
        while (true) {
            // Pick a random card from the deck
            String pickedCard = deck.get(random.nextInt(deck.size()));
            pickedCards.add(pickedCard);
            picks++;

            // Check the suit of the picked card and mark it as collected
            for (int i = 0; i < suits.length; i++) {
                if (pickedCard.contains(suits[i])) {
                    suitsCollected[i] = true;
                    break;
                }
            }

            // Check if all suits have been collected
            if (allSuitsCollected(suitsCollected)) {
                break;
            }
        }

        // Display the results
        System.out.println("Total picks needed to get at least one card from each suit: " + picks);
        System.out.println("Cards picked: " + pickedCards);
    }

    // Method to create a standard deck of cards
    private static List<String> createDeck(String[] suits) {
        List<String> deck = new ArrayList<>();
        String[] cards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (String suit : suits) {
            for (String card : cards) {
                deck.add(card + " of " + suit);
            }
        }
        return deck;
    }

    // Method to check if all suits have been collected
    private static boolean allSuitsCollected(boolean[] suitsCollected) {
        for (boolean collected : suitsCollected) {
            if (!collected) {
                return false;
            }
        }
        return true;
    }
}