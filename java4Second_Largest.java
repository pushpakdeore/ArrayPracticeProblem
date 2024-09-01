package pushpak11Array;
// Find 2nd Largest Number in an Array
public class java4Second_Largest {
    public static void main(String[] args) {
        int[] arr ={1,2,3,45,6,7,8,9};
        int first = arr[0];
        int second = Integer.MIN_VALUE;
        for (int i =0;i< arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            } else if (arr[i]>second && arr[i]!=first) {
                second =arr[i];

            }

        }
        System.out.println(second);
    }
}


