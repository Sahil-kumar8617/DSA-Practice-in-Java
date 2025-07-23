package Array;
import java.util.*;
public class IndexValueArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
       int size=sc.nextInt();
      int number[]=new int[size];
      //input
      for(int i=0;i<size;i++){
       number[i]=sc.nextInt();
      }
      System.out.println("enter the x");
      int x=sc.nextInt();
      //output
      for(int i=0;i<number.length;i++){
        if(x==number[i]){
            System.out.println(i);
        }
        
      }


    }
}
