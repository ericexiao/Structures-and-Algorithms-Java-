package Sorting;

/**
 * Created by Eric on 11/14/2015.
 */
public class SelectionSort {
    public static void selectionSort(int[] input) {
        for(int i = 0; i < input.length; i++) {
            int leastIndex = i;
            for (int j = i; j < input.length; j++) {
                if (input[j] < input[leastIndex]) {
                    leastIndex = j;
                }
            }
            int temp = input[i];
            input[i] = input[leastIndex];
            input[leastIndex] = temp;
        }
    }
    public static void printArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] test1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] test2 = {5, 5, 5, 5, 5};
        int[] test3 = {2, 4, 10000, 1, -5, -17};

        selectionSort(test1);
        selectionSort(test2);
        selectionSort(test3);
        printArray(test1);
        printArray(test2);
        printArray(test3);
    }
}
