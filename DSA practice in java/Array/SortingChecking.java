
public class SortingChecking {
    public static void main(String[] args) {
        int arr[]={9,8,10,6,8,5};
        CheckSorting(arr);

    }
    public static void CheckSorting(int arr[]){
        boolean descending=true;
        boolean ascending=true;
        for(int i=0;i< arr.length-1;i++){
           
                if(arr[i]>arr[i+1]){
                    
                    ascending=false;

                }
                
                if(arr[i]< arr[i+1]){
                    descending=false;
 
                 }
                 
            }

        if(ascending==true){
            System.out.println("ascending order");
        }
        else if( descending==true){
            System.out.println("descending order");
        }
        else{
            System.out.println(" not sorted");
        }
        }
    }

