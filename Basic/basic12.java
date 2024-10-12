// Type Promotion in Expressions

import java.util.Scanner;

public class basic12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // char a = 'a';
        // char b = 'b';
        // System.out.println((int)(b));
        // System.out.println((int)(a));
        // System.out.println(b-a);
        // for any add, sub, multiply, etc through it.

        // agr syntax mei sbse bda operand double hai to hum sare operands to double mei
        // kr skte hai.
        // Ex

        int a = 20;
        float b = 10.15f;
        long c = 10;
        double d = 10;
        double ans = a + b + c + d;
        System.out.println(ans);
    }
}
// Example

// wrong
// byte b = 5;
// b = b*2;

// right
// byte b = 5;
// b = (byte)(b*2);