package fundamental;

import java.util.Scanner;

public class PrimeOrNott {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number:");
        int user=sc.nextInt();
        int init;
        for(init=1;init<user;init++){
            if(user==1){
            System.out.println("1 number is exceptional!");
            
        }else if(user%init==0){
            System.out.println("This is prime number:"+user);
            
        }else{
            System.out.println("This is not prime number:"+user);

        }
       }
    }
    
}
