// Type conversion
// byte > short >int > float > long > double


// public class basic11 {
//     public static void main(String[] args) {
//         // long a = 25;
//         // int b = a;
//         // It is not possible because of size.
//         // Example
//         int a = 25;
//         long b = a;
//         System.out.println(b);
//     }
// }

// Type casting
// Ye forcefully type ko convert kr deta hai

import java.util.Scanner;

public class basic11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = 25.12f;
        int b = (int) a;
        System.out.println(b);

    }
}
