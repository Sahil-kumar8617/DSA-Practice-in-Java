import java .util.*;
public class reverse {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};

        int reverseArr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            reverseArr[i]=arr[arr.length-1-i];
            
        }
        System.out.println(Arrays.toString(reverseArr));

        
    }
    

}
