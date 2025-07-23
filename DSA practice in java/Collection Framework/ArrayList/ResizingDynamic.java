// Q1. ArrayList vs Array
// Explain and demonstrate with code how ArrayList handles dynamic resizing compared to traditional arrays.
//  Also show how time complexity is affected while adding 10,000 elements.
// 📚 Concepts Covered: Dynamic resizing, internal working, performance


                          //**** First part**** */

import java.util.ArrayList;
public class ResizingDynamic {

    //   ✅ What This Proves:
                          // Java's ArrayList automatically resizes itself when the number of elements exceeds the initial capacity.

                          // Internally, the array size is doubled (approximately) when it exceeds capacity, so this proves dynamic 
                          //resizing works as expected.


    public static void main(String[] args) {
        // ArrayList <Integer>mylist=new ArrayList <Integer>(5);
        // mylist.add(5);
        // mylist.add(6);
        // mylist.add(7);
        // mylist.add(8);
        // mylist.add(9);
        // mylist.add(2);
        // System.out.println(mylist);


                                   // *** 2nd Part*******

                                   // here internal working of the program is being shown . 

               ArrayList <Integer>mylist=new ArrayList <Integer>();
               long StartTime=System.nanoTime();
               for(int i=0;i<10000;i++){
                mylist.add(i);
               }
               long EndTime=System.nanoTime();

               System.out.println("Added all the 10000 element in the mylist ");
               System.out.println("Final size:"+mylist.size());
               System.out.println("Total time taken :"+ (EndTime-StartTime));



    }
    
}
 

                                        

    