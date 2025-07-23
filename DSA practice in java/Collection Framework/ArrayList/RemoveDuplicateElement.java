import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;
public class RemoveDuplicateElement {
    public static void main(String[] args) {
        ArrayList <Integer> mylist=new ArrayList<Integer>(); // new arraylist has been created 
        mylist.add(4);// insertion of elements 
        mylist.add(3);
        mylist.add(7);
        mylist.add(9);
        mylist.add(4);
        mylist.add(9);

        HashSet <Integer> myset=new HashSet<Integer>(); // hashset is created which is used to remove all the duplicate element 
         myset.addAll(mylist); // function which insert all the element in one go 




        System.out.println(myset);
    }
    
}
