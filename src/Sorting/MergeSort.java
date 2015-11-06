package Sorting;

/**
 * Created by Eric on 11/5/2015.
 */
public class MergeSort {
    public static void merge(Integer[] list, int start, int end, Integer[] worker) {
        int middle = (start + end)/2;
        int i1 = start;
        int i2 = middle;

        for (int i = start; i < end; i++) {
            if (i1 < middle && (i2 == end || list[i1] < list[i2])) {
                worker[i] = list[i1];
                i1++;
            } else {
                worker[i] = list[i2];
                i2++;
            }
        }
    }

    public static void mergeSort(Integer[] list, int start, int end, Integer[] worker) {
        int middle = (start + end)/2;
        if (end - start < 2) {
            return;
        }

        mergeSort(list, start, middle, worker);
        mergeSort(list, middle, end, worker);

        merge(list, start, end, worker);

        copy(list, start, end, worker);
        return;
    }

    public static void copy(Integer[] list, int start, int end, Integer[] worker) {
        for (int i = start; i < end; i++) {
            list[i] = worker[i];
        }
    }

    public static void main(String[] args) {
        Integer[] sortThis = {10, 9 , 8, 3, 6, 5 , 4, 3, 2, 1};
        Integer[] worker = new Integer[sortThis.length];

        mergeSort(sortThis, 0, sortThis.length, worker);
        for(int i = 0; i < sortThis.length; i++) {
            System.out.print(sortThis[i] + " ");
        }
    }
}
