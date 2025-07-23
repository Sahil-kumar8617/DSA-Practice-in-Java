package Array;

import javax.sound.midi.Soundbank;

public class MinimumCommonValue {
    public static void main(String args[]){
        int arr1[]={2,3,5,6,7,854,894};
        int arr2[]={3,6,7,9,13,23,34};
        int num=arr1[0];
        int num2=arr2[0];
        int minivalue=0;
        int arr[] = new int[2];
        for(int i=1;i<arr1.length;i++){
            for(int j=1;j<arr2.length;j++){
               if(arr1[i]==arr2[j]){
                minivalue=arr[i];
                break;
               }

               }
               
            }
          
        }
        
        
       

    }
    
}
