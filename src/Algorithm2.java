import java.util.Arrays;

public class Algorithm2 {
    public static void main(String[] args) {
        int[] arr = {3,2,7,5,9,1,4,6,8};

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {

                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
