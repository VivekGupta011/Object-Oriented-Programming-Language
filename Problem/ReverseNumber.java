package Problem;

import java.util.Scanner;

public class ReverseNumber {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int data=scn.nextInt();
        int ans=0;
        while(data>0){
            int rem=data%10;
            data=data/10;
            ans=ans*10+rem;

               
        }
        System.out.println("Reverse Number is:"+ans);
    }
    
}
