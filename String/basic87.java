

// String charAt Method
public class basic87 {
    public static void printLetters(String str) {
        for(int i = 0; i <str.length(); i++) {
            System.out.print(str.charAt(i) +"");
        }
    }
    public static void main(String[] args) {
        String firstName = "Manish";
        String lastName = "Jangid";
        String fullName = firstName + " " + lastName; 
        System.out.println(fullName.charAt(0));

        printLetters(fullName);
    }
}
