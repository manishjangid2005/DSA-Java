// Inverted & Rotated Half-Pyramid

public class basic58 {
    public static void Half_pyramid (int n) {
        for (int i = 1; i<=n; i++) {
            // Spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Half_pyramid(8);
    }
}
