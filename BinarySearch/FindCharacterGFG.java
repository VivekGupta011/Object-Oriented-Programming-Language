package BinarySearch;

import java.applet.Applet;

public class FindCharacterGFG {
    public static void main(String[] args) {
        char letters[]={'A','b','c','d','f','g','h','i'};
        char target='h';
        char result=nextGreatest(letters, target);
        System.out.println("Ans is:"+result);
        
    }
    static char nextGreatest(char alphabets[],char target){
        int n=alphabets.length;
        if(target>=alphabets[n-1]){
            return alphabets[0];

        }
        int start=0,end=alphabets.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            System.out.println("start:"+start);
            if(alphabets[mid]>target){
                end=mid-1;
                System.out.println("value:"+alphabets[mid]);
                ans=mid;

            }else{
                start=mid+1;
            }
        }
        return alphabets[ans];
    }
}
