import java.util.*;

// Insertion Sort 
// Pick an element from the array and insert it into the correct position in the sorted array.

public class basic78 {
    public static void insertionSort(Integer arr[]) {
        // we can also write it like this: i = 1; i < arr.lenght; i++
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            // Finding out the correct position in the sorted array.
// Time Complexity: O(n^2)
            while (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = arr[curr];
        }
    }

    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    
    
    public static void main(String[] args) {
        // int arr[] = {5, 4, 1, 3, 2};
        // for descending order: reverseOrder() we need to take primitive types as arguments to the method. mens
        Integer arr[] = {5, 4, 1, 3, 2};
        // Inbuilt method to sort an array.
        // For ascending order: Arrays.sort(arr, 1st index, last index);
        Arrays.sort(arr, 0, 3);
        // For descending order: Arrays.sort(arr, 1st index, last index, Collection.reverseOrder());
        Arrays.sort(arr, 0, 5, Collections.reverseOrder());
        // insertionSort(arr);
        printArr(arr);
    }
}