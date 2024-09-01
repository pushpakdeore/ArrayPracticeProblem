package pushpak11Array;

public class java18PrimePosition {
    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4,5,6,7,8,9,10};
        for(int i =0;i<arr.length;i++){
            if (isprime(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
    public  static boolean isprime(int n) {
        if(n<=1){
            return false;
        }for(int i =2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
}
