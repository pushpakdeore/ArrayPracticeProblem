package pushpak11Array;
import  java.util.Arrays;

public class java8Remove_Duplicat{
    public static void main(String[] args) {
        int[] ip= {1,5,42,12,45,364,13,1656,1,1,5,2,5,6};
        System.out.println(Arrays.toString(ip));
        System.out.println(Arrays.toString(removeDuplicate(ip)));
    }

    public static int[] frequency(int[] ar)
    {
        int ct[]=new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            int count =0;
            for (int j = i+1; j < ct.length; j++) {

                if (ar[i]==ar[j]) {

                    count++;
                    ct[j]=-1;
                }
            }
            if (ct[i]!=-1) {

                ct[i]=count;
            }
        }
        return ct;
    }
    public static int[] removeDuplicate(int []ar)
    {
        int freq[]=frequency(ar);
        int unique[]=new int[ar.length-count(freq)];
        for (int i = 0,j=0; i < ar.length; i++) {
            if (freq[i]>=0) {
                unique[j]=ar[i];
                j++;
            }
        }
        return unique;
    }
    private static int count(int[] ct) {

        int total=0;
        for(int i=0;i<ct.length;i++)
        {
            if (ct[i]<0) {
                total++;
            }
        }
        return total;
    }

}