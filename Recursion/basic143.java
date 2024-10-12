public class basic143 {

    public static int tilingProblem(int n) {  // 2 x n (floor size)
        if (n == 0 || n == 1) {
            return 1;
        }

        // kaam
        // vertical choice
        // horizontal choice
        // ways

        int verticalchoice = tiling(n-1);
        int horizontalchoice =  tiling(n-2);
        int toWays = verticalchoice + horizontalchoice;
        return toWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
