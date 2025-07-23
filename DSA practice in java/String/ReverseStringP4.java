package String;
import java.util.*;
public class ReverseStringP4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String input=sc.nextLine();
        revString(input);

    
    }
    public static void revString(String input){
        String reversed="" ;
       for(int i=input.length()-1;i>=0;i--){
        reversed=reversed+input.charAt(i);

        
       }
       System.out.println(reversed);
    }
   
    
}
