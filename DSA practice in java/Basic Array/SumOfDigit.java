package Array;

public class SumOfDigit {
    public static void sumofdigit(int number ,int sum ){
        if(number==0){
            System.out.println("the sum of digit is: "+sum);
        }
        number=number%10;
        sum=sum+number;
        
        number=number/10;

    }
    public static void main(String args[]){
        int number=12345;
        sumofdigit(number,0);

    }
}
