public class LargestElement {
    public static void main(String[] args) {
        int arr[]={2,7,11,15,9,4};
        int largest=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            

        }
        System.out.println(largest);

        
    }
}
