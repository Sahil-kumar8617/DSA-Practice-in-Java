import java.util.Scanner;
public class SumAndProduct {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array:");
    int size=sc.nextInt();

    System.out.println("enter the array:");
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }

    productArray(size,arr); // function call for  product array
    sumArray(arr, size);    // function call for sum array 

   }
     // function for product array 
   public static void productArray(int size,int arr[]){
    int duplicateProductArray[]=new int[size];

    for(int i=0;i<size;i++){ // for loop to copy the element the of arr to duplicate product array 
        duplicateProductArray[i]=arr[i];

    }
    int product=1;
    for(int i=0;i<size;i++){ // loop for calculating product one by one using the index value 
        product=product*duplicateProductArray[i];
    }
    System.out.println("Product  of all the element of array :"+product);

   }

  // creating the function for sum array
   public static void sumArray(int arr[],int size){
    int duplicateSumArray[]=new int[size];
    for(int i=0;i<size;i++){ // for loop to copy the element the of arr to duplicate sum array 
        duplicateSumArray[i]=arr[i];

    }
    int Sum=0;
    for(int i=0;i<size;i++){
       Sum=Sum+duplicateSumArray[i];    // loop for calculating sum  one by one using the index value
    }
    System.out.println("sum of all the element of array :"+Sum);

   }
}
