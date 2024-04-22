package Interface.question7;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 };


        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();


        bubbleSort.sort(arr.clone());
        System.out.println("Sorted array using BubbleSort: " + Arrays.toString(arr));


        selectionSort.sort(arr.clone());
        System.out.println("Sorted array using SelectionSort: " + Arrays.toString(arr));
    }

    }

