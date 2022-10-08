package Method;

import java.util.Scanner;

public class PositiveNegativeZro {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        char choice;
        
        
        int countPositive=0,countNegative=0,countZero=0;
        int sum=0;
        do{
            System.out.println("Enter a number:");
            int firstNum=scn.nextInt();
            if(firstNum>0){
                countPositive++;
            }
            else if(firstNum<0){
                countNegative++;
            }else{
                countZero++;
            }
            System.out.println("Do you want to Continue y/n?");
            choice=scn.next().trim().charAt(0);
    
    
        }while(choice=='Y' || choice=='y');

        System.out.println("Positive count:"+countPositive);
        System.out.println("Positive count:"+countNegative);
        System.out.println("Positive count:"+countZero);
    }
    
    
    

}
