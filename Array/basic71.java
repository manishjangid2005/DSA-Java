

// Max Subarray sum - Brute Force

public class basic71 {
    public static void Subarrays(int numbers[]) {
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) { // print
                    // Subarray Sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (MaxSum < currSum) {
                    MaxSum = currSum;
                }
            }

        }
        System.out.println("Max Sum = " + MaxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        Subarrays(numbers);
    }
}
