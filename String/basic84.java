

import java.util.*;
public class basic84 {
    public static void main(String args[]) {
        char arr[] = {'a','b','c', 'd', 'e'};
        String str = "abcd";

        // String are immutable -: Inportant
        // we can't do any changes in a string after its creation


        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine(); //next take word only but nextline whole sentence
        System.out.println(name);
    }
}
