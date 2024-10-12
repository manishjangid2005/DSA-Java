// Factorial of a number, n

public class basic48 {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }
    public static int Factorial(int n) {
        int f = 1;
        for (int i = 1; i <=n; i++) {
            f = f * i;
        }
            return f;  // because f is a factorial of n
        }
        public static void main(String[] args) {
            System.out.println(Factorial(4));
        }
    }
