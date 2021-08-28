import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithm1 {
    public static void main(String[] args) {
        int[] arr = {1,2};

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println(Arrays.toString(arr));

        List<Integer> list = Arrays.asList(1, 2);
        Collections.swap(list, 0, 1);
        System.out.println(list.toString());
    }
}
