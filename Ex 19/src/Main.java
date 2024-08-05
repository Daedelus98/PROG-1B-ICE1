public class Main {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100]; // Array to represent the lockers

        // Simulate the students opening and closing lockers
        for (int student = 1; student <= 100; student++) {
            for (int locker = student - 1; locker < lockers.length; locker += student) {
                lockers[locker] = !lockers[locker]; // Switch the locker (open/close)
            }
        }

        // Display open lockers
        System.out.print("Open lockers at the end: ");
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print((i + 1) + " "); // Add 1 to locker number to match student numbering
            }
        }
    }
}