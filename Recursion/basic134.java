public class basic134 {

    public static void incOrder(int n) {
        if(n == 1) {
            System.out.print(1);
            return;
        }
        incOrder(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        incOrder(n);
    }
}
