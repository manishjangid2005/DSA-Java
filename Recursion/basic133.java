import java.util.*;

public class basic133 {

    static void decOrder(int num){
        if (num == 1) {
            System.out.println(num);
            return;
        }
        System.out.print(num+" ");
        decOrder(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        decOrder(num);
    }
}
