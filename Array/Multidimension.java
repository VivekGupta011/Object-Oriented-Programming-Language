package Array;

import java.util.Scanner;

public class Multidimension {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Size of rows and cols:");
        int rows=scn.nextInt();
        int cols=scn.nextInt();

        int[][] numbers=new int[rows][cols];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=scn.nextInt();
            }
        }
        
        System.out.println("Your matrix data:");
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
            
        }

    }
    
}
