// String Builder
// .toString funtion 
// Those programs in which we use sting we can also use in stringbuilder

public class basic93 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            // append means judte chle jana
            sb.append(ch);
        }
        System.out.println(sb.length());
    }
}
