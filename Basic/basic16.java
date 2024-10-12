// Assignment Operator

// Types

//  =
//  +=
//  -=
//  *=  
//  /=

public class basic16 {
    public static void main(String[] args) {
        int a = 5;
        a += 10;
        // a = a + 10;  It is very slow then the compare of it.
        System.out.println(a);

        int b = 5;
        b -= 10;
        System.out.println(b);

        int c = 5;
        c*= 10;
        System.out.println(c);

        int d = 5;
        d /= 10;
        System.out.println(d);
    }
}
