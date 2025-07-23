import java.util.ArrayList;
import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the size of arraylist:");
        int size=sc.nextInt();

        ArrayList<Integer> mylist=new ArrayList<Integer>(size);

        for(int i=0;i<size;i++){
            System.out.println("enter the element into mylist:");
            int element=sc.nextInt();
            mylist.add(element);
        }
        System.out.println(mylist);


    }
    
}
