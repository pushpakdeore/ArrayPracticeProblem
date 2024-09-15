package pushpak11Array;

public class java19Element_sum_equal_target {
    //ok
    
    public static void main(String[] args) {
        int[] array  = {1,2,3,4,5,6,7,};
        int target = 5;
        for(int i =0;i< array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==target){
                    System.out.println(array[i]+" "+array[j]);
                }
            }
        }
    }



}
