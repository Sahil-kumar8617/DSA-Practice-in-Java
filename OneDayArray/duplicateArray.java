import java.util.*;

public class duplicateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the array:");
            arr[i]=sc.nextInt();
        }
        duplicate(size,arr);
        
    }
    public static void duplicate(int size,int arr[]){
        int arr2[]=new int[size];
        for(int i=0;i<size;i++){
            arr2[i]=arr[i];
            
        }
        System.out.println(Arrays.toString(arr2));
    }
    
}
