// Print number from 1 to 10

import java.util.Scanner;

public class basic30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        System.out.println("Enter input : ");
        while (counter <=range) {
            System.out.println(counter);
        counter++;
        }
    }
}