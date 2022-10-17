package Array;

import java.util.Scanner;

import LinearSearch.CheckElement;

public class FindElement {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        System.out.println("Enter rows:");
        int row=Input.nextInt();
        System.out.println("Enter cols:");
        int cols=Input.nextInt();
        int[][] Array=new int[row][cols];
        int max=0;
        int min=Array[0][1];
        CheckArrayElement(Array,row,cols,Input,max,min);
        
        
        
        
        
    }
    
    
    public static int[][] CheckArrayElement(int[][] Array,int row,int cols,Scanner inpuScanner,int max,int min){
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                Array[i][j]=inpuScanner.nextInt();
            }
            
        }
        System.out.println("Your matrix data:");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
            
        }
        System.out.println("Your highest matrix data is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(Array[i][j]>max){
                    max=Array[i][j];
                }
                
            }
            
            
        }
        System.out.println("Your lowest matrix data is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(Array[i][j]<min){
                    min=Array[i][j];
                }
                
            }
            
            
        }
        
        System.out.println("your highest matrix value is:"+max);
        System.out.println("your lowest matrix value is:"+min);
        return Array;

    }

}
