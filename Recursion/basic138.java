public class basic138 {
    // Recursive function to calculate the nth Fibonacci number
    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int N = 10; // Change N to the desired term count
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
