package algorithms.sorting;

import utils.Helper;

public class SelectionSort implements SortAlgorithm {

    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j])
                    minIndex = j;
            }
            Helper.swapArrayElements(arr, minIndex, i);
        }
    }

}
