package Array;

import java.util.Scanner;

public class FindArrayMatrixValue{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Size of rows and cols:");
        int rows=scn.nextInt();
        int cols=scn.nextInt();
        
        int[][] numbers=new int[rows][cols];
        
        System.out.println("Enter rows and cols value:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=scn.nextInt();
            }
        }
        
        System.out.println("Your Which index value you want find:");
        int x=scn.nextInt();
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){
                    System.out.println("Your value find at index number("+i+","+j+")");
                }
            }
            System.out.println();
            
        }

        System.out.println("Pattern format:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               
                    System.out.print("*" +" ");
                
            }
            System.out.println();
            
        }

    }
    
}
