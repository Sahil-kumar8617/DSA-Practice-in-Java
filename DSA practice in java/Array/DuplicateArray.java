import java.util.Scanner;
public class DuplicateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size=sc.nextInt();
        System.out.println("enter the array:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){  // loop for inserting the array one by one and storing it in arr[]
            arr[i]=sc.nextInt();
        }
        PrintDuplicateArrAY(arr,size);// function call 
    }
    public static void PrintDuplicateArrAY(int arr[],int size){
        int duplicate[]=new int[size]; // creating the different variable name duplicate and intitalizing same size .
        for(int i=0;i<=size-1;i++) // loop for pasting the values of arr[]into the variable duplicate[].
        {
            duplicate[i]=arr[i];
            System.out.println("duplicate array is :"+ duplicate[i]);
        }
        

    }
}
