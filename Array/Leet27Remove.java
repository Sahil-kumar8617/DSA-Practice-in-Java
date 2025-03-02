import java.util.*;
public class Leet27Remove {
    public static void main(String[] args) {
        int num[]={5,2,5,2,5,9,5,7,3,4};
        int val=5;
        removeElement(num,val);
    }
    public static void removeElement(int num[],int val){
        int index=0;
        int k=0;
        for(int i:num){
            if(num[i]!=val){
                num[index]=num[i];
                index++;
                k++;
            }

        }
        System.out.println(k);
        System.out.println(Arrays.toString(num));

    }
    
}
