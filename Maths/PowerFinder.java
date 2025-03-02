import java.util.Scanner;
public class PowerFinder {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base:");
        int base=sc.nextInt();
        System.out.println("enter the exponent:");
        int exponent =sc.nextInt();
        Power(exponent);




        
    }
    public static void Power(int exponent){
        for(int i=0;i<=exponent;i++){
            if(i==exponent){
              System.out.println("the exponent is : "+i);
            }

        }

    }
}
