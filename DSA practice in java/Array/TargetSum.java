import java.util.*;
public class TargetSum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15,12,10};
        int target=24;
        boolean SumTarget=false;
        // for two element Sum 
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if((arr[i]+arr[j])==target){
        //             SumTarget=true;
        //         }
        //     }
        // }
 

        // for three element sum 
        for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    for(int k=i+2;k<arr.length;k++){
                        if((arr[i]+arr[j]+arr[k])==target){

                            SumTarget=true;
                            // System.out.println(arr[i]);              if you want to print the numbers by adding which you got the target .
                            // System.out.println(arr[j]);
                            // System.out.println(arr[k]);
                        }

                    }
                    
                }
            }



        System.out.println(SumTarget);
       

        
    }
    
}
