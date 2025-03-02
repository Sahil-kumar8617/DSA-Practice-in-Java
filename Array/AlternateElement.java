import java.util.Scanner;
class AlternateElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size=sc.nextInt();
        System.out.println("enter the array:");        int arr[]= new int[size];
      
        for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
          
            

        }
        
        

        PrintAlternateElement( arr);

    }
    public static void PrintAlternateElement(int arr[]){
        for(int i=0;i<=arr.length;i+=2){
            System.out.print( arr[i]);

        }
        System.out.println(" ");

    }
}