import java.util.Stack;
public class StringReverse {
    public static void main(String[] args) {
      String str= "sahil";
      Stack<Character> mystack=new Stack<>();
      
      for(int i=0;i<str.length();i++){
        mystack.push(str.charAt(i));
      }

      String reverse="";
      while(!mystack.isEmpty()){
        reverse=reverse + mystack.pop();
      }
      System.out.println(str);
      
      System.out.println(reverse);
      
      


    }
    
}
