package Algorithms.Sorting;

import Utils.Helper;

public class BubbleSort implements SortAlgorithm {

    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    Helper.swapArrayElements(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

}
