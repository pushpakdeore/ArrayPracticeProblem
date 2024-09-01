package pushpak11Array;

public class java1Large_Element_array {
    public static void main(String[] args) {
        int []arr = {1,2,3,45,5,};
        int max = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Large Elemrnt  : "+max);
    }
}
