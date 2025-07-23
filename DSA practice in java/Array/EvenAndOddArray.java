import java.util.Scanner;
public class EvenAndOddArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:"); // to  enter the size
        int size=sc.nextInt();

        System.out.println("enter the element of array:");
        int arr[]=new int[size];   // entering array in the variable arr[]
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        duplicateArray(arr,size);
    }

    public static void duplicateArray( int arr[] , int size){
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                evencount++;
            }
            

        }
        oddcount=size-evencount;

       
        int EvenDuplicate[]=new int[evencount];
        for(int i=0;i<=evencount;i++){
            if(arr[i]%2==0){
                EvenDuplicate[i]=arr[i];
               

            }
            System.out.println("the even array"+ EvenDuplicate[i]);

        }
        int OddDuplicate[]=new int[oddcount];
        for(int i=0;i<oddcount;i++){
            if(arr[i]%2!=0){
                OddDuplicate[i]=arr[i];
               
            }
            System.out.println("the odd array:" +OddDuplicate[i]);
        }




    }



    
}
