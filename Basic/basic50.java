// Function overloading means multiple function with the same name but different parameters

// Funtion Overloading using parameters


public class basic50 {
    public static int sum(int a, int b) {
        return a+b;
    }
public static int sum(int a, int b, int c)
{
    return a+b+c;
}
public static void main(String[] args) {
    System.out.println(sum(3, 5));
    System.out.println(sum(5, 2, 1));
}

}