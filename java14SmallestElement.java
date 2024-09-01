package pushpak11Array;

public class java14SmallestElement {
    public static void main(String[] args) {
        int[] arr = {9,2,3,45,5};
        int smaller =arr[0];
        for (int i:arr){
            if(smaller > i){
                smaller=i;
            }
        }
        System.out.println(smaller);
    }
}