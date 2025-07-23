import java.util.ArrayList;
import java.util.Collections;
public class AscendingDescending {
    public static void main(String[] args) {
        ArrayList <Integer> mylist=new ArrayList <Integer>();
        mylist.add(4);
        mylist.add(3);
        mylist.add(7);
        mylist.add(2);

        Collections.sort(mylist.reversed());// function to arrange in reverse order / descending order 

        // Collections.sort(mylist); // method to arrange all the element in a ascending order 

        System.out.println(mylist);
    }
    
}
