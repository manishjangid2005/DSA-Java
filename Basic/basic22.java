// Else if

import javax.lang.model.util.ElementScanner14;

public class basic22 {
    public static void main(String[] args) {
        int age = 22;
        if (age >= 13) {
            System.out.println("Adult");
        }
        else if (age >= 13 && age < 18) {
            System.out.println("Teenager");
        }
        else {
        System.out.println("Minor");
        }
    }
}
