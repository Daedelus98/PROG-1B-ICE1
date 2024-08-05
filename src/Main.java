import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Exercise 1
        ex1();
        //Exercise 2
        //ex2();
        //Exercise 3
        //ex3();
        //Exercise 4
        //ex4();
        //Exercise 5
        //ex5();
        //Exercise 6
        //ex6();
        //Exercise 7 (duplicate of Exercise 6)
        //ex7();
        //Exercise 11
        //ex11();
        //Exercise 15
        //ex15();
        //Exercise 16
        //ex16();
        //Exercise 23
        //ex23();
        //Exercise 24
        //ex24();
    }

    private static void ex1(){
        Scanner scanner = new Scanner(System.in);

        //Enter number of student entries
        System.out.println("Enter amount of students:");
        int studentAmount = scanner.nextInt();

        //initialize marks capture array
        int[] marks = new int[studentAmount];

        //Enter student marks
        System.out.println("Enter marks for " + studentAmount + " students");
        for (int i = 0; i < studentAmount; i++){
            System.out.println("Enter student " + (i + 1) + "'s mark:");
            marks[i] = scanner.nextInt();
        }

        //find 'best' mark
        int best = marks[0];
        for (int mark : marks){
            if(mark > best){
                best = mark;
            }
        } System.out.println("Best mark: " + best);

        for (int i = 0; i < studentAmount; i++){
            String grade;
            int mark = marks[i];
            if (mark >= best - 10){
                grade = "A";
            }
            else if (mark >= best - 20){
                grade = "B";
            }
            else if (mark >= best - 30){
                grade = "C";
            }
            else if (mark >= best - 40){
                grade = "D";
            }
            else {
                grade = "F";
            }
            System.out.println("Student " + (i + 1) + ": \nMark: " + mark + " \nGrade: " + grade );
        }
    }
    private static void ex2() {
        Scanner scanner = new Scanner(System.in);

        //Declare number list
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Display reversed list
        System.out.println("\nThe numbers in reverse order are:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
    private static void ex3() {
        Scanner scanner = new Scanner(System.in);
        int[] counts = new int[101];

        //Prompt user entry
        System.out.println("Please enter numbers between 1 and 100 to tally and 0 to end count:");

        while (true) {
            //check and sort user entry
            int number = scanner.nextInt();

            //to end count
            if (number == 0) {
                break;
            }

            //count user entries
            if (number >= 1 && number <= 100) {
                counts[number]++;
            } else {
                System.out.println("Entry invalid! \nPlease enter numbers between 1 and 100 to tally and 0 to end count:");
            }
        }

        //when user ends count
        System.out.println("\nTotal Occurrences:");
            for (int i = 1; i <= 100; i++){
                if (counts[i] > 0) {//Display nothing
                    if (counts[i] > 1) {//Display occurrences + times
                        System.out.println(i + " occurs " + counts[i] + " times");
                    }else {//Display occurrences + time
                        System.out.println(i + " occurs " + counts[i] + " time");
                    }

                }

            }
            }
    private static void ex4() {
        //Declarations
        int[] scores = new int[100];
        int count = 0;

        double total = 0;

        ArrayList<Integer> overAndEqual = new ArrayList<>();
        ArrayList<Integer> underEqual = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        //Prompt user entry
        System.out.println("Enter scores to calculate average and a negative number to end");

        //Check input
        while (count < scores.length){
            int score = scanner.nextInt();

            //end condition
            if (score < 0){
                break;
            }

            //sort scores into array
            scores[count] = score;
            count ++;
        }

        //calculate the average
        if (count > 0){
            for (int i = 0; i < count; i++){
                total += scores[i];
            }
            double average = total/count;

            //Sort scores below and above the average into lists
            for (int i = 0; i < count; i++){
                if (scores[i] < average){
                    underEqual.add(scores[i]);
                }else{
                    overAndEqual.add(scores[i]);
                }
            }

            //Display Results
            System.out.println("\nAverage score is: " + average);
            System.out.println("Amount of scores below average: " + underEqual.size() + "\nThe scores below average are: ");
            for (int score : underEqual){
                System.out.println(score);
            }
            System.out.println("\nAmount of scores above average: " + overAndEqual.size() + "\nThe scores above average are: ");
            for (int score : overAndEqual){
                System.out.println(score);
            }
        } else {
            System.out.println("No entries made.");
        }
    }
    private static void ex5(){
        //Declarations
        int entry = 0;

        ArrayList<Integer> distinctNumbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        //Prompt user entry
        System.out.println("Enter 10 numbers");

        //Check input
        while (entry < 10){
            int number = scanner.nextInt();

            //Check for duplicates
            if (!distinctNumbers.contains(number)){
                distinctNumbers.add(number);
            }entry++;
        }

        //Display distinct numbers
        System.out.println("\nNumber of distinct numbers: " + distinctNumbers.size());
        System.out.println("Distinct numbers: ");

        for (int i = 0; i < distinctNumbers.size(); i++){
            System.out.println(distinctNumbers.get(i));
            if (i < distinctNumbers.size() - 1){
                System.out.println(" ");
            }
        }

    }
    private static void ex6(){
        //Declarations
        int[] counts = new int[10]; // Array to store the counts for each number

        Random random = new Random();

        // Generate 100 random integers between 0 and 9
        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(10);
            counts[number]++;
        }

        // Display the count for each number
        for (int i = 0; i < 10; i++) {
            if (counts[i] > 1) {//Display occurrences + times
                System.out.println(i + " appears " + counts[i] + " times");
            }else {//Display occurrences + time
                System.out.println(i + " appears " + counts[i] + " time");
            }
        }
    }
    private static void ex7(){
        //Declarations
        int[] counts = new int[10]; // Array to store the counts for each number

        Random random = new Random();

        // Generate 100 random integers between 0 and 9
        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(10);
            counts[number]++;
        }

        // Display the count for each number
        for (int i = 0; i < 10; i++) {
            if (counts[i] > 1) {//Display occurrences + times
                System.out.println(i + " appears " + counts[i] + " times");
            }else {//Display occurrences + time
                System.out.println(i + " appears " + counts[i] + " time");
            }
        }
    }
    private static void ex11(){
        //Declarations
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Prompt user entry
        System.out.println("Enter 10 values:");

        //Assign input to array
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        //Display reversed input
        System.out.println("\nThe numbers in reverse order are:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
    private static void ex15(){

        //Student class
        class Student{
            String name;
            int score;

            Student(String name, int score){
                this.name = name;
                this.score = score;
            }
        }

        //Declarations
        Scanner scanner = new Scanner(System.in);
        List <Student> students = new ArrayList<>();

        //Prompt student amount
        System.out.println("Enter your amount of students");
        int[] studentAmount = new int[scanner.nextInt()];

        //Input student details
        for (int i = 0; i < studentAmount.length; i++){
            System.out.println("Enter student " + (i + 1) + "'s name");
            String name = scanner.next();
            System.out.println("Enter student " + (i + 1) + "'s score");
            int score = scanner.nextInt();

            students.add(new Student(name, score));
        }

        //Sort student scores in descending order
        students.sort((s1, s2) -> Integer.compare(s2.score, s1.score));

        //Display student scores
        System.out.println("\nStudents scores in decreasing order:");
        for (Student student : students){
            System.out.println(student.name + " got " + student.score);
        }
    }
    private static void ex16(){
        double [] someNums = {10, 45.5, 32.6, 78.9, 57.3, 19.19, 99.99, 00.01, 29.4, 82.1};

        for (int a = 0;a < someNums.length - 1; a++){
            for (int b = 0; b < someNums.length - 1 - a; b++){
                if (someNums[b] < someNums[b + 1]){
                    double temp = someNums[b];
                    someNums[b] = someNums[b+1];
                    someNums[b+1] = temp;
                    System.out.println(Arrays.toString(someNums));
                }
            }
        }
    }
    private static void ex23(){
        //Declarations
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        //Prompt user entry
        System.out.println("Enter 10 numbers:");

        //Assign input to array
        for (int i = 0; i < 10; i++){
            numbers[i] = scanner.nextInt();
        }

        //Display combinations
        System.out.println("\nAvailable combinations of any 2 of your numbers:");
        for (int i = 0; i < 9; i++){
            for (int j = i + 1; j < 10; j++){
                System.out.println(numbers[i] + ", " + numbers[j]);
            }
        }
    }
    private static void ex24(){
        int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int sum = 0;
        int picks = 0;

        while (sum != 24) {
            sum = 0;
            picks++;

            for (int i = 0; i < 4; i++) {
                int randomCardIndex = new Random().nextInt(cards.length);
                sum += cards[randomCardIndex];
            }
        }

        System.out.println("Number of picks to get a sum of 24: " + picks);

    }
}
