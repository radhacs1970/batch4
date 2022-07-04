import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
  public static void main ( String[] args){
    // let us try with mobile object

    // TreeMap keys are sorted.
    TreeMap<Integer, Mobile> tm =
        new TreeMap<Integer, Mobile>(); 

    tm.put(100, new Mobile("poco"));
    tm.put(200, new Mobile("samsung"));
    tm.put(50, new Mobile("iPhone"));
    tm.put( 120, new Mobile("lg"));
    tm.put( 130, new Mobile("vivo"));

    System.out.println(tm);

    // Using EntrySet
    Set  es = tm.entrySet();
    Iterator  it2 = es.iterator();
    while( it2.hasNext() ){
      Map.Entry me =(Map.Entry)it2.next();
      System.out.println(" Key is " + me.getKey() +
                             " | Value is -  " + me.getValue() );
    }

  }
}