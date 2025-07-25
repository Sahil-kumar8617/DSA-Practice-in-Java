import java.util.Stack;
class BalancedParentheses{

    public static Boolean isBalanceCheck(String input){ // parameter to fecth the input
        Stack <Character>mystack=new Stack<>();
        for(char ch:input.toCharArray()){// created for each loop to  convert the String input to character in an array and trasverse through the ch.
            if(ch=='{'||ch=='['||ch=='('){
                mystack.push(ch); // if any of the above paranthesis has been found then they will get push means insert in stack one by one .

                
            }
            else if(ch==')'||ch==']'||ch=='}'){ // it will check if these parantheses can be found so check is stack is empty or not if empty return false.

                if(mystack.isEmpty()){
                      return false;
                }
                char top=mystack.pop();
                if(ch==')'&& top !='('||
                ch==']'&& top !='['||
                ch=='}'&& top !='{'){
                    return false;
                }
                   
                

            }

        }
        return mystack.isEmpty();
    }




    public static void main(String[] args) {
        String input="{[(]}";
        System.out.println("isBalanced : " + isBalanceCheck( input));
        
        
    }

}