package pushpak11Array;

import java.util.Arrays;

public class java11Sort_array {
    public static void main(String[] args) {
        int[] arr=  {2,4,78,5,2,567,4,5};
        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;

            }
        }
    }
        System.out.println("Sorted array is:"+ Arrays.toString(arr));
}
}
