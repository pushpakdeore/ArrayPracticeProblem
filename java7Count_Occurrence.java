package pushpak11Array;

public class java7Count_Occurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
        int x = 4;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        System.out.println(x + " occurs " + count + " times in the array.");
    }
}
