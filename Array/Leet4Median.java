import java.util.*;
public class Leet4Median {
    public static void main(String[] args) {
        int arr1[]={1,3};
        int arr2[]={2};
        
    
        Median(arr1,arr2);
        
    }
    public static void Median(int arr1[],int arr2[]){
        int mergeArr[]=new int[arr1.length + arr2.length]; // creating new array where merged element will get store 

        int i=0,j=0,k=0; // intializing variable i for arr1, j for arr2 , k for merge array

        while(i< arr1.length && j < arr2.length){
            if(arr1[i]<arr2[j]){
                mergeArr[k++]= arr1[i++];

            }
            else{
                mergeArr[k++]=arr2[j++];
            }
           
        }
// for remaining element 
        while(i< arr1.length){
            mergeArr[k++]=arr1[i++];
        }
        while(j< arr2.length){
            mergeArr[k++]=arr2[j++];
        }
           
        int solution = mergeArr.length / 2;
        double median;

      //  System.out.println(Arrays.toString(mergeArr));
      if(mergeArr.length % 2==0){
        solution = mergeArr.length /2;
        median=mergeArr[solution-1];

      }
      else{
        median=mergeArr[solution];
      }

        
        
    System.out.println(median);
    }
    
}
