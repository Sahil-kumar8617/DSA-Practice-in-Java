import java.util.*;
public class RotatingArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};   // array which has to be rotated
       int n=arr.length;
        int shifting=3; // how many places has to shift
        int tempArray[]=new int[n];  // new temperorary array to store to array element

        for(int i=0;i<n;i++){       
            tempArray[(i+shifting)%n]=arr[i]; // in tempArray i will be added to 2 which is a shifting value then sum of those will be modulas and ans will be single digit 0-9 and this whole formula will change the location of the element of array element.
        }

       
        System.out.println(Arrays.toString(tempArray));
     
        
    }
    
    
}
