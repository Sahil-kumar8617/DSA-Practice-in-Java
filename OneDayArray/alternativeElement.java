import java.util.*;
public class alternativeElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int alternativeElement[]=new int[(arr.length+1)/2];
        int j=0;
        for(int i=0;i<arr.length;i=i+2){
            alternativeElement[j]=arr[i];
            j++;
            
            


        }
        System.out.println(Arrays.toString(alternativeElement));
    }
    
}
