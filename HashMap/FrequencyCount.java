package HashMap;
import java.util.*;
public class FrequencyCount {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array for checking no. of frequency:");
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }
        Hashtable<Integer,Integer> hashtable=new Hashtable<>();
        for(int num: arr){
            hashtable.put(num,hashtable.getOrDefault(num,0)+1);
        }
        System.out.println(hashtable);
        
        
    }
   
       

       

        
    
    

    
}
