package Array;

public class MaxMiniNoOfArray {
    public static void main(String args[]){
        int arr[]={5,7,7,2,77,9,8,};
        int min=arr[0];
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                System.out.println("the minimum element of an array is :"+min);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
               
            }
            
        }
        System.out.println("the maximum  element of an array is :"+max);
       
    }
}
