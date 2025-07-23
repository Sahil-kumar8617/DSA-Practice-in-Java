package Array;

public class CommonValue {
    public static void main(String args[]){
        int arr1[]={3,6,7,8,9};
        int arr2[]={2,3,5,7,8};
        boolean found=false;
        for(int i=0;i<arr1.length && !found;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    found=true;
                    break;
                    
                }
            
            }
        } 
    }
}
