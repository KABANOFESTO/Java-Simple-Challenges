package Interface.question10;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = { 3, 9, 0, 4, 1, 7 };

        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();


        quickSort.sort(array.clone());
        System.out.println("Sorted array using QuickSort: " + Arrays.toString(array));



        System.out.println("Sorted array using MergeSort: " + Arrays.toString(array));
    }
    }

