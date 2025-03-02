package String;

public class StringLengthP3 {
    public static void main(String[] args) {
        String name="sahil";
        int length=0;
        for(int i:name.toCharArray()){  // printing the length of the array without using length keyword 
            length++;
        }
       System.out.println(length);
    }
}
