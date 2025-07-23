import java.util.*;
public class targetCount {
    public static void main(String[] args) {
        int arr[]={3,5,2,5,5,3,5,2,5,4,62,5,2};
        int target =5;
        calculateTarget(arr,target);
    }
    public static void calculateTarget(int arr[],int target){
        int count=0;
        for(int i:arr){
            if(i==target){
                count++;
            }

        }
        System.out.println(count);


    }
    
}
