import java.util.Scanner;
import java.util.*;
public class Second_largest {
    public static void main(String[] args) {
        int arr[]={3,5,2,5,67,75};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        

        
        SecondLargest(arr, min);

    }
    public static void SecondLargest(int arr[],int min){
        int largest=min;
        int SecondLargest=min;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                SecondLargest=largest;
                largest=arr[i];
            }
        }


        System.out.println(" second largest:" +SecondLargest); 

    }
    
}
