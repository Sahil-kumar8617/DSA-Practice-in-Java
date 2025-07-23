import java.util.Scanner;
public class CountingTarget {
    public static void main(String[] args) {
        int arr[]={3,4,5,2,4,2,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the target:");
        int target=sc.nextInt();
        TargetCounter(arr,target);

    }
    public static void TargetCounter(int arr[],int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                count++;

            }
           

            
        }
        System.out.println("the target is repeated: " +count + " times");


    }
    
}
