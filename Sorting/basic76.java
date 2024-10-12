

// Sorting = Arrange in an order

// Bubble Sort 
// In this method we sorted the array one by one like a sequence
// Means we can say that in this method we do a lots of unsorted array element.
// For example 
/*  
    5 4 1 3 2          4 1 3 2 5        1 3 2 4 5                           
    4 5 1 3 2          1 4 3 2 5        1 2 3 4 5                             
    4 1 5 3 2          1 3 4 2 5        1 2 3 4 5                               
    4 1 3 5 2          1 3 2 4 5                                          
    4 1 3 2 5                                                         
    0th indexing       1st indexing     2nd indeing                                           
 */
public class basic76 {
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length-1; turn++) {
            int swap = 0;
            // agr already kisi order mei hai to loop ruk jaega.
            // Time Complexity = O(n^2)  
            for (int i = 0; i < arr.length-1-turn; i++) {
                if (arr[i] > arr[i+1]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    }
                swap++;
                if (swap  == 0) {
                    break;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        bubbleSort(arr);
        printArr(arr);
    }
}
