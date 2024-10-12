

// Selection Sorting  Pick the smallest fom usrtoed), put it at the beginning

/*
    5 4 1 3 2                
    1 5 4 3 2 
    1 2 5 4 3
    1 2 3 5 4
    1 2 3 4 5                
*/    

public class basic77 {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void SelectionSort(int arr[]) {
        for(int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for(int j = i+1; j < arr.length; j++) { 
                // j start from the unsorted arry
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5, 3, 1, 4, 2 };
        SelectionSort(arr);
        printArr(arr);
    }
}
