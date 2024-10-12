// Most Important Question:-
// Check if a number is prime or not

public class basic52 {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i<=n-1; i++) {
            if (n % 1 == 0) { // Completely dividing
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        isPrime(5);
    }
}
