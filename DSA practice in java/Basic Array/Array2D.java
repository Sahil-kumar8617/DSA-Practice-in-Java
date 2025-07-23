package Array;
import java.util.*;
public class Array2D {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the rows size:");
    int x=sc.nextInt();
    System.out.println("enter the column size:");
    int y=sc.nextInt();
    int arr[][]=new int[x][y];
    for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
            System.out.println(" elements:");
            arr[i][j]=sc.nextInt();
        }
        
    }
    for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }
    

    
    }
    
}
