package pushpak11Array;

import java.util.Arrays;

public class java5check_array_is_sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean issorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                issorted= false;
                break;
            }
        }
        if(issorted){
            System.out.println("Array is Sorted"+ Arrays.toString(arr));
        }else {
            System.out.println("Array is not sorted"+Arrays.toString(arr));

    }
}
}

