package Problem;

import java.util.Scanner;

public class Swaping {
    public static void main(String[] args) {
        Swaping();
        
    }
    
    static void Swaping(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number:");
        int first=sc.nextInt();
        System.out.println("Enter second Number:");
        int second=sc.nextInt();
        int temp=first;
        first=second;
        second=temp;
        System.out.println("your first and second number:"+first );
        System.out.println("your first and second number:"+second );
    }
    
}
