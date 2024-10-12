// Print Hollow rectangle pattern

public class basic57 {
    public static void Hollow_rectangle(int totRows, int totCols) {
        // Outer Loop
        for (int i = 1; i<=totRows; i++) {
            // Inner - columns
            for (int j = 1; j <=totCols; j++) {
                // cell - (i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) { //boundary cells
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Hollow_rectangle(7, 16);
    }
}