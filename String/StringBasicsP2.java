package String;
import java.util.*;
public class StringBasicsP2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String EnteredString=sc.next();
        // printUppercase(EnteredString);    // uppercase function call
        printLowercase(EnteredString);         // Lowercase function call
        
    }
    // public static void printUppercase(String EnteredString){             // to find upper case
    //     String convertedString=EnteredString.toUpperCase();
    //     System.out.println(convertedString);

    // }
    public static void printLowercase(String EnteredString){    // to find lower case
        String convertedString=EnteredString.toLowerCase();
        System.out.println(convertedString);

    }

    
}
