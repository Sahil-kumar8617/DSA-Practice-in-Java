import java.util.Scanner;
public class ProductOfAllDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number;");
        int number =sc.nextInt();

        int product=1,digit=0;
        digit=number;
        
        while(number>10){
            number=number%10; // if number is 12345 so 5 will be the first outcome .
            product=product*number; // 5*1=5.
            digit=digit/10; // 12345/10=1234.
            number=digit; // now value 1234 which is new generated will go to number value and it will get change.
        }
        if(number<10){
            product=product*number;
            System.out.println(product);
        }
        

        
    }
    
}
