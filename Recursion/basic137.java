public class basic137 {
    
    public static int fibbonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fib1 = fibbonacci(n-1);
        int fib2 = fibbonacci(n-2);
        int fib = fib1 + fib2;
        return fib;
    }
    public static void main(String[] args) {
        int n = 25;
        System.out.println(fibbonacci(n));
    }
}
