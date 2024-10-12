// String function compare
// .equalto function
public class basic90 {
    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "madam";
        String str3 = new String("madam");

        // It is used for object only
        // if (str1 == str2) {
        //     System.out.println("String are equal");
        // }
        // else {
        //     System.out.println("String are not equal");
        // }
        
        // if (str1 == str3) {
        //     System.out.println("String are equal");
        // }
        // else {
        //     System.out.println("String are not equal");
        // }

        if (str1.equals(str2)) {
            System.out.println("String are equal");
        }
        else {
            System.out.println("String are not equal");
        }
    }
}