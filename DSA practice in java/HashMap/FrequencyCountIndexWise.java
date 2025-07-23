package HashMap;
import java.util.*;

public class FrequencyCountIndexWise {
    public static void main(String[] args) {
        int arr[]={2,3,2,3,5};
        int arr2[]=new int[4];

        Hashtable <Integer,Integer>map=new Hashtable<>();
        for(int num:arr){
            
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
    }
    
}
