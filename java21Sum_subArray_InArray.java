package pushpak11Array;
//int arr[]={1,2,3}output =20
//explaination ={1}+{2}+{3}+{2+3}+{1+2}+{1,2,3}
public class java21Sum_subArray_InArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;

        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {

                currentSum += arr[j];

                totalSum += currentSum;
            }
        }

        System.out.println("Total sum of all subarrays: " + totalSum);

    }
}
