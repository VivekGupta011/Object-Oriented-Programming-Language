package Method;

import java.util.Scanner;

public class SumOfAllOdd {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int firstNum=1;
        System.out.println("Enter the terms:");
        int secondNum=scn.nextInt();
        OddNum(secondNum);
        
    }
    
    static public int OddNum(int secondNum){
        int count=0;
        for(int i=1;i<=secondNum;i++){
            if((i % 2) !=0){
                count=count+i;
                System.out.println("odd num:"+i);
               
            }
        }
        System.out.println("Sum of odd number:"+count);
        return count;
    }
    
}
