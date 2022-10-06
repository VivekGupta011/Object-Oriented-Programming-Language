package Problem;

import java.util.Scanner;

public class SeriesFibonacci {
   public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter Term number:");
    int data=scn.nextInt();
    int a=0,b=1,c,term;
    for(int i=1;i<=data;i++){
        System.out.println(a+"");
        c=a+b;
        a=b;
        b=c;
    }


   
   



    
   }
}
