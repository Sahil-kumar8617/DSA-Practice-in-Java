import java.util.ArrayList;
public class MergingTwoArralylist {
    public static void main(String[] args) {
        ArrayList<Integer> mylist=new ArrayList<Integer>(); // Arraylist 1
        mylist.add(5);
         mylist.add(6);
          mylist.add(8);
           mylist.add(7);

           ArrayList<Integer> mylist2=new ArrayList<Integer>(); // arraylist 2
           mylist.add(2);
         mylist.add(5);
          mylist.add(9);
           mylist.add(3);

           mylist.addAll(mylist2); // function to merge the two arraylist
           System.out.println(mylist);




    }
    
}
