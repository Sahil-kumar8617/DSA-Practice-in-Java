import java.util.*;
import java.util.Scanner;
public class Array_Input_output {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 2d array NO. of rows:");
        int row=sc.nextInt();
        System.out.println("enter the 2d array NO. of Column:");
        int Cols=sc.nextInt();

        int[][] number=new int[row][Cols];

        for(int i=0;i<row;i++){
            for(int j=0; j<Cols;j++){
                number[i][j]=sc.nextInt();
              
    
            }
        }

        // output 
         for(int i=0;i<row;i++){
            for(int j=0;j<Cols;j++){
            System.out.print(number[i][j]+ " ");
        }
        System.out.println();
    }
    sc.close();
    



    }
  
    
    





    
}
