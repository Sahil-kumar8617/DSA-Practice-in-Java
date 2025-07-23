import java.util.*;
public class ReverseArray {
    public static void reverse(int num[]){
        int tempArr[]=new int[num.length];
        int index=num.length-1;

        for(int i=0;i<num.length;i++){
            tempArr[index]=num[i];
            index--;
            
            
        }
        System.out.println(Arrays.toString(tempArr));

    }
    public static void main(String[] args) {
        
        int num[]={1,2,3,4,5,6,7,8};

        
        reverse(num);
  



       

        
        
    }
}
