// Print reverse of a number

public class basic34 {
    public static void main(String[] args) {
        int n = 10899;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.println(lastDigit);
            n = n / 10;
        }
    }
}
