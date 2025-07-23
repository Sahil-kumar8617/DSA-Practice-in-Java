import java.util.*;
public class OddAndEven {
    public static void main(String[] args) {
        int originalArr[]={2,3,4,5,6,7,8};
        
        EvenOdd(originalArr); // function call 

        
    }
    public static void EvenOdd(int originalArr[]){
        int EvenCount=0;
        int OddCount=0;
        for(int i:originalArr){
            if((i%2)==0){
                
                EvenCount++;
             
            }else{
                
                OddCount++;
               
            }
        }
        int EvenArr[]=new int[EvenCount];
        int OddArr[]=new int[OddCount];

        int h=0;
        int j=0;

        for(int i:originalArr){
            if(i%2==0){
                EvenArr[h++]=i;
             
            }
            else{
                OddArr[j++]=i;
               
            }
        }


        System.out.println("Even Array :"+Arrays.toString(EvenArr));
        System.out.println(" Odd Array:"+Arrays.toString(OddArr));


    }

    
}
