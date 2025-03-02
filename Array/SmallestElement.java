public class SmallestElement {
    public static void main(String[] args) {
        int arr[]={2,5,11,15,6,1,4,3};
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println(smallest);
    }
    
}
