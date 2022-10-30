package Problem;

import java.util.Arrays;

import fundamental.Array;

public class FindCommonElementFromArray {
    public static void main(String[] args) {
        int[] a={12,35,20,45,54,76};
        int[] b={25,35,20,45,64,76};
        // creating class for accessing method
        FindCommonElementFromArray bb=new FindCommonElementFromArray();
        System.out.println("Ans:"+Arrays.toString(bb.CommonElement(a,b)));     
    }
    public int[] CommonElement(int[] a,int[] b){
         // creating array for common element
         int[] CommonArray=new int[a.length];
         int index=0;
         for(int i=0;i<a.length;i++){
             for(int j=0;j<b.length;j++){
                 if(a[i]==b[j]){
                     CommonArray[index]=a[i];
                     index++;
 
                 }
 
             }
         }

         return CommonArray;
 
    }
    
}
