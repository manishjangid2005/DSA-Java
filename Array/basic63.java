

import java.util.*;

public class basic63 {
    public static void main(String[] args) {
        int marks[] = new int[100];
        // How to find the length of an array
        System.out.println( "Length of an array : "+marks.length);

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Math : " + marks[2]);

        // marks[2] = 100;
        marks[2] = marks[2] + 1;
        System.out.println("Math : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage : " + percentage + "%");
    }
}
