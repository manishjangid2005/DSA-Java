// Sub-String

public class basic91 {
    public static String subString(String s1, int si, int ei) {
        // User-create function
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += s1.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String s1 = "Hello World";
        // Inbuilt function
        System.out.println(s1.substring(1, 4));
        System.out.println(subString(s1,  1, 4));
    }
}
