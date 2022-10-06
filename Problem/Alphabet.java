package Problem;

import java.util.Scanner;

public class Alphabet {
   public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter any alphabet:");
    char data=scn.next().trim().charAt(0);

    if(data>='a' && data<='z'){
        System.out.println("lowecase!");
    }else{
        System.out.println("uppercase!");

    }
   }
}
