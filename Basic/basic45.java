// Syntax with parameters

import java.util.Scanner;

public class basic45 {
    
    public static int CalculateSum(int a, int b  /* Parameter or formal parameters  means  FUNCTION DEFINATION*/) {
        Scanner sc = new Scanner(System.in);
        
        int sum = a + b;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  : ");
        int a = sc.nextInt();
        System.out.println("Enter b : " );
        int b = sc.nextInt();
        int sum = CalculateSum(a,b); // Arguments, actual parameter  means  FUNCTION CALL
        System.out.println("Sum is : " +sum);
    }
}
