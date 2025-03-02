import java.util.Scanner;
public class SumOfFirstLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int number=sc.nextInt();

        int sum=0,FirstDigit=0,LastDigit;
        LastDigit=number%10;
        FirstDigit=number;
        while(number>10){
            number=number/10;

        }
        FirstDigit=number;
        
        sum=FirstDigit + LastDigit;
        System.out.println(sum);

        
        
        
    }
    
}
