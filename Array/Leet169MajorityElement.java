import java.util.*;
public class Leet169MajorityElement {
    public static void main(String[] args) {
        int n=5;
        int Element=0;
        int arr[]={2,2,1,1,2};
        Element =majorityElement(arr,n,Element);
        System.out.println(Element);
        
    }
    public static int majorityElement(int arr[],int n,int Element){
       
        Hashtable <Integer,Integer>map=new Hashtable<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0 )+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                Element = entry.getKey();
                break;
            }
        }
      
       return Element;

    }
}
