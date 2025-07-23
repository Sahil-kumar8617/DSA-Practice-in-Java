import java.util.*;
public class InputOutput2 {
    public Double calculator(Double a,Double b){
        return a+b;
        
    }
    public static void main(String[] args) {
        InputOutput2 mycall=new InputOutput2();
        Scanner sc=new Scanner(System.in);
        Double a=0.0;
        Double b=0.0;
       

        try{
            
        System.out.println("enter A:");
        a=sc.nextDouble();
        System.out.println("enter B:");
          b=sc.nextDouble();

        }
        catch(NumberFormatException | InputMismatchException e){
            System.out.println("Wrong input");
            return;
        }
       
        
        Double result = mycall.calculator(a,b);
        System.out.println(result);
        






        
    }
    
}
