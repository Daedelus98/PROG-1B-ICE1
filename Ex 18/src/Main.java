public class Main {
    private static final int size = 8; // Size of the chessboard
    private static int[] board = new int[size]; // Array to represent the board

    public static void main(String[] args) {
        if (placeQueens(0)) {
            printBoard();
        } else {
            System.out.println("No solution found.");
        }
    }

    // Method to place queens on the board
    private static boolean placeQueens(int row) {
        if (row >= size) {
            return true; // All queens are placed
        }

        for (int col = 0; col < size; col++) {
            // Check if it's safe to place queen
            if (isSafe(row, col)) {
                board[row] = col; // Place queen
                // Recur to place the rest of the queens
                if (placeQueens(row + 1)) {
                    return true;
                }
                // If placing queen doesn't lead to a solution, backtrack
            }
        }
        return false; // No valid position found for this row
    }

    // Method to check if it is safe to place a queen at (row, col)
    private static boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            // Check column and diagonals
            if (board[i] == col ||
                    board[i] - i == col - row ||
                    board[i] + i == col + row) {
                return false;
            }
        }
        return true;
    }

    // Method to print the chessboard
    private static void printBoard() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (board[row] == col) {
                    System.out.print(" Q "); // Print queen
                } else {
                    System.out.print(" / "); // Print empty space
                }
            }
            System.out.println();
        }
    }
}