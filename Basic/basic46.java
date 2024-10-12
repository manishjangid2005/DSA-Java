// Java mei function ko hamesa CALL BY VALUE se hi bula skte hai


public class basic46 {
    public static int CalculateSum(int a, int b /* Parameter or formal parameters means FUNCTION DEFINITION */) {
        int sum = a + b;
        return sum;
    }

    public static void swap(int a, int b) {
         // swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }

    public static void main(String[] args) {
        // swap - value exchange
        int a = 5;
        int b = 10;
        swap(a, b);
    }
}
