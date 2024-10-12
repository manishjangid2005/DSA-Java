public class basic139 {

    public static int deleteArray(int arr[]) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[k] == arr[i]) {
                k++;
                arr[k] = arr[i];
            }
        }
        return k+1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 5, 4, 5};
        System.out.println(deleteArray(arr));
    }
}
