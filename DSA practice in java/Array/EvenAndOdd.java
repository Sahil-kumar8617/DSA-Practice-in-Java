import java.util.Scanner;
public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();
        System.out.println("enter the array:");
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
         OddEvenArray(arr,size);

    }

    public static void OddEvenArray(int arr[] , int size){
        int even_count=0, odd_count=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==00){
                even_count++;
            }
            else{
                odd_count++;
            }

        }

        int even_duplicate[]=new int[even_count];
        int odd_duplicate[]=new int [odd_count];
        int even_index=0,odd_index=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                even_duplicate[even_index++]=arr[i];

            }else if(arr[i]%1==0){
                odd_duplicate[odd_index++]=arr[i];
            }

        }

        System.out.println("printing the even element:");
        for(int i=0;i<even_count;i++){
            System.out.println(even_duplicate[i]);
        }


        System.out.println("printing the odd element:");
        for(int i=0;i<odd_count;i++){
            System.out.println(odd_duplicate[i]);
        }
    }
    
}
