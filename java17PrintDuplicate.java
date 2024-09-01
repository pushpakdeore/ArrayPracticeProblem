package pushpak11Array;

public class java17PrintDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2,23,4,21,1,4,56,23};
        for(int i=0;i<arr.length;i++){
            for (int j =i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }


}
