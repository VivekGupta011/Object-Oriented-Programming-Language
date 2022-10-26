package Array;
import java.util.Arrays;

import fundamental.Array;

public class FindReversewithNewArrya {

    static void reverse(int[] array,int num){
        int[] b=new int[num];
        int j=num;
        for(int i=0;i<num;i++){
            b[j-1]=array[i];
            j=j-1;
            System.out.print(b[j]+" ");
        }
        
        //printing the reversed array
        System.out.println("Reversed array:\n");
        for(int m=0;m<num;m++){
            System.out.print(b[m]+" ");
        }
        System.out.println();
        System.out.println("new array:"+Arrays.toString(b));

    }
    public static void main(String[] args) {
        int [] arr={12,232,3232,2323,214,3434,123,3};
        reverse(arr,arr.length);
    }
}
