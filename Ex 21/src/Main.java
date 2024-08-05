import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first list
        System.out.print("Enter the number of elements in the first list: ");
        int list1Input = input.nextInt();
        int[] list1 = new int[list1Input];
        System.out.print("Enter the elements of the first list: ");
        for (int i = 0; i < list1Input; i++) {
            list1[i] = input.nextInt();
        }

        // Prompt the user to enter the second list
        System.out.print("Enter the number of elements in the second list: ");
        int list2Input = input.nextInt();
        int[] list2 = new int[list2Input];
        System.out.print("Enter the elements of the second list: ");
        for (int i = 0; i < list2Input; i++) {
            list2[i] = input.nextInt();
        }

        // Check if the two lists are identical
        if (equals(list1, list2)) {
            System.out.println("The two lists are identical.");
        } else {
            System.out.println("The two lists are not identical.");
        }
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }

        return true;
    }
}