public class Main {
    public static int[] merge(int[] list1, int[] list2) {

        int[] mergedList = new int[list1.length + list2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < list1.length && j < list2.length) {
            if (list1[i] < list2[j]) {
                mergedList[k] = list1[i];
                i++;
            } else {
                mergedList[k] = list2[j];
                j++;
            }
            k++;
        }

        while (i < list1.length) {
            mergedList[k] = list1[i];
            i++;
            k++;
        }

        while (j < list2.length) {
            mergedList[k] = list2[j];
            j++;
            k++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the number of elements in list 1: ");
        int list1Size = input.nextInt();
        int[] list1 = new int[list1Size];
        System.out.print("Enter the elements of list 1: ");
        for (int i = 0; i < list1Size; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter the number of elements in list 2: ");
        int list2Size = input.nextInt();
        int[] list2 = new int[list2Size];
        System.out.print("Enter the elements of list 2: ");
        for (int i = 0; i < list2Size; i++) {
            list2[i] = input.nextInt();
        }

        int[] mergedList = merge(list1, list2);

        System.out.print("Merged list: ");
        for (int num : mergedList) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
