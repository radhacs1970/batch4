import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx1 {
  public static void main ( String[] args ){
    TreeSet<String> myFruits = new TreeSet<String>(); 
      myFruits.add("Banana");
      myFruits.add("Apple");
      myFruits.add("Orange");
      myFruits.add("Grape");
      myFruits.add("Mango");
      myFruits.add("StrawBerry");
      myFruits.add("Pomogrenate");

      //myFruits.add(null); // throws nullpointer exception

     // creating iterator
      Iterator<String> iterator;
      iterator = myFruits.iterator();

      //Displaying the tree set data
      System.out.println("Tree set data: ");     
      while (iterator.hasNext()) {
        System.out.print(iterator.next() + " ");
      }
      System.out.println();

      NavigableSet<String>  ns = myFruits.descendingSet();
      System.out.println( ns );

      SortedSet<String>  hs = (SortedSet<String>) myFruits.headSet("Mango");
      System.out.println(hs );

      SortedSet<String>  ts = (SortedSet<String>) myFruits.tailSet("Mango");
      System.out.println(ts );


      TreeSet<Mobile> tm = new TreeSet<Mobile>();

      tm.add( new Mobile("Poco"));
      tm.add( new Mobile("Lg"));
      tm.add( new Mobile("Samsung"));
      tm.add( new Mobile("IPhone"));

      System.out.println( tm );

      boolean flag = tm.add( new Mobile("Lg"));
      System.out.println( "retval " + flag );

    }
  }