package HashMap;
import java.util.*;
import java.util.HashMap;

public class InsertAndRetrieve {
    public static void main(String[] args) {    

      // simple insertion and retrieve of data from hashtable
             
      Hashtable<String ,String> hashtable=new Hashtable <> ();

      hashtable.put("A","Apple"); 
      hashtable.put("B","Ball");
      hashtable.put("C","Cherry");
      hashtable.put("D","Dog");

      System.out.println(hashtable.get("C"));


      

    }
    
}
