package Array;
import java.util.*;
public class indexValue2DArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row:");
        int x=sc.nextInt();
        System.out.println("enter the column:");
        int y=sc.nextInt();
        int arr[][]=new int[x][y];
        //input
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("enter the element for index value:");
        int num=sc.nextInt();
        
        
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(arr[i][j]==num){
                    System.out.println("location of num:"+i+","+j);
                }
            }
            
        }


    

    }
}
