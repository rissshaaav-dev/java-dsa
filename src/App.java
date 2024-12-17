import Algorithms.Sorting.BubbleSort;
import Algorithms.Sorting.InsertionSort;
import Algorithms.Sorting.MergeSort;
import Algorithms.Sorting.SelectionSort;
import Utils.Helper;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // Stack stack = new Stack(5);
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        // stack.push(5);
        // stack.display();
        // System.out.println(stack.pop());
        // stack.display();

        int[] arr = {3, -2, 4, 45, 0};
        // BubbleSort sort = new BubbleSort();
        // SelectionSort sort = new SelectionSort();
        // InsertionSort sort = new InsertionSort();
        MergeSort sort = new MergeSort();
        sort.sort(arr);
        Helper.printArray(arr);
    }
}
