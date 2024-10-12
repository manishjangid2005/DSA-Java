import java.util.Scanner;

public class basic135 {
    
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int lulu = fact(n-1);
        int tech = n * fact(n-1);
        return tech;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}