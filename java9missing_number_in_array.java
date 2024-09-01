package pushpak11Array;

public class java9missing_number_in_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int missingNumber = totalSum - sum;
        System.out.println("Missing number: " + missingNumber);
    }

}
