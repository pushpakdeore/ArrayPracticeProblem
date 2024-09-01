package pushpak11Array;

import java.util.Arrays;
import java.util.jar.JarEntry;

public class java6Rotate_Array_to_Left {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int rotations = 2;

        for (int i = 0; i < rotations; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }

        System.out.println("Array after left rotation: " + Arrays.toString(arr));
    }
}