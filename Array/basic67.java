
// Binary Search in array

public class basic67 {
    public static int BinarySearch(int numbers[], int key, int end) {
        int start = 0; end = numbers.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // Comparison
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {  // Right
                start = mid + 1;
            }
            else{  // Left
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12};
        int key = 10;

        System.out.println("Index for key is : " + BinarySearch(numbers, key, key));
    }
}
