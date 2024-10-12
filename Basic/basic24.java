// Print the largest of 3

public class basic24 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 6;
        if ((a >= b) && (a >= c)) {
            System.out.println("A is greater than 3");
        }
        else if (b >= c) {
            System.out.println("B is largest than 3");
        }
        else {
            System.out.println("C is largest than 3");
        }
    }
}
