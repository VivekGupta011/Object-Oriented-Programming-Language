package Problem;

import java.util.Scanner;

public class CountingOccurrences {
   /**
    * @param args
    */
   public static void main(String[] args){
    Scanner scn = new Scanner(System.in) ;
      System.out.println("Enter any Number:");
       int data=scn.nextInt();
       System.out.println("Iteration Number:");
       int Iteration=scn.nextInt();
      int count=0;
      while(data>0){
         int rem=data%10;
         if(rem==Iteration){
            count++;
         }
         data=data/10;
      }
       System.out.println("Number is :"+count);
   }
}
