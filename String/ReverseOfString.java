package String;
import java.io.*;
import java.util.*;

public class ReverseOfString {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String CheckPalindrome="";
        char ch;
        for(int i=A.length()-1;i>=0;i--){
            ch=A.charAt(i);
            CheckPalindrome=CheckPalindrome+ch;
            System.out.println("String is:"+CheckPalindrome);
            
        }
        if(CheckPalindrome.equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");

        }
        
        
    }
}



