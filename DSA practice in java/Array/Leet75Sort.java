import java.util.*;
public class Leet75Sort {
    public static void main(String[] args) {
        int arr[]={2,0,1,1,0,2};
        int tempArray[]=new int[arr.length];
        sorting(arr,tempArray);
        System.out.println(Arrays.toString(tempArray));
        
    }
    public static void sorting(int arr[], int tempArray[]){
        int count0=0;
        int count1=0;
        int count2=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
                count1 ++;
            }
            else{
                count2++;
            }
        }

        int index=0;

        for(int i=0;i<count0;i++){
            tempArray[index]=0;
            index++;
        }
        for(int i=0;i<count1;i++){
            tempArray[index]=1;
            index++;
        }
        for(int i=0;i<count2;i++){
            tempArray[index]=2;
            index++;
        }



    }
    
    
}
