package Array;

public class AvrageArrayValue {
    public static void main(String args[]){
        int arr[]={5,3,7,4,3,6};
        int sum=0;
        int  average=0;
        int length=arr.length;
        for(int i=0;i<length;i++){
            sum=sum+arr[i];
              average=sum/length;
        }
        System.out.println(average);

    }
}
