// input and output  exception handling 
import java.io.FileNotFoundException;
import java.util.*;
class InputOutput{
    public int calculator(int a,int b){
        int sum=a+b;
        return sum ;
    }
    public static void main(String[] args) {
        InputOutput mycall=new InputOutput();
        int result=0;
        try {
            result=mycall.calculator((int)444.4,5);
        }

        catch(ArithmeticException e){
            System.out.println("airthmatic exception");

        }
        
    System.out.println(result);
        
        }

    }
