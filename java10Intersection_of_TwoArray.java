package pushpak11Array;
import java.util.HashSet;

public class java10Intersection_of_TwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        HashSet<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }

        System.out.print("Intersection of the two arrays: ");
        for (int i : arr2) {
            if (set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
