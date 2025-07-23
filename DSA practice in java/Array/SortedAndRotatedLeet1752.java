import java.util.*;
class SortedAndRotatedLeet1752{
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5};
        int breakCount=0;
        CheckSorting(arr,breakCount);
        
    }
    public static void CheckSorting(int arr[],int breakCount){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                breakCount++;
            }
        }
        if(breakCount>1){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }

    }

}