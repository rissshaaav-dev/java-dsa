package Algorithms.Sorting;

public class MergeSort implements SortAlgorithm {

    private void merge(int[] arr, int[] firstHalf, int[] secondHalf) {
        int i = 0, j = 0, k = 0;
        while (i < firstHalf.length && j < secondHalf.length) {
            if (firstHalf[i] <= secondHalf[j])
                arr[k++] = firstHalf[i++];
            else
                arr[k++] = secondHalf[j++];
        }
        while (i < firstHalf.length)
            arr[k++] = firstHalf[i++];
        while (j < secondHalf.length)
            arr[k++] = secondHalf[j++];
    }

    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        if (n < 2)
            return;
        int mid = n / 2;

        int[] firstHalf = new int[mid];
        for (int i = 0; i < mid; i++)
            firstHalf[i] = arr[i];
        sort(firstHalf);

        int[] secondHalf = new int[n - mid];
        for (int j = mid; j < n; j++)
            secondHalf[j - mid] = arr[j];
        sort(secondHalf);

        merge(arr, firstHalf, secondHalf);
    }
}
