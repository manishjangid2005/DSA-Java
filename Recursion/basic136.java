public class basic136 {
    
    static int sumNatural(int n) {
        if (n == 1) {
            return 1;
        }
        int plus = sumNatural(n-1);
        int sum = n + sumNatural(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(n);
    }
}
