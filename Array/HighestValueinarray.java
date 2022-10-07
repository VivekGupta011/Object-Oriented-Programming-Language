package Array;

import fundamental.Array;

public class HighestValueinarray {
    public static void main(String[] args) {
        int[] arrayData={100,12,45,67,89};
        int max=arrayData[0];
        for(int i=1;i<arrayData.length;i++){
            if(max<arrayData[i]){
                max=arrayData[i];
            }else{

            }

        }
        System.out.println("This is max value:"+max);
    }
    
}
