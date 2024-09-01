package pushpak11Array;
//move zero to last
public class java20Zero_To_Last {
    public static void main(String[] args) {
        int[] array ={1,0,3,330,30,0,303,5};
        System.out.println("orignal array :");
        printArray(array);
        int[] result=moveZero(array);
        System.out.println("the Zero Moved Array");
        printArray(result);




    }
    public static  int[] moveZero(int[] array){
       int  n=array.length;
        int[] result = new int[n];
        int index =0;//imp int[n]
        for(int i:array) {
            if (i != 0) {
                result[index] = i;
                index++;
            }
        }
        while (index<n){
            result[index]=0;
            index++;
        }

        return result;

    }
    public static void printArray(int[] array){
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
    }


}
