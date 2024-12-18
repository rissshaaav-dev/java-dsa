package Algorithms.Sorting;

import Utils.Helper;

public class QuickSort implements SortAlgorithm {

    @Override
    public void sort(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        sort(arr, low, high);
    }

    private void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot)
                Helper.swapArrayElements(arr, ++i, j);
        }
        Helper.swapArrayElements(arr, high, i+1);
        return i+1;
    }

}
