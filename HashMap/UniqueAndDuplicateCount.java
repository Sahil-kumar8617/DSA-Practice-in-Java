package HashMap;
import java.util.*;

public class UniqueAndDuplicateCount {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,4,5};
        int uniqueElement=0;
        int duplicateElement=0;
        CountValues(uniqueElement,duplicateElement,arr);

        

    }
    public static void CountValues(int uniqueElement,int duplicateElement,int arr[]){
        Hashtable<Integer,Integer>map=new Hashtable<>();  // creating hashtable of key(integer):value(integer) with the map function

        for(int num:arr){ // loop for checking the num variable exist or not if exist increment the value by 1, if do not exist so adding +1 to the default value 0.
            map.put(num,map.getOrDefault(num,0)+1);
           

        }
       for(int frequency: map.values()){  // loop which intialise frequency variable to go through the map values one by one 
        if( frequency==1){ // if frequency of number is 1 means number is not repeated so it will count it only once ;
            uniqueElement++;
        }
        else if(frequency !=1){ // if number of frequency is greater than 1 means it is repeated so duplicate element will be increase
            duplicateElement++;
        }

       }

    
        System.out.println(map); // to print the all key values after checking frequency which key is repeated how many times 
        System.out.println("unique:"+uniqueElement); 
        System.out.println("duplicate:"+duplicateElement);
    }
    
}
