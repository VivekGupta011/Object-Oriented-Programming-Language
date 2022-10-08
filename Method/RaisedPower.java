package Method;

import java.util.Scanner;

public class RaisedPower {
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter first value:");
        int firstNum=scn.nextInt();
        System.out.println("Enter second value:");
        int secondNum=scn.nextInt();
        RaisedPow(firstNum, secondNum);

        
    }

    public static int RaisedPow(int a,int b){
        int power=(int) Math.pow(a, b);
        System.out.println("Power:"+a+" "+b+":"+power);
        return power;

    }


    
}
