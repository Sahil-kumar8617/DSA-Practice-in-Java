import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int input =sc.nextInt();
        int num=input;//121
        int reverse=0;
       
            while(num>0){
                reverse=(reverse*10)+(num%10);
                num=num/10;
            }
           
        
        if(input==reverse){
            System.out.println("no. is palindrome");
        }else{
            System.out.println("no. is not palindrome");
        }
        
       } 
    }
    
        


        
    

