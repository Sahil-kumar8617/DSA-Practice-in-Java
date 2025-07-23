package Array;
import java.util.*;
public class SumOFArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();

        System.out.println("enter the number to add:");
        int array[]=new int[size];

        int sum=0;
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
            sum=sum+array[i];
        }

        
       System.out.println(sum);
    }
    
    
}
